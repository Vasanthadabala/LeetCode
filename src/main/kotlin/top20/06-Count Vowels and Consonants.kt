package top20

fun countingVowelAndConsonant(word:String):Pair<Int,Int>{
    var vowelCount = 0
    var consonantCount = 0

    val vowels = setOf('a','e','i','o','u')

    val cleanedWord = word.lowercase()

    for(letters in cleanedWord){
        when{
            letters in vowels -> vowelCount++
            letters.isLetter() -> consonantCount++
        }
    }

    return Pair(vowelCount,consonantCount)
}
fun main(){
    val inputWord = "Hello World"
    val (vowels,consonats) = countingVowelAndConsonant(inputWord)

    println("Number of Vowels: $vowels")
    println("Number of Consonants: $consonats")
}