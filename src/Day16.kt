/*
    Day 16 : Belajar Extention Function

    Tipe data seperti String, Int, Long, atau library kotlin dari pihak ketiga
    tidak bisa diubah. Maka extention function adalah sebuah fitur untuk membuat
    function baru dalam tipe data tersebut.
 */

fun main() {

    // contoh implementasinya
    val name : String = "Teguh";
    println(name.hello())

    name.printHelloWorld();
    "Milo".printHelloWorld()
    "Zheyeng".printHelloWorld()

}

// contoh extention function
fun String.hello(): String = "Hello $this"; // $this mengambil nilai dari nilai tipe data String
fun String.printHelloWorld(): Unit = println("Hello World by $this");