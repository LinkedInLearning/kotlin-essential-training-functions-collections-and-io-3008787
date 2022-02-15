
fun main() {
    var aNullableString: String? = "Kotlin"
    println(aNullableString?.length ?: "the value was null")
}