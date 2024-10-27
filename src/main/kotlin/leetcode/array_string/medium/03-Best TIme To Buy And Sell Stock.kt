package leetcode.array_string.medium

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    for (i in 0..prices.size-2){

        var diff = prices[i+1]-prices[i]

        if (diff>0){
            maxProfit = maxProfit + diff
        }
    }
    return maxProfit
}

fun main(){
    val array  = intArrayOf(7,1,5,3,6,4)

    val profit = maxProfit(array)
    println("Maximum Profit: $profit")
}