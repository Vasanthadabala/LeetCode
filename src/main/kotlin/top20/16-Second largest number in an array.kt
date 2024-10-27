package top20

fun secondLargest(array:IntArray):Int{
    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (element in array){
        if (element > firstLargest){
            secondLargest = firstLargest
            firstLargest = element
        }else if (element > secondLargest && element!=firstLargest){
            secondLargest = element
        }
    }

    return secondLargest
}
fun main(){
    val array = intArrayOf(12, 35, 1, 10, 34, 1)

    val result = secondLargest(array)
    println("Second Largest Number: $result")
}