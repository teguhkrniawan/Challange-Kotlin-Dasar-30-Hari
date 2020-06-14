/*
    Day 14 : Belajar single expression function

    singgle expression function digunakan ada function yang memiliki
    baris perintah 1 baris doang.
    jadi penulisannya bisa disingkat

    ex :

    fun hasilKali(a: Int) : Int {
        return a * 2
    }
 */

fun main() {
    val tampungHasilKali = hasilKali(8);
    println("Hasil Kali $tampungHasilKali")
    sapaDunia("Teguh");
}

fun hasilKali(a: Int) : Int = a * 2; // single expression function return type
fun sapaDunia(name :String) : Unit = println("Hai Dunia Saya $name"); // single expression function unit