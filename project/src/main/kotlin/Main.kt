
fun main() {
    val ints = arrayOf(1, 2, 3, 4, null)

    val nulls = arrayOfNulls<Int>(5)

    val custom = Array(5) { index -> index }

    val sizeOfArray = ints.size

    val firstValue = ints[0]
    ints.set(0, 99)
    ints[0] = 99

    val primitiveInts = intArrayOf(1, 2, 3, 4, 5)
    val primitiveUShorts = ushortArrayOf(1u, 2u, 3u, 4u, 5u)

//    for (i in 0 until ints.size) {
//        println(ints[i])
//    }
//
//    for (element in ints) {
//        println(element)
//    }
//
//    ints.forEach { element -> println(element) }

    greetThings("Hey", arrayOf("Kotlin", "Programming"))
    greetThings("Hello", "Kotlin", "Programming", "LinkedIn")
}

fun greetThings(greeting: String, vararg items: Any) {
    for (item in items) {
        println("$greeting $item")
    }
}