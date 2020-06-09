/*
    Day 4: Belajar Tentang Variabel

    Variabel tu ada 2 jenis :
    Mutable dan Imutable

    Mutable : nilai dari variabel bisa diganti.
    Imutable : nilai dari variabel tidak bisa diganti.

    val : untuk imutable
    var : untuk mutable

    nullable adalah nilai variabel yang berisikan null

    const adalah variabel global(diluar function)
    dan sifatnya Imutable
 */

// Penggunaan const untuk variabel global
// *rekomendasi menggunakan penulisan UPPER_CASE

const val APP : String = "My Program";
const val VERSION : String = "1.0.0";

fun main(){

    val age : Int = 20; // nilai age tetap
    //var firstName : String = "stephen"; // nilai nama bisa diubah

    // ubah nilai firstName
    //firstName = "william";
    // println("Hi my name $firstName");

    /*
        Penerapan nullable digunakan untuk menyatakan variabel tersebut
        bernilai null.
        Kegunaan nullable digunakan jika kita mengakses kode java,mau tidak mau
        harus membuat null pada variable.

     */

    var firstName : String? = "Eko" //tanda tanya setelah tipe data menandakan variabel ini boleh null

    firstName = null;
    //println(firstName);
    //println("nilai length ${firstName?.length}"); //penggunaan tanda tanya karena firstName = null

    println("$APP $VERSION");
}