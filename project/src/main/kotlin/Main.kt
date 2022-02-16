

// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun printFormattedName(first: String, last: String, formatter: (String, String) -> String) {
    println(formatter(first, last))
}

val basicFormatter: (String, String) -> String = { first, last ->
    "$first $last"
}

val fancyFormatter: (String, String) -> String = { first, last ->
    "first name is $first and last name is $last"
}

fun main() {
    printFormattedName("Nate", "Ebel", basicFormatter)
    printFormattedName("Nate", "Ebel", fancyFormatter)

    printFormattedName("Nate", "Ebel") { first, last ->
        "$last, $first"
    }
}