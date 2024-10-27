package leetcode.array_string.medium

fun jump(nums:IntArray):Int{

    var currentEnd = 0
    var jumps = 0
    var farthest = 0

    for (i in 0 until nums.size-1){

        farthest = maxOf(farthest,i+nums[i])

        if (i == currentEnd){
            jumps++
            currentEnd = farthest
        }

    }

    return jumps
}

fun main(){
    val array = intArrayOf(2,3,1,1,4)

    val jumps = jump(array)
    println("Maximum number of jumps needed to reach end: $jumps")
}