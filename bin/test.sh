#!/usr/bin/env bash
set -euo pipefail

test_bin_dir=$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)
course_dir=$(cd -- "$test_bin_dir/.." && pwd)
compiler=${KOTLINC_BIN:-$test_bin_dir/compile.sh}
java_bin=${JAVA_BIN:-java}
kotlin_home=${KOTLIN_HOME:-$(cd -- "$(dirname -- "$(command -v kotlinc)")/.." && pwd)}
build_root=${BUILD_PATH:-${TMPDIR:-/tmp}/code-basics-kotlin}
lesson_key=$(basename -- "$(dirname -- "$PWD")")-$(basename -- "$PWD")
lesson_build="$build_root/$lesson_key"

# Resolve the tests against this submission, including its actual JVM layout.
rm -rf -- "$lesson_build"
mkdir -p -- "$lesson_build"
sources=(Main.kt "$course_dir/lib/TestSupport.kt" Test.kt)
if [[ -d support ]]; then
    while IFS= read -r -d '' source_file; do
        sources+=("$source_file")
    done < <(find support -type f -name '*.kt' -print0)
fi

"$compiler" "${sources[@]}" -jvm-target 25 -d "$lesson_build"
exec "$java_bin" -cp "$lesson_build:$kotlin_home/lib/kotlin-stdlib.jar" Test
