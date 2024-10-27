package leetcode.hash_map.easy

fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(" ")
    if (pattern.length != words.size) return false

    val charToWord = mutableMapOf<Char, String>()
    val wordToChar = mutableMapOf<String, Char>()

    for (i in pattern.indices) {
        val char = pattern[i]
        val word = words[i]

        if (charToWord[char] != null && charToWord[char] != word) return false

        if (wordToChar[word] != null && wordToChar[word] != char) return false

        charToWord[char] = word
        wordToChar[word] = char
    }

    return true  // If no contradictions were found, return true
}

fun main() {
    val pattern1 = "abba"
    val s1 = "dog cat cat dog"
    println(wordPattern(pattern1, s1))  // Output: true

    val pattern2 = "abba"
    val s2 = "dog cat cat fish"
    println(wordPattern(pattern2, s2))  // Output: false

    val pattern3 = "aaaa"
    val s3 = "dog cat cat dog"
    println(wordPattern(pattern3, s3))  // Output: false

    val pattern4 = "abc"
    val s4 = "dog cat fish"
    println(wordPattern(pattern4, s4))  // Output: true
}
