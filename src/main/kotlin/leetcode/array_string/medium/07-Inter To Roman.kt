package leetcode.array_string.medium

fun intToRoman(num: Int): String {
    val romanSymbols = listOf(
        Pair(1000, "M"), Pair(900, "CM"), Pair(500, "D"),
        Pair(400, "CD"), Pair(100, "C"), Pair(90, "XC"),
        Pair(50, "L"), Pair(40, "XL"), Pair(10, "X"),
        Pair(9, "IX"), Pair(5, "V"), Pair(4, "IV"),
        Pair(1, "I")
    )

    var number = num
    var result  = StringBuilder()

    for((value, symbol) in romanSymbols){

        while (number >= value){
            result.append(symbol)
            number = number - value
        }

    }

    return result.toString()

}
fun main(){
    val num1 = 3749
    val num2 = 58

    println("Roman numeral for $num1: ${intToRoman(num1)}")
    println("Roman numeral for $num2: ${intToRoman(num2)}")
}