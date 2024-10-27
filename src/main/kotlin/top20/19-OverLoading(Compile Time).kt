package top20

class Adding{
    fun add(a:Int, b:Int):Int{
        return a+b
    }

    fun add(a:String, b:String):String{
        return a+b
    }
}

fun main(){
    val adding = Adding()
    val int = adding.add(1,2)
    val double = adding.add("Hello", " World!")

    println(int)
    println(double)
}