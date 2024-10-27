package leetcode.array_string.easy

fun maxProfit(prices: IntArray):Int{

    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices){
        if (price < minPrice){
            minPrice = price
        }else{
            var profit = price - minPrice

            if (profit>maxProfit){
                maxProfit = profit
            }
        }
    }

    return maxProfit
}

fun main(){
    val array = intArrayOf(7,1,5,3,6,4)

    val profit = maxProfit(array)
    println("Maximum Profit: $profit")
}