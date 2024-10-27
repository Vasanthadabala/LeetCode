package leetcode.two_pointers.medium

fun maxArea(height:IntArray):Int{

    var left = 0
    var right = height.size-1

    var maxArea = 0

    while(left < right){
        val area = minOf(height[left], height[right]) * (right-left)

        maxArea = maxOf(maxArea, area)

        if (height[left] < height[right]){
            left++
        }else{
            right--
        }
    }

    return maxArea
}

fun main(){
    val height = intArrayOf(1,8,6,2,5,4,8,3,7)
    val result = maxArea(height)

    println("Max Area: $result")
}