fun main() {
    println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>")
    println("rotator")
    println("isPalindrome : ${isPalindrome("rotator")}")
    println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>")
    println("civic")
    println("isPalindrome : ${isPalindrome("civic")}")
    println("<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>")
    println("tralala")
    println("isPalindrome : ${isPalindrome("tralala")}")
}

fun isPalindrome(text:String):Boolean{
    val textLen = text.length

    if (textLen<2){
        return true
    }

    return text.first()==text.last()

}