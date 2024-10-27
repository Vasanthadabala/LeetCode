package leetcode.array_string.easy

fun majorityElement(nums:IntArray):Int{

    var element = nums[0]
    var count = 0

    for (i in nums){
        if (count == 0){
            element = i
        }

        if (element == i){
            count++
        }else{
            count--
        }
    }

    return element
}

fun main(){
    val array = intArrayOf(2,2,1,1,1,2,2)

    val result = majorityElement(array)
    println("Majority Element in nums1: $result")
}