
fun main() {
    val languages = mutableSetOf("kotlin", "java", "c++", "kotlin")
    for (language in languages) {
        println(language)
    }
    languages.size
    println(languages.contains("kotlin"))

    languages.add("javascript")
    languages.remove("javascript")

    val testScores = mutableMapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)
    println(testScores[123])

    for ((id, score) in testScores) {
        println("score for user ${id} was ${score}")
    }

    testScores.containsKey(123)
    testScores.containsValue(100.0)

    testScores.keys.forEach { println(it) }

    testScores[111] = 97.8
    testScores.put(222, 72.1)
    testScores.remove(222)
    testScores.replace(111, 98.7)
}