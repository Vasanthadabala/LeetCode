package top20

fun removeChar(inputString:String,charRemove:Char):String{
    var result  = ""

    for (char in inputString){
        if (char!=charRemove){
            result = result+char
        }
    }

    return result
}
fun main(){
    val inputString = "hello world"
    val charToRemove = 'l'

    val result  = removeChar(inputString,charToRemove)

    println("Original String: $inputString")
    println("After Removing '$charToRemove': $result")
}