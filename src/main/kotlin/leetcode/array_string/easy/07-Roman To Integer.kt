package leetcode.array_string.easy

fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10,
        'L' to 50, 'C' to 100,
        'D' to 500, 'M' to 1000
    )

    var totalValue = 0
    var prevValue = 0

    val n = s.length-1

    for (i in n downTo 0){
        val currValue = romanMap[s[i]]!!

        if(currValue < prevValue){
            totalValue = totalValue - currValue
        }else{
            totalValue = totalValue + currValue
        }

        prevValue = currValue
    }

    return totalValue
}

fun main(){
    val roman1 = "III"
    val roman2 = "LVIII"
    val roman3 = "MCMXCIV"

    println("Roman: $roman1 -> Integer: ${romanToInt(roman1)}")
    println("Roman: $roman2 -> Integer: ${romanToInt(roman2)}")
    println("Roman: $roman3 -> Integer: ${romanToInt(roman3)}")
}