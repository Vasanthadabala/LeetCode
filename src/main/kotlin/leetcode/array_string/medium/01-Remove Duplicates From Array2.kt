package leetcode.array_string.medium

fun removeDuplicates2(nums:IntArray):Int{

    var k = 2

    for (i in 2 until nums.size){
        if (nums[i] != nums[k-2]){
            nums[k] = nums[i]
            k++
        }
    }

    return k
}

fun main(){
    val array = intArrayOf(1,1,1,2,2,3)

    val k = removeDuplicates2(array)
    println("The number of unique elements are: $k")

    val result = array.mapIndexed { index, value ->
        if (index >= k) "_" else value.toString()
    }.joinToString(",")
    println("Modified array: $result")
}