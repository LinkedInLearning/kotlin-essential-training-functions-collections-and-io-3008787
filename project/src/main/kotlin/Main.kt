import kotlin.random.Random

fun getRandomInt() = Random.nextInt()

fun main() {
    for (i in 0..4) {
        val random = getRandomInt()
        val isEven = random.rem(2) == 1
        when(isEven) {
            true -> println("$random is even")
            false -> println("$random is odd")
        }
    }

}