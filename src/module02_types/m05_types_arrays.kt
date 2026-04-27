package module02_types

// array is simply an ordered collection.
// you cannot increase it's size after creation, but you can mutate its elements

fun main(){
    /// CREATING AN ARRAY
    // this is a homogeneous array, it contains only strings
    println("Section : Creating an array.")
    println()
    val names = arrayOf("adarsh","seenu","raj")
    println(names.contentToString()) // content to string will print the actual elements in the array.

    // Array<Any>
    val items = arrayOf(1,2,4.55, 433.22, "adarsh", "seenu")
    println(items.contentToString())

    // Creates an array of specific size, with each initialized as null
    val slots = arrayOfNulls<String>(5)
    slots[0] = "new String"
    println(slots.contentToString())

    // creating an empty array
    val nothing = emptyArray<Int>()
    // filling an array.
    nothing.fill(0)
    println(nothing.contentToString())

    // primitive arrays
    val intArray = intArrayOf(1,2,4,4,5)
    println(intArray.contentToString())
    val doubleArray = doubleArrayOf(1.0,4.5,9.8,6.022)
    println(doubleArray.contentToString())
    val longArray = longArrayOf(1L,2L,3L,4L,5L,6L,7L)
    println(longArray.contentToString())
    val charArray = charArrayOf('a','b','c')
    println(charArray.contentToString())
    val shortArray = shortArrayOf(1,2,3,4,5)
    println(shortArray.contentToString())

     // you could also do something like this
    val newInt = IntArray(5) { i -> i *2 }
    println(newInt.contentToString())
    println()

    /// READING AND WRITING ELEMENTS IN AN ARRAY
    println("Section : Reading and writing elements.")
    println()
    val arr = arrayOf(10,20,30,40,50,60)

    // index operator [ the most common one ]

    println(arr[0])
    println(arr[1])
    println(arr[2])
    println(arr[3])
    println(arr[4]) // and so on
    println()

    // safe reading

    // either we get the value, at a specified index, or we get null
    val safe = arr.getOrNull(3) // that's 40
    println(safe)
    // arr.len = 6 so index 7 does not exist.
    // we set a default value of -1 , if an index does not exist
    val fallBack = arr.getOrElse(7){-1}
    println(fallBack)
    // using special methods, make life easier
    println("first element of array is : ${arr.first()}")
    println("last element of array is : ${arr.last()}")
    println("first element greater than 20 : ${arr.first{ it > 20}}")
    println()

    /// ITERATION OVER ARRAYS
    println("Iteration in arrays")
    println()
    println("using first method")
    for(x in arr){
        println(x)
    }
    println()

    // index + value
    println("using index + value")
    for((i,v) in arr.withIndex()){
        println("$i -> $v")
    }
    println()

    // using .forEach{}
    println("Using lambdas")
    arr.forEach { println(it) }
    println()
    arr.forEachIndexed { index, value -> println("$index -> $value") }
    println()

    // Reverse Iteration
    println("Print in reverse")
    for(x in arr.reversed()){
        println(x)
    }
    println()
    /// ARRAY PROPERTIES AND BASIC OPERATIONS
    println("Array properties and basic operations")

    println("size of array : ${arr.size}")
    println("check weather array is empty : ${arr.isEmpty()}") // .isNotEmpty() also exists.

    // copying
    val copy = arr.copyOf()
    println(copy.contentToString())

    val partialCopy = arr.copyOfRange(0,2)
    println(partialCopy.contentToString())

    val exceedingCopy = arr.copyOf(8)
    println(exceedingCopy.contentToString()) // last two NEW values will be null
    println()

    // searching
    println("Searching & checking in arrays.")
    println()
    println("des our array have 30 ? : ${arr.contains(30)}")

    val indexOf60 = arr.indexOf(60)
    println("index of 60 is : $indexOf60")
    println()

    // sorting
    val sorted = arr.sorted()
    println(sorted)
    arr.sortDescending()
    println(arr.contentToString())
    println()

    // that's about it, the basics of dealing with arrays. we will see them in more depth in the future.

}