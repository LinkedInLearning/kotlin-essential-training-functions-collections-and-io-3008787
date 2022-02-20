
fun main() {
    val readOnlyList = listOf(1, 2, 3)
    val readOnlySet = setOf(1, 2, 3)
    val readOnlyMap = mapOf(1 to "a", 2 to "b")

    val mutableList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    val mutableMap = mutableMapOf(1 to "a", 2 to "b")

    mutableList.size
    readOnlyMap.size

    mutableSet.isEmpty()
    readOnlyList.isNotEmpty()

    for (element in readOnlySet) {
        println(element)
    }

    mutableMap.forEach { key, value -> println(value) }

    readOnlyList.first()
    mutableSet.first()

    mutableList.take(3)
    readOnlySet.take(2)

    mutableMap.filter { entry -> entry.key < 2 }
    readOnlyList.filter { value -> value > 1 }

    val languages = mapOf(
        "kotlin" to 5,
        "java" to 3,
        "javascript" to 4,
        "c++" to 2,
        "python" to 6
    )

    languages.filter { it.value >= 4 }
        .map { it.key }
        .sorted()
        .forEach { println(it) }
}