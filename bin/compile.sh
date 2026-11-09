#!/usr/bin/env bash
set -euo pipefail

kotlin_home=${KOTLIN_HOME:-$(cd -- "$(dirname -- "$(command -v kotlinc)")/.." && pwd)}
compiler_args=("$@")
jvm_args=(
    -Xms32m -Xmx256m -XX:TieredStopAtLevel=1 -XX:+UseSerialGC
    --enable-native-access=ALL-UNNAMED --sun-misc-unsafe-memory-access=allow
)

# The AOT cache remembers the exact classpath order. A "lib/*" wildcard follows
# the directory order of the filesystem, which differs between the build host
# and the platform, so the jars are listed explicitly in a sorted order.
compiler_jars=$(LC_ALL=C; printf '%s:' "$kotlin_home"/lib/*.jar)
compiler_jars=${compiler_jars%:}

if [[ -n ${KOTLIN_AOT_CACHE_OUTPUT:-} ]]; then
    jvm_args+=("-XX:AOTCacheOutput=$KOTLIN_AOT_CACHE_OUTPUT")
elif [[ -n ${KOTLIN_AOT_CACHE:-} ]]; then
    # auto: a stale cache costs startup time instead of failing every submission.
    jvm_args+=("-XX:AOTCache=$KOTLIN_AOT_CACHE" -XX:AOTMode=auto)
fi

if [[ -n ${KOTLIN_FAST_CLASSPATH:-} ]]; then
    found_classpath=false
    for ((index = 0; index < ${#compiler_args[@]}; index++)); do
        if [[ ${compiler_args[index]} == -classpath || ${compiler_args[index]} == -cp ]]; then
            compiler_args[index + 1]="${compiler_args[index + 1]}:$KOTLIN_FAST_CLASSPATH"
            found_classpath=true
        fi
    done
    if [[ $found_classpath == false ]]; then
        compiler_args+=(-classpath "$KOTLIN_FAST_CLASSPATH")
    fi
    compiler_args+=(-no-jdk -no-stdlib -no-reflect)
fi

# One-shot compilation benefits from C1 without the cost of higher JIT tiers.
exec "${JAVA_BIN:-java}" \
    "${jvm_args[@]}" \
    -cp "$compiler_jars" \
    org.jetbrains.kotlin.cli.jvm.K2JVMCompiler \
    -kotlin-home "$kotlin_home" "${compiler_args[@]}"
