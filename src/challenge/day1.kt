package challenge

// we could also write it like this ->
//  fun stringToDouble(rawStr : String) : Double?{
//      return rawStr.trim().toDoubleOrNull()
//  }


// this is how we prefer to write it. since the body is just 1 line.
fun stringToDouble(rawStr : String) : Double? = rawStr.trim().toDoubleOrNull()

fun main(){
    print("Enter a double : ")
    val input = readln()

    // we could also do it like this.
    //    val res = stringToDouble(input)
    //    if(res != null){
    //        println("value is : $res")
    //    }

    println(stringToDouble(input) ?: "Invalid input provided - could not be parsed.")
}