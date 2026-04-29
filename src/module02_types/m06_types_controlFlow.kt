package module02_types

import kotlin.random.Random

// here we will cover control flow.
// if , if-else, when , for , while and so on

// NOTE : This is not exactly a type , but well it is not a big enough part to get its own module.
// DATE : 28/04/26


// if you don't know what an enum is, you can ignore it for now
enum class Bit {
    ZERO,
    ONE
}

fun randomBitGenerator() : Bit{
    return if(Random.nextBoolean()) Bit.ONE else Bit.ZERO
}
fun main(){
    println("Enter an age : ")
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

    println("Enter new Marks : ")
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
    println()

    // NEW ADDITION : 29/04/26

    // using for loops ->
    println("For loops")
    // classic use : iteration over some collection

    val list = arrayOf("Adarsh","Seenu","Raj")
    println("accessing the items in the list")
    for(item in list){
        println(item)
    }

    println("iteration over a range ie 1 to 5 (inclusive)")
    // iteration over closed ranges
    for(number in 1..5){
        println(number)
    }

    // you can make our own iterators, and anything that has an iterator can use a for loop.
    // we will look into it, in the future.
    println("Using while loop")

    // we are doing the classic , reverse the number.
    var num = 321
    var reversedNum = 0
    while(num != 0){
        val rem = num % 10
        num /= 10
        reversedNum = reversedNum*10 + rem
    }
    println(reversedNum)

    // we can also use do-while loop here.
    var roll : Int
    do{
        roll = Random.nextInt(1,7)
        println("Roll : $roll")
    }while (roll != 5)
        println("Got 5")


    // naturally kotlin does also support break, continue operators in loops.



}