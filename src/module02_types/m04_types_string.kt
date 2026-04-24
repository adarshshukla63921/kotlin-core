package module02_types

// now we move to strings.
// Strings is just a sequence of characters.

fun main() {
    // strings are immutable
    // you can't change its value or assign a new value to it.

    val str1 = "abcd 1234"

    // any operation done on a string, just gives a new string
    // the original stays the same
    println(str1.uppercase())

    // how to iterate over every character in a string ??
    // here is a for-loop [ don't worry much if you do not know what a for loop is]
    for (c in str1) {
        println(c)
    }
    println()

    // concatenation of strings is done by '+' operator

    val str = "Adarsh"
    val str2 = "Shukla"
    val name = str + " " + str2
    // you could also write that as "$str1 $str2" and get the same result
    println(name)

    // escaped strings can contain escaped characters.
    // it is done the conventional way.

    val address = "i live in India \n"
    print(address) // notice we use print here, not println()
    println("NOTICE ME!")


    // multiline strings
    // use """ .... """ for multiline strings.
    val multilineString = """
        this is a multiline string,
        see you could do this as well
    """.trimIndent()
    println(multilineString)

    // string template may contain template expressions
    // this is evaluated here itself.

    val letters = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g')
    println("letters are $letters")
    println("number of letters is : ${letters.size}")

    // how to get a dollar sign then ??
    // I am glad you asked
    val price = """
        ${'$'}_9.99
    """
    println(price)

    // some quite useful methods on strings
    val raw = "  hello, kotlin!  "
    raw.trim()              // "hello, kotlin!"
    raw.contains("kotlin")  // true
    raw.replace("kotlin", "world")

    println(raw) // our strings remain the same as it is immutable

    // here is how you get you want.
    val brandNewString : String = raw.replace("kotlin", "world")
    println(brandNewString) // this is now "hello, world!"
    raw.split(", ")         // ["  hello", " kotlin!  "]
    raw.startsWith("  h")   // true
    raw.isEmpty()           // false
    raw.isBlank()           // false — important difference from isEmpty()

    // isBlank() also returns true if there is only whitespaces, isEmpty() however returns false.
    "   ".isEmpty()
    "   ".isBlank()
}