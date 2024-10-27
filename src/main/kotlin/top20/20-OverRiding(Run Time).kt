package top20

open class Person{
    open fun info(){
        println("Details of person")
    }
}

class Person1(val name:String):Person(){
    override fun info() {
        println("Name of the first person is $name")
    }
}

class Person2(val name:String):Person(){
    override fun info() {
        println("Name of the first person is $name")
    }
}
// overriding the info method

fun main(){
    val vasu = Person1("Vasu")
    val tanu = Person2("Tanu")

    vasu.info()
    tanu.info()
}