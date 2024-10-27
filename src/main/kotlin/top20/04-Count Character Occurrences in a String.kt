package top20

fun countFunction(str:String,countingChar:Char):Int{
    var count  = 0

    for(i in str){
        if (i == countingChar){
            count++
        }
    }

    return count
}
fun main(){
    val inputString = "Hello"
    val countingChar = 'l'

    val count  = countFunction(inputString, countingChar)

    println("The character $countingChar appears $count time in $inputString.")
}