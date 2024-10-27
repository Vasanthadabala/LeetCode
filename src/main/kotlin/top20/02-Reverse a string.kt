package top20

fun main(){
    var str = "hello"
    var resultStr = ""

    for (i in str.length -1 downTo 0){
        resultStr = resultStr + str[i]
        if(i!=0){
            resultStr = resultStr + ","
        }
    }
    println(resultStr)
}