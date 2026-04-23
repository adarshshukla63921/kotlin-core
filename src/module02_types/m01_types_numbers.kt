package module02_types

// we are going to learn about types, in kotlin.
// everything in kotlin is an obj, and allows u to call member functions and properties on any variable

// Types -> Numbers, Booleans, String, Arrays etc

// we will look on numbers only today.
// Number -> byte : 8 bits , int : 32 bits , short : 16 bits , long : 64 bits, float : 32 bits, double : 64 bits
// We also have UByte, UInt, UShort, ULong which is unsigned integers. They do not have negative values.

fun main(){
    // we are gonna declare a bunch of types.

    // let's go through some eccentric stuff, that kotlin does allow in representing numbers

    // you can represent hexadecimal and binary values in kotlin
    // octal values is not supported here
    val hexDecimalValue = 0x0F
    println("hexDecimalValue for 0x0F is $hexDecimalValue")
    val binaryValue = 0b1000
    println("binary for 1000 is $binaryValue")

    // some ways to write and represent different types of numbers.
    val oneBillion = 1_000_000_000
    val aLongNumber = 1L // this is a long , not an int
    val decimalNumber = 10.0 // this a double
    val anotherDecimalNumber = 10.4f // this is a float
    // val num : Double = 1 // here you will get a type mismatch, so convert this to either '1.0' or change type to 'Int'
    println("is our one billion an integer : ${oneBillion is Int}")
    println("a long number $aLongNumber is Long type  : ${aLongNumber is Long}")
    println("decimal number $decimalNumber is Double type : ${decimalNumber is Double}")
    println("Float number $anotherDecimalNumber is Float type : ${anotherDecimalNumber is Float}")

    // there are methods that allow us to basically convert one type to another.
    // here is how we do it.

    val someDouble = 22343.56554 // infers to double anyway
    // we want the int part of that, so ....
    val someIntPartOfDouble = someDouble.toInt()
    println("the int part we wanted earlier : $someIntPartOfDouble")

    // similarly we have .toByte() , toShort(), toFloat() etc ....
    // the one we did above is called EXPLICIT CONVERSION.

    // kotlin does not support implicit conversion
    // it leads to unexpected behavior

    // ofc we can math operations:

    println(2+2)
    println(2*8)
    println(10%3)
    println(10.0/3) // remember implicit conversion does not exist, if you write 10/3 you will get 3, not 3.33

    // we can also do , shift operations in our numbers.
    // AND, OR and XOR, inversion is also there
    val x = 1
    val shiftLeftX = x shl 2
    print("1 shifted left by 2 bits in binary is $shiftLeftX ")

    // that's about it for numbers.


}