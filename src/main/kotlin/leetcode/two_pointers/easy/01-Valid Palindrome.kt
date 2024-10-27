package leetcode.two_pointers.easy

fun isPalindrome(s: String): Boolean {

    val cleandedStr = s.filter { it.isLetterOrDigit() }.lowercase()

    var left = 0
    var right = cleandedStr.length-1

    while (left < right){
        if (cleandedStr[left] != cleandedStr[right]){
            return false
        }
        left++
        right--
    }

    return true
}

fun main(){
    val str1 = "A man, a plan, a canal: Panama"
    val str2 = "race a car"
    val str3 = " "

    println("Is palindrome str1: ${isPalindrome(str1)}")
    println("Is palindrome str2: ${isPalindrome(str2)}")
    println("Is palindrome str3: ${isPalindrome(str3)}")
}