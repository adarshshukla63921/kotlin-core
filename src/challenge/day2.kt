package challenge

// Given a List<String?> of API responses, produce a List<String>
// where nulls are replaced with "N/A" and blank/empty strings are removed entirely.
//
// Rules :
// - No for-loops, no if-statements.
// - No '!!' operator anywhere.
// - Solve in a single chain.


fun cleanResponse(apiResponses : List<String?>) : List<String> = apiResponses.map { it ?: "N/A"}.filter { it.isNotBlank() }


fun main(){
    val apiResponses: List<String?> = listOf("success", null, "  ", "error: timeout", null, "", "ok")
    println(cleanResponse(apiResponses))
}