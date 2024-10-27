package top20

fun main(){
    var a = 10
    var b = 5

    println("Before swap: a = $a, b = $b")

    a = a+b // a=15
    b = a-b // b=15-5=10
    a = a-b // a=15-10=5

    println("After swap: a = $a, b = $b")
}