package exercise

// BEGIN
import units.distance.format as formatDistance
import units.duration.format as formatDuration

fun measurementLabel(value: Int): String = "${formatDistance(value)} | ${formatDuration(value)}"
// END
