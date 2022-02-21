import java.io.File
import kotlin.io.path.writeLines

// Prompt the user to enter the name of the test scores file
// Read each line from the file
// Sort the scores from highest to lowest
// Pick the 3 highest scores
// Write those 3 userId/score pairs to a new file sorted.txt

fun main() {
    print("Enter the name of the file containing scores: ")
    val inputFilename = readLine()

    if (inputFilename.isNullOrEmpty()) {
        println("Not a valid filename")
        return
    }

    val inputFile = File(inputFilename)
    if(!inputFile.isFile) return

    val rawScores = inputFile.readLines()

    val parsedScores = rawScores.map { line ->
        val elements = line.split(":")
        elements[0] to elements[1]
    }

    val finalScores = parsedScores
        .sortedByDescending { it.second }
        .take(3)

    val outputPath = File("sorted.txt").toPath()
    val outputScores = finalScores.map {
        "${it.first}:${it.second}"
    }
    outputPath.writeLines(outputScores)
}