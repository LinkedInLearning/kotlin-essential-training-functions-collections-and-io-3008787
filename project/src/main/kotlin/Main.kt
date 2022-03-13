
fun main() {
    val languages = listOf("kotlin", "c++", "java")
        .filter { it.length > 4 }
        .map { it.length }

    val languageSequence = sequenceOf("kotlin", "c++", "java")

    val fromIterable = listOf(1, 2, 3).asSequence()

    languageSequence.filter { it.length > 4 }.map { it.length }.take(2)
}