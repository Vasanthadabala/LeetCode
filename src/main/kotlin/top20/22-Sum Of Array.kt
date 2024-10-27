package top20

fun sumOfArray(array:IntArray){
    var sum  = 0
    for (i in array){
        sum = sum+i
    }
    println("Sum of array is $sum")
}

fun main(){
    val array = intArrayOf(1,2,3,4,5)
    sumOfArray(array)
}