package leetcode.array_string.easy

fun lengthOfLastWord(s:String):Int{

    var length = 0
    var i = s.length -1

    while (i >= 0 && s[i] == ' '){
        i--
    }

    while (i >= 0 && s[i] != ' ' ){
        length++
        i--
    }
    return length
}

fun main(){
    val str = "luffy is still joyboy"

    val result = lengthOfLastWord(str)
    println("Length of the last word in '${str}': $result")
}