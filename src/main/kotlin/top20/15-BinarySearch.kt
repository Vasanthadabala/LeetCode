package top20

fun binarySearch(array:IntArray,target:Int):Int{
    var low = 0
    var high = array.size-1

    while (low<=high){
        var mid = (low+high)/2

        if (array[mid] == target){
            return mid
        }else if (array[mid]<target){
            low = mid+1
        }else{
            high = mid-1
        }
    }
    return -1
}

fun main(){
    val array = intArrayOf(1,2,3,4,5)
    val target = 4

    val result  = binarySearch(array,target)

    if(result != -1){
        println("Element $target found at index $result")
    }else {
        println("Element $target not found in the array")
    }
}