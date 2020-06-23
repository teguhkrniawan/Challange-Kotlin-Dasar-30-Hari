/*
    Day 19 : Funtcion Recursive

    lihat koding dibawah deh biar paham
    studi kasus nya faktorial ni

    cth faktorial
    5! = 5 * 4 * 3 * 2 * 1

 */

fun main() {

    // faktorial cara sederhana dengan looping
    fun loopingFactorial(value: Int) : Int {
        var result: Int = 1;
        for(i in value downTo 1){
            result *= i;
        }

        return result;
    }

    println(loopingFactorial(5));

    // faktorial dengan recursive function
    fun recursiveFactorial(value: Int) : Int {
        return when(value){
            1 -> 1
            else -> value * recursiveFactorial(value-1)
        }
    }

    println(recursiveFactorial(5))

}