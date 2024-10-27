package top20

open class Animal(val type:String){
    var animalSound : String = "sound"

    open fun typeAndSound(){
        println("Animal type $type and sound it makes $animalSound")
    }
}

class Dog(type:String, val sound:String):Animal(type){
    init {
        animalSound = sound
    }
    fun sound(){
        println("Dog Make Sound: $sound")
    }
}

class Cat(type:String, val sound:String):Animal(type){
    init {
        animalSound = sound
    }
    fun sound(){
        println("Cat Make Sound: $sound")
    }
}

fun main(){
    val dog = Dog("Dog", "Bow")
    val cat = Cat("Cat", "Meow")

    dog.sound()
    dog.typeAndSound()

    cat.sound()
    cat.typeAndSound()
}