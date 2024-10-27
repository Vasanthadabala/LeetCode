package top20

fun fibonacci(num:Int):Int{
    if (num<=1){
        return num
    }else{
        return fibonacci(num-1)+fibonacci(num-2)
    }
}

fun  main(){
    val num = 10
    println("Fibonacci series up to $num terms:")

    for (i in 0 until num){
        print("${fibonacci(i)} ")
    }
}