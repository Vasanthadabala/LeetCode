package top20

fun palindrome(str:String){
    var result = ""
    var cleanedStr = str.lowercase()

    for (i in cleanedStr.length-1 downTo 0)
    {
        result = result+cleanedStr[i]
    }

    if (cleanedStr == result){
        println("Given String ${cleanedStr} is Palindrome")
    }else{
        println("Given String ${cleanedStr} is Not Palindrome")
    }

}
fun main(){
    palindrome("hello")
    palindrome("Pop")
}