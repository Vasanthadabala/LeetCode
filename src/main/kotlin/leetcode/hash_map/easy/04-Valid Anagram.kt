package leetcode.hash_map.easy

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val charCount = IntArray(26)

    for (i in s.indices){
        charCount[s[i] - 'a']++
        charCount[t[i] - 'a']--
    }

    for (i in charCount){
        if (i != 0){
            return false
        }
    }
    return true
}

fun main(){
    val s = "anagram"
    val t = "nagaram"

    println("$s and $t is valid Anagram: ${isAnagram(s, t)}") // Output: true

    val s2 = "rat"
    val t2 = "car"
    println("$s2 and $t2 is valid Anagram: ${isAnagram(s2, t2)}")  // Output: false
}