/*
    Day 6 : Tipe data range

    range tu rentang.
    kapan tipe data ini digunakan kasusnya gini cuy

    misalkan lu mau buat rentang angka 1 - 100
    kalau pakai arraykan ribet tu yak, mesti dimasukin atu-atu
    dengan range urusan ini akan dipermudah

 */

fun main() {
    //val range = 1..100; // tuh range naik pakai titik dua kali
    //val range = 1..100 step 2; // step digunain untuk kasi tambah rentangnya
                               // dibaca : 1 sampai 100 ditambah 2
                               // 1+2=3, 3+2=5, 5+2=7, dst
    val range = 100 downTo 2 step 2; // downTo dipake dri besar ke kecil

    println(range.count()) //untuk tau jumlah isi dari range
    println(range.contains(4)) // untuk cek nilai 23 ada gak dalam isi range
    println(range.first) // untuk cetak angka pertama dalam range
    println(range.last) // untuk cetak angka terakhir dalam range
    println(range.step) // untuk tau jenjang step kenaikannya
}