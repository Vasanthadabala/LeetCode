package leetcode.hash_map.easy

fun containsNearByDuplicate(nums:IntArray, k:Int):Boolean{

    val mapping = mutableMapOf<Int, Int>()

    for (i in nums.indices){
        val num = nums[i]

        if (mapping.containsKey(num)){
            val previousIndex = mapping[num]!!

            if (i - previousIndex <= k) return true
        }

        mapping[num] = i
    }

    return false
}

fun main(){
    val nums = intArrayOf(1,2,3,1)
    val k = 3
    println("${containsNearByDuplicate(nums, k)}")// Output:True

    val nums2 = intArrayOf(1,2,3,1,2,3)
    val k2 = 2
    println("${containsNearByDuplicate(nums2, k2)}")// Output:False
}