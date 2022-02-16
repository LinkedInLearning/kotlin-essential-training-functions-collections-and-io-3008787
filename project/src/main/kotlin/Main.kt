
fun getMessage(input: Int) = if (input > 3) {
        "Greater than 3"
    } else {
        "Not greater than 3"
    }

fun getMessageWithWhen(input: Int) = when (input) {
    3 -> "Value is 3"
    else -> "Value is not 3"
}


fun main() {
    var someVariable = 0
    val message = when (someVariable) {
        3 -> "The value is 3"
        else -> "The value is not 3"
    }
}