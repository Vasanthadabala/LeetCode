package leetcode.hash_map.easy

fun twoSum(nums: IntArray, target: Int):IntArray{
    for (i in nums.indices){
        for (j in i+1..nums.size-1){
            if (nums[i] + nums[j] == target){
                return intArrayOf(i , j)
            }
        }
    }
    return intArrayOf()
}

fun main(){
    val nums = intArrayOf(2,7,11,15)
    val target = 9

    println("Index Values : ${twoSum(nums,target).joinToString(",")}")
}