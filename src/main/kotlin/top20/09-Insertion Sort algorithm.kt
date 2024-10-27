package top20

fun insertionSort(array:IntArray){
    val n = array.size

    for (i in 1 until n){

        var j = i-1
        var key = array[i]

        while(j>=0 && array[j]>key){
            array[j+1] = array[j]
            j--
        }

        array[j+1] = key
    }
}
fun main(){
    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original Array: ${array.joinToString(", ")}")

    insertionSort(array)
    println("Sorted Array: ${array.joinToString(", ")}")
}