
var greetingFunction: (String) -> String = { thingToGreet ->
    "Hello $thingToGreet"
}

fun main() {
    println(greetingFunction("World"))
    println(greetingFunction("Kotlin"))

    greetingFunction = { thingToGreet ->
        "Hello $thingToGreet!"
    }

    println(greetingFunction.invoke("Kotlin Programming"))
}