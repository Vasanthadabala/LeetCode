package leetcode.array_string.easy

fun indexOfFirstOccurrence(haystack: String, needle: String):Int{
    val hayLen = haystack.length
    val nedLen = needle.length

    val n = hayLen-nedLen

    if (nedLen == 0) return 0

    for (i in 0..n){
        if(haystack.substring(i, i+nedLen) == needle){
            return i
        }
    }

    return -1
}

fun main(){
    val haystack1 = "sadbutsad"
    val needle1 = "sad"
    println("Index: ${indexOfFirstOccurrence(haystack1, needle1)}")  // Output: 0

    val haystack2 = "leetcode"
    val needle2 = "leeto"
    println("Index: ${indexOfFirstOccurrence(haystack2, needle2)}")  // Output: -1
}