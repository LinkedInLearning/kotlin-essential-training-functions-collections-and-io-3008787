
fun main(vararg args: String) {

    if (args.isEmpty()) {
        print("Please pass at least one argument")
        return
    }

    println("First arg is ${args[0]}")

    for (arg in args) println(arg)
}