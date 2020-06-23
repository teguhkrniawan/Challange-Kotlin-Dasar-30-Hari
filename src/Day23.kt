/*
    Day 23 : Anonymous Function

 */

fun main() {

    fun hello(name: String, transform: (String)->String): String {
        val nameTransform = transform(name);
        return "Hello $nameTransform"
    }

    val anonymousUpper = fun (value: String): String {
        if (value == ""){
            return "Bro"
        } else {
            return value.toUpperCase()
        }
    }

    val buatHello = hello("Teguh", anonymousUpper)
    val parameterKosong = hello("", anonymousUpper)

    println(buatHello)
    println(parameterKosong)

}
