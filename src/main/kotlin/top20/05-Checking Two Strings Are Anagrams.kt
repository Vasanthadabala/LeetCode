package top20

fun anagrams(str1:String, str2:String):Boolean{
    // Convert both strings to lowercase to handle case insensitivity
    val cleanedStr1 = str1.lowercase()
    val cleanedStr2 = str2.lowercase()

    // If lengths are not the same, they cannot be anagrams
    if (cleanedStr1.length != cleanedStr2.length) return false

    // Convert strings to character arrays, sort them, and compare
    return cleanedStr1.toCharArray().sorted() == cleanedStr2.toCharArray().sorted()
}
fun main(){
    val result1 = anagrams("apple", "pale")
    val result2 = anagrams("listen", "silent")

    var array = "listen"
    var arrResult = array.toCharArray().sorted()

    println(arrResult)

    println("Are 'hello' and 'hello' anagrams? $result1")
    println("Are 'listen' and 'silent' anagrams? $result2")
}