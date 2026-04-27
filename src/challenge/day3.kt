package challenge

// Challenge - Day 03 : Control Flow & Sealed Classes
//
// Given an HTTP status code as an Int, produce a sealed class 'HttpResult'
// with exactly four subtypes : Success (2xx), Redirect (3xx), ClientError (4xx), ServerError (5xx).
// Any code outside these ranges must map to a fifth subtype : Unknown.
//
// Rules :
// - Use 'when' exhaustively with no 'else' branch on the sealed class subtypes.
// - Each subtype must carry the original code as a property.
// - Write a fun describe(result: HttpResult): String that returns a human-readable message.
// - No if-statements anywhere in the solution.

sealed class HttpResult {
    data class Success(val code: Int) : HttpResult()
    data class Redirect(val code: Int) : HttpResult()
    data class ClientError(val code: Int) : HttpResult()
    data class ServerError(val code: Int) : HttpResult()
    data class Unknown(val code: Int) : HttpResult()
}

fun describe(result: HttpResult): String = when (result) {
    is HttpResult.Success     -> "${result.code} - OK"
    is HttpResult.Redirect    -> "${result.code} - Redirecting"
    is HttpResult.ClientError -> "${result.code} - Your fault"
    is HttpResult.ServerError -> "${result.code} - Our fault"
    is HttpResult.Unknown     -> "${result.code} - No idea"
}

fun main(){
    val result : HttpResult = HttpResult.Success(200)
    println(describe(result))
}