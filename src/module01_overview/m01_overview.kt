package module01_overview

// this is the entry point of our kotlin application
fun main(){
    // to print to our standard output. we use print().
    // println() is just after printing, it leaves a line.
    println("This is printing on the standard output")

    // to take input we use 'readln()'
    print("Please enter a word : ")
    // this 'str' is a variable.
    // the val before this variable, indicates that this is an immutable variable
    // its values are not to be changed after initialization
    val str : String = readln()
    print("You entered the word : ")
    println(str)

    // the below line will cause an error.
    // str = "new string" -> Val cannot be reassigned.


    // another type variable is a mutable variable whose values may change
    // you can them after initialization
    var someValue : Int = 10
    someValue += 1
    println(someValue)
}