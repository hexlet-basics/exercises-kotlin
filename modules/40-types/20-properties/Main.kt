// BEGIN
class StepCounter(
    start: Int,
) {
    var value: Int = start
        private set

    init {
        if (value < 0) {
            value = 0
        }
    }

    val doubled: Int
        get() = value * 2

    fun advance(steps: Int) {
        if (steps > 0) {
            value = value + steps
        }
    }
}
// END
