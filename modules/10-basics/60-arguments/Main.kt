// BEGIN
fun makeSignature(
    name: String,
    role: String = "member",
    prefix: String = "@",
): String = "$prefix$name [$role]"
// END
