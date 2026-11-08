class Notification {
    var title: String = ""
    var message: String = ""
    var urgent: Boolean = false
}

fun createNotification(
    title: String,
    message: String,
    urgent: Boolean,
): Notification {
    // BEGIN
    return Notification().apply {
        this.title = title.trim()
        this.message = message.trim()
        this.urgent = urgent
    }
    // END
}
