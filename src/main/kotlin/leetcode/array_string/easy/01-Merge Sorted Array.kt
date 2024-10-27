package leetcode.array_string.easy

fun merge(nums1:IntArray, nums2:IntArray, m:Int, n:Int):Unit {
    var i = m - 1//number of acutual elements to merge
    var j = n - 1//nummber of elements to merge
    var k = m + n - 1 //number of indexs in nums1

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i]
            i--
        } else {
            nums1[k] = nums2[j]
            j--
        }
        k--
    }
    while (j >= 0) {
        nums1[k] = nums2[j]
        j--
        k--
    }
}

fun main(){
    val num1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val num2 = intArrayOf(2, 5, 6)
    val m = 3
    val n = 3

    merge(nums1 = num1,nums2 = num2, m = m, n = n )
    println("Merged array: ${num1.joinToString(", ")}")
}