package top20

fun matchingElements(array:IntArray):List<Int>{
    var seen = mutableSetOf<Int>()
    var duplictes = mutableListOf<Int>()
    for(num in array){
//        if(!seen.add(num)){
//            duplictes.add(num)
//        }
        if(!seen.contains(num)){
            seen.add(num)
        }else{
            duplictes.add(num)
        }
    }
    return duplictes.toList().sorted()
}
fun main(){
    val array = intArrayOf(1, 2, 3, 4, 2, 5, 1, 6, 7, 3)
    val dulpicates = matchingElements(array)
    println("Duplicate elements: $dulpicates")
}