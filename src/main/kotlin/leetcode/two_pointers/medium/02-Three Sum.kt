package leetcode.two_pointers.medium

fun threeSum(nums:IntArray):List<List<Int>>{

    nums.sort()
    val result = mutableListOf<List<Int>>()

    for (i in nums.indices) {

        if (i > 0 && nums[i] == nums[i - 1]) continue

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[left] + nums[right] + nums[i]

            when {
                sum < 0 -> left++
                sum > 0 -> right--
                else -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))

                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--

                    left++
                    right--
                }
            }
        }
    }
    return result
}

fun main(){
    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val result = threeSum(nums)
    println("Unique Triplets: $result")
}