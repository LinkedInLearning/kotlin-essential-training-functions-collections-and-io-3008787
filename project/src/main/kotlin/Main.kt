

fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    println("The value is: ${calculator(value1, value2)}")
}

fun main() {
    printCalculatedValue(2, 2) { value1, value2 ->
        value1 + value2
    }

    printCalculatedValue(2, 2, { value1, value2 ->
        value1 - value2
    })
}