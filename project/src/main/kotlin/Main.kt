fun checkType(input: Any?) {
    when (input) {
        null -> println("Input was null")
        is String -> println("Input was a String of length ${input.length}")
    }
}

fun main() {
    val aGenericVariable: Any = 5

    checkType("null")
}