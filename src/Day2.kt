/*
    Day 2 : Belajar tipe data number

    ada beberapa jenis tipe data untuk number
    - Integer Number (bilangan bulat)
    - Floating Point Number (bilangan pecahan atau berkoma)
    - Literals (bilangan yang misalkan untuk hexadesimal atau binary)
                                             hexadesimal : itu seperti kode warna
                                             binary : itu 0 dan 1
       studi kasus literals biasanya dipakai untuk pembuatan image processing atau
       yang berurusan dengan kode mesin (binary)

    Integer Number ada beberapa tipe data yang umum :
    * Byte : rentang angka -127 s/d 127
    * Short : rentang angka -3100 s/d 3100 gitu
    * Int : rentang angka milyaran
    * Long : rentang angka diatas milyaran

    Floating Point Number ada beberapa tipe data yg umum :
    * float : jarang dipake intinya
    * double : sering banget dipake

    - Underscore (_) pada integer bisa digunakan sebagai pemisah bilangan atau biasa disebut seperator

    - Conversion
      digunakan untuk mengubah suatu bilangan bertipe data X menjadi tipe data B
      contoh kasus kita mau meratakan nilai ujian dengan hasil bilangan desimal
      tapi di sistem jenis inputan data adalah bilangan bulat, maka digunakan Conversion


 */

fun main(){

    // Integer number
    var age: Byte = 30; // age : umur
    var height: Short = 200; // height : tinggi
    var distance: Int = 5678; // distance : jarak
    // Penggunaan Undescore
    var balance: Long = 10_000_000L; //balance : saldo, setelah angka ada L maksudnya menandakan itu Long

    println(age);
    println(height);
    println(distance);
    println(balance);

    // floating point number
    var value: Float = 23.456F; // value : nilai, setelah angka ada huruf F yang nandakan dia float
    var radius: Double = 236732.98212; // radius: jarak jangkauan

    println(value);
    println(radius);

    // Literals
    var hexadecimalOfColor: Int = 0xFFFFFF; //arti sintaks ini nilai integer dari hexadecimal_of_color = #FFFFFF
    var binary: Int = 0x0101;

    println(hexadecimalOfColor);
    println(binary);

    // Conversion
    /*
        variabel.toByte()  : ke Byte
        variabel.toShort() : ke Short
        variabel.toInt() : ke Int
        variabel.toLong() : ke Long
        variabel.toFloat() : ke Float
        variabel.toDouble() : ke Double
     */

   var valueToInt: Int = value.toInt();
    println(valueToInt);

}