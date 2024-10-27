package leetcode.array_string.easy


fun removeElement(nums:IntArray, value:Int):Int{

    var k = 0

    for (i in nums.indices){
        if (nums[i] != value ){
            nums[k] = nums[i]
            k++
        }
    }

    for (i in k until nums.size){
        nums[i] = 0
    }

    return k
}

fun main(){
    val array = intArrayOf(3,2,2,3)
    val value  = 3

    val k = removeElement(array, value)

    println("The number of elements not equal to $value is: $k")
    println("Modified array with remaing values replaced with zero: ${array.joinToString(",")}")

    val result = array.mapIndexed { index, value ->
        if (index >= k) "_" else value.toString()
    }.joinToString(",")

    println("Modified array: $result")


}