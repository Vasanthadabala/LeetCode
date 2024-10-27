package leetcode.array_string.easy

fun removeDuplicates(nums:IntArray):Int{
    var k = 1

    for (i in 1 until nums.size){
        if (nums[i] != nums[i-1]){
            nums[k] = nums[i]
            k++
        }
    }

    return k
}

fun main(){
    val array = intArrayOf(1,1,2)

    val k = removeDuplicates(array)
    println("The number of unique elements are: $k")

    val result = array.mapIndexed { index, value ->
        if (index>=k) "_" else value.toString()
    }.joinToString(",")

    println("Modified array: $result")
}