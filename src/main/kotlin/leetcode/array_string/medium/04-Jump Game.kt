package leetcode.array_string.medium

fun canJump(nums: IntArray):Boolean{

    var farthestReachable  = 0

    for(i in nums.indices){

        if (i > farthestReachable) return false

        farthestReachable = maxOf(farthestReachable, i + nums[i])

        if (farthestReachable >= nums.size-1) return true

    }

    return false
}

fun main(){
    val nums1 = intArrayOf(2, 3, 1, 1, 4)
    val nums2 = intArrayOf(3, 2, 1, 0, 4)

    println("Can jump (nums1): ${canJump(nums1)}")
    println("Can jump (nums1): ${canJump(nums2)}")
}