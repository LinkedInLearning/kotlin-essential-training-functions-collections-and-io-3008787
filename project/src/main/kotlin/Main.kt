
fun main() {
    // Using the provided test scores, identify the 3 students
    // with the lowest test scores

    testScores.toList()
        .sortedBy { pair -> pair.second } // sort by test score
        .map { pair -> pair.first } // map to student id
        .take(3) // take 3 lowest values for the sorted list
        .forEach { println(it) }
}