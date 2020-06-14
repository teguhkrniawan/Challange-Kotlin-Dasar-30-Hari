/*
    Day 14 : Belajar tentang unit dan return type

    unit itu kalau dijava adalah void.
    function yang tidak wajib mengembalikan nilai.
    default nya function yang kita buat pasti unit

    return type adalah function yang mengembalikan nilai
    wajib menuliskan tipe data kembalian

 */

fun main() {
    // cara output 1
    println(sum(10, 10));

    // cara output 2
    val tangkapSum = sum(10, 15);
    println("Hasil tangkap sum $tangkapSum");

    // panggil bagi
    val tangkapBagi = bagi(15, 0);
    println("Hasil bagi dari function bagi $tangkapBagi")
}

// contoh return type
fun sum(angka1: Int, angka2: Int) : Int{
    val total : Int = angka1 + angka2;
    return total;
}

// contoh kedua return type
fun bagi(angka1: Int, angka2: Int) : Int {

    // jika angka ke dua == 0
    if (angka2 == 0){
        return 0;
    } else {
        val total = angka1 / angka2;
        return total;
    }
}