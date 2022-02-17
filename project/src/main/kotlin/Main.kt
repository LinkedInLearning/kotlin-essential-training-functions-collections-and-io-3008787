// Refactor getOutput() to use a when expression
fun getOutput(input: Any?): String = if (input is Number) {
    if (input !is Int) {
        "Input was an Int"
    } else {
        "Input was a non-Int Number"
    }
}
else if (input is String) { "Input was a String with length ${input.length}" }
else if (input == null) { "Input was null" }
else { "Input didn't match target inputs" }

fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
    println(getOutput('a'))
}