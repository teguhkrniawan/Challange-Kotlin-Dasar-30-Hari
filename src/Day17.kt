/*
    Day 17 : Infix Notation Function

    intinya kita mau buat kaya 1000 downTo 1
    downTo nya itu yang mau kita buat.

    Syarat infix notation
    1. Harus sebagai member function (dalam OOP) atau function extention
    2. Harus punya 1 Parameter
    3. Parameter tidak boleh vararg tidak boleh ada nilai default
 */

fun main() {
    val name = "Teguh" to "UP";
    //atau
    //val name = "Teguh".to("LO");
    println(name)
}

// ini function infix
// function ini untuk buat capslock pada nilai String yang dimasukan
infix fun String.to(type : String) : String {
    if (type == "UP"){
        return this.toUpperCase(); // this karena kita mau ambil nilai Stringnya
    } else {
        return this.toLowerCase();
    }
}