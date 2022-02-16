

fun main() {
    val message = try {
        throw IllegalStateException()
        "The value is ${10 / 0}"
    } catch (error: ArithmeticException) {
        "Error was thrown"
    } catch (error: java.lang.IllegalStateException) {
        "Error was IllegalState"
    }
    println(message)
}