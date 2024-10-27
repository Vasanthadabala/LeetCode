package top20

fun main(){
    var array = arrayOf(1,2,2,3,4,4)
    var newArray = mutableListOf<Int>()

    for (i in array){
        if(!newArray.contains(i)){
            newArray.add(i)
        }
    }

    println("New Array List $newArray")


}