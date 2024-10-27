package top20

fun checkingPrimeNumber(value:Int):Boolean{
    if (value < 2){
        return false
    }

    for (i in 2 until value/2+1){
        if (value % i == 0){
            return false
        }
    }

    return true
}

fun main(){
    val number = 29

    if (checkingPrimeNumber(number)){
        println("$number is a prime number")
    } else {
        println("$number is not a prime number")
    }
}