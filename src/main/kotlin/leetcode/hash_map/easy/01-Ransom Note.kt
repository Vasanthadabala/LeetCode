package leetcode.hash_map.easy

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    var charCount = mutableMapOf<Char,Int>()

    for (i in magazine){
        charCount[i] = charCount.getOrDefault(i,0)+1
    }

    for (i in ransomNote){
        var count   = charCount.getOrDefault(i,0)

        if (count == 0){
            return false
        }

        charCount[i] = count-1
    }

    return true
}

fun main(){
    println(canConstruct("a", "b"))      // Output: false
    println(canConstruct("aa", "ab"))    // Output: false
    println(canConstruct("aa", "aab"))   // Output: true
}