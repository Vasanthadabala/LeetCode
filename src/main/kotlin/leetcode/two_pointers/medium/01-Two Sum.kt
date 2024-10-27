package leetcode.two_pointers.medium

fun twoSum(nums:IntArray, target:Int):IntArray{

    var left = 0
    var right = nums.size-1

    while (left<right){
        val sum  = nums[left] + nums[right]

        if (sum == target){
            return intArrayOf(left+1,right+1)
        }else if (sum > target){
            right--
        }else{
            left++
        }
    }
    
    return intArrayOf()
}

fun main(){
    val nums = intArrayOf(2,7,11,15)
    val target = 9

    val result  = twoSum(nums, target)
    println("Result : ${result.contentToString()}")
}