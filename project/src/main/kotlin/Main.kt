import java.io.File

fun main() {
    print("Enter a filename: ")
    val filename = readLine() ?: ""
    println("You entered: $filename")

    val isValidFile = File(filename).isFile
    if (isValidFile) {
        println("It is a valid file")
    } else {
        println("It is not a valid file")
    }
}