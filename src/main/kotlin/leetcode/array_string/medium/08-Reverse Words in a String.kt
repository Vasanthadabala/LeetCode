package leetcode.array_string.medium

fun reverseWords(s: String): String {

    var result = StringBuilder()

    var i = s.length-1

    while (i >= 0) {

        while (i >= 0 && s[i] == ' ') {
            i--
        }

        if (i < 0) break  // If no characters left, break the loop

        val end = i

        while (i >= 0 && s[i] != ' ') {
            i--
        }

        if (result.isEmpty()) {
            result.append(s.substring(i + 1, end + 1))
        } else {
            result.append(" ").append(s.substring(i + 1, end + 1))
        }
    }
    return result.toString()
}

fun main(){
    val str = "the sky is blue"
    val str2 = "  hello world  "

    println("Reversed String: ${reverseWords(str)}")
    println("Reversed String: ${reverseWords(str2)}")
}