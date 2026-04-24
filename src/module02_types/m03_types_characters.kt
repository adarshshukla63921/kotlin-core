package module02_types

// this type represents a single character UTF-16 code unit.

// Char -> Single character
// String -> Sequence of Characters

fun main(){

    // Any character must contain only 1 character.

    val letter = 'a'
    val symbol = '!'
    val space = ' '
    val separator = ':'

    // To store nullable characters we use
    val maybeAbsent : Char? = null

    // Yes this does allow you store emojis also

    val emoji = "🥦"
    // something interesting is here.
    // some characters are encoded as a surrogate pair

    println("${emoji[0]} ${emoji[1]}")
    println(emoji)

    // there are also supported escape sequences like : \t , \b, \n \\ etc

    val backlash = '\\'
    println("$backlash")
    val dollarSign = '\$'
    println("$dollarSign")

    // operations on characters in kotlin
    val before = 'a'<'A' // false
    val after = 'a'>'A' // true
    val diff = 'a'=='A' // false
    val same = 'a'=='a' // true

    // you can also use character processing functions like this :
    val digit = '2'
    val alpha = 'A'
    val someChar = 'a'
    println("${digit.isDigit()}")
    println("${alpha.isUpperCase()}")
    println("${someChar.uppercaseChar()}")
    println()

    // something really is this in kotlin
    // these operations follow Unicode values
    val someOtherChar = 'a'
    println(someOtherChar + 1) // prints 'b'
    println(someOtherChar + 9) // prints 'j'
    println(someOtherChar - 32) // prints 'A' basically it is 97-32 = 65
    println(someOtherChar - 31)
    // to get a Unicode value
    println('A'.code) // this will print 65
    println('a'.code) // this will print 97
    println()

    // char conversion to digit
    val anotherDigit = '9'
    println("${anotherDigit.digitToIntOrNull()}")
    println()

    // char conversion to string
    val c = 'K'
    val s = c.toString()         // "K"
    println()

    // from string to char
    val back = s[0]              // 'K'
    println()

    // from 'code' to char
    val fromCode = 65.toChar()   // 'A'
    println()
}