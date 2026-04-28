package module02_types

import kotlin.random.Random

// here we will cover control flow.
// if , if-else, when , for , while and so on
enum class Bit {
    ZERO,
    ONE
}

fun randomBitGenerator() : Bit{
    return if(Random.nextBoolean()) Bit.ONE else Bit.ZERO
}
fun main(){
    val age = readln().toIntOrNull()

    if(age != null){
        // age != null is a condition
        // if that is true, then this piece of code is executed.
        println("Your age is $age")
    }

    // branches
    // it is just a fancy way of saying that only a particular section of code will be executed
    // based upon a condition, rest will be ignored.
    if(age == null){
        // if true, then this branch is executed
        println("Invalid age, please enter an integer and try again")
    }else{
        // otherwise, this branch is executed
        println("Your age is $age")
    }

    // you can use it in an expression as well
    // Again this is not how you handle null, but this is fine for now.
    if(age != null){
        val adultAge = if (age >= 18) "is an adult" else "is not an adult"
        println(adultAge)
    }

    // similarly we have if , else if , else conditions
    val marks = 97
    if(marks in 90..100){
        println("Grade A")
    }else if(marks in 80..90){
        println("Grade B")
    }else{
        println("Grade C")
    }

    // using when statement would be better, in the above case.
    // and we don't get an error here for using a potentially null value
    // we can also use when statement as an expression

    // we do not need to cover all the cases here extensively,
    // because we are not using it as an expression

    val newMarks = readln().toIntOrNull()
    when(newMarks){
       in 90..100 -> println("Grade A")
        in 80..90 -> println("Grade B")
        in 70..79 -> println("Grade C")
        in 60..69 -> println("Grade D")
        in 50..59 -> println("Grade E")
        else -> println("Grade F") // if its null, then this prints.
    }

    // here is an example of using when as an expression.
    // if for some expression you don't have all possible cases
    // you should use ' else -> ' branch
    val bitNumericValue : Int = when (randomBitGenerator()) {
        Bit.ONE -> 1
        Bit.ZERO -> 0
    }
    println("The numeric value is $bitNumericValue")


}