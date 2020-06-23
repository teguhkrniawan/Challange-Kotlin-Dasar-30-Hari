/*
    Day 18 : Menggunakan return pada if atau when

 */

fun main() {
    // scope function ini hanya bisa diakses oleh function main
    fun sayHello(name: String = "") : String {
//        return if (name == ""){
//            "Hello Bro!"
//        } else {
//            "Hello $name"
//        }

        // pakai when juga bisa
        return when(name){
            "" -> "Hello Bro"
            else -> "Hai $name"
        }
    }

    // cetak function sayHello()
    println(sayHello());
    println(sayHello("Teguh"))
}