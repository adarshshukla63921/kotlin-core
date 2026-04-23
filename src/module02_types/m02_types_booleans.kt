package module02_types

// so boolean represents logical values : 'true' or 'false'

// they are really useful

// we mainly use them control flow, which is the next module.

// but let's see how to use them here


fun main() {
    // declare a boolean
    // kotlin infers the type here, so we don't need to be explicit
    // also 0 and 1 cannot be booleans in Kotlin
    val isThisFun = true
    println("isThisFun: $isThisFun")

    // you can produce booleans using conditions
    val isAlwaysTrue = 10 > 0 // well 10 is always greater than 0
    println("is 10 always greater than 0 : $isAlwaysTrue") // which is gonna be always true
    val str = "Kotlin"
    println("is someday kotlin gonna be of 0 length : ${str.length == 0}") // which is always going to be false

    // let's see boolean operations
    // AND , OR , XOR , and NOT
    // && and || are lazy — right side only runs if needed

    // it allows to do something like this :
    val user: String? = null
    val isValid = user != null && user.length > 0 // it is safe.
    // if user is null, user.length never runs

    println("is valid or not ? $isValid")
    val isTrueAnyway = true
    println("will be false anyway : ${!isTrueAnyway}") // here we are using the '!' operator, converts true to false and false to true.

    val res = true || false
    println("isTrueAnyway: $res") // Logical OR

    val resAnd = true && true
    println("isTrueAnyway for another res : $resAnd") // Logical OR

    // XOR
    val a = false xor false // always false
    val b = false xor true // always true
    val c = true xor false // always true
    val d = true xor true // always false

    println("$a and $b and $c and $d are results of various XOR operations")

    // Well there is no clear use-case to demonstrate here, but we will see this more in the Control section.
    // we basically are taking two or conditions and converting them into a singular bool value, depending upon our need.

    // we also use it in when statements , which is also a control flow statement.
    val nums = -10

    when {
        nums > 0 -> println("$nums is greater than 0")
        else -> println("$nums is not greater than 0")
    }

    // that's about it, for booleans
    // we will see more in control flow
}