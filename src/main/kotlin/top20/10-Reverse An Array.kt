package top20

fun main(){
    val array = intArrayOf(1, 2, 3, 4, 5)
    val n = array.size

    for (i in 0 until n/2){
        val temp = array[i]
        array[i] = array[n-i-1]
        array[n-i-1] = temp
    }

    println("Reversed Array: ${array.joinToString(", ")}")
}