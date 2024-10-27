package leetcode.hash_map.easy

fun isIsomorphic(s:String, t:String):Boolean{
    val sTot = mutableMapOf<Char, Char>()
    val tTos = mutableMapOf<Char, Char>()

    for (i in s.indices){
        val charS = s[i]
        val charT = t[i]

        if (sTot[charS] != null && sTot[charS] != charT ||
            tTos[charT] != null && tTos[charT] != charS
            ){
            return false
        }

        sTot[charS] = charT
        sTot[charT] = charS
    }

    return true
}
fun main(){
    val s = "egg"
    val t = "add"

    println("$s and $t is Isomorphic: ${isIsomorphic(s,t)}")
}