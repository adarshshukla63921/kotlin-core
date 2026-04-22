package module01_overview

// so this a function.
// it may or may not take some input
// it may or may not return some value
// the below one, does return you a value
// this function for instance takes two values of 'type' Int (integers)
// and also returns you 1 integer, after doing some operation

fun addTwoNumbers(a : Int, b : Int) : Int {
    return a+b
}

// function that does not return anything at all
// well it does return something called 'Unit'
// but we can omit that.
fun addTwoMoreNumbersAndPrintThem(a : Int, b : Int){
    println("sum of those two numbers is ${a+b}")
}

//  fun addTwoMoreNumbersAndPrintThem(a : Int, b : Int) : Unit {
//      println("sum of those two numbers is ${a+b}")
//  }

fun main(){
    print("Enter an integer number : ")
    // this line here means...
    // readln() is gonna give you a string
    // then this '.toIntOrNull' is going to try and convert that string to an integer
    // if it fails, then our variable will be null.
    val a : Int? = readln().toIntOrNull()
    print("Enter another integer number : ")
    val b : Int? = readln().toIntOrNull()

    // this is not how you should handle null, but this will do for now.

    if(a != null && b != null){
        // this is how you call a function
        // if you give anything other than integer as an input, it will cause a compile time error.
        // this func calculates the sum and gives us the value as an integer
        // which is then printed here
        println("the sum of those is : ${addTwoNumbers(a, b)}")
    }else{
        // in case you enter something that is not an integer, this will take over.
        println("One of the numbers was invalid, or the number was not an integer")
    }

    // our other function
    // as you can see these are hardcoded, but you can follow the steps above to make them 'dynamic'
    addTwoMoreNumbersAndPrintThem(10,20)
}