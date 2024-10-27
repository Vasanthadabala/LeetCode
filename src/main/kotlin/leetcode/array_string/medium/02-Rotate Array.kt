package leetcode.array_string.medium

fun rotate(nums:IntArray, k:Int){
    val n = nums.size
    val steps = k % n // useful when k greater than n

    reverse(nums, 0, n-1)

    reverse(nums, 0, steps-1)

    reverse(nums, steps, n-1)
}

fun reverse(array:IntArray, start:Int, end:Int) {

    var i = start
    var j = end

    while (i < j) {

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp

        i++
        j--
    }

}
fun main(){
    val array = intArrayOf(1,2,3,4,5,6,7)
    val k = 3
    rotate(array,k)

    println("Reversed Array: ${array.joinToString(",")}")

}