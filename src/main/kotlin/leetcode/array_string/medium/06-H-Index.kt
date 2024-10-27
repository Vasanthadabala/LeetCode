package leetcode.array_string.medium

fun hIndex(citations:IntArray):Int{

    citations.sortDescending()  //6,5,3,1,0

    for (i in citations.indices){

        if (citations[i] < i+1){
            return i
        }
        
        //loop 1 ---- 6 < 0+1 false
        //loop 2 ---- 5 < 1+1 false
        //loop 3 ---- 3 < 2+1 false
        //loop 4 ---- 1 < 3+1 true so this would be the hIndex
        // There are  3 papers with 3 citations
        // Because here output is i means index is 3 but in papers count it is 3+1=4.
        // But 4th one is failed so its index 3 is returned so we count as 3 papers or three iterations
    }

    return citations.size
    //if all papers have more citations than thier index,hIndex woould be total number of papers
}

fun main(){

    val array = intArrayOf(3,0,6,1,5)

    val hIndex = hIndex(array)
    println("H-Index: ${hIndex}")
}