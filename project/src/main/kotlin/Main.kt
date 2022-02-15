
fun main() {
    val aChar: Char = 'a'
    val aNumericChar = '1'
    val newLineChar = '\n'

    //val concatOption1 = 'a' + 'b'

    //val concatOption2 = 'ab'

    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World"
    println(escaped)

    val raw = """
      >>Some
        multiline
     text
      >>is going on
       here   
    """.trimMargin(">>")
    println(raw)

    val concatString = "Hello" + " Kotlin!"

    val concatNumber = "The number " + 10
    println(concatNumber)


    val aNumber = 10
    val concatTemplate = "The number ${1 + aNumber}"
    println(concatTemplate)


    val someString = "  "
    println(someString.isNotBlank())

    val anotherString = "Hello Kotlin World!"
    anotherString.contains("Kotlin")

    
}