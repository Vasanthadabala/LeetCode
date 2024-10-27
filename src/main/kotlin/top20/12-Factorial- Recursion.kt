package top20

fun factorial(num:Int):Int{
    if (num==1){
        return 1
    }else{
        return factorial(num-1)*num
    }
}

fun main(){
    val fac = 5
    val result = factorial(5)
    println("Input Value: $fac")
    println("Fibonacci Value: $result")
}