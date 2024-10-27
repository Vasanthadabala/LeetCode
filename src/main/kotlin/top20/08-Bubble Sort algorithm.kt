package top20

fun bubbleSort(array:IntArray){
    val n = array.size

    for (i in 0 until n-1){
        //If array size is 4 -> 0,1,2,3 are index
        //But until means 0,1,2 thats it 3 not included
        
        for (j in 0 until n-i-1){
            if (array[j]>array[j+1]){
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }
}
fun main(){
    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Original Array : ${array.joinToString(", ")}")

    bubbleSort(array)
    println("Sorted Array : ${array.joinToString(", ")}")

    /*
    In Kotlin (and Java), arrays are passed by reference. This means when you pass an array to a function,
    the function receives a reference to the original array.
    Any modifications made to the array inside the function will directly affect the original array.
    */
}