package leetcode.two_pointers.easy

fun isSubsequence(s:String, t:String):Boolean{
    var i = 0
    var j = 0

    while (i < s.length && j < t.length){
        if (s[i] == t[j]){
            i++
        }
        j++
    }

    return i == s.length
}

fun main(){
    val s1 = "abc"
    val t1 = "ahbgdc"
    println(isSubsequence(s1, t1))

    val s2 = "axc"
    val t2 = "ahbgdc"
    println(isSubsequence(s2, t2))
}