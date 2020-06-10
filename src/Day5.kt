/*

    Day 5:

    Array itu tipe data yang berisikan kumpulan tipe data.
    Array dalam kotlin sama dengan java hanya untuk tipe data yang sama.
    Misalkan tipe data string yaudah isi sama string semua.

    Array panjangnya nya itu wajib ditetapkan
    tidak bisa ditambah tidak bisa dikurang.
    kalau panjangnya 5 yasudah 5
 */

fun main(){

    // contoh array dalam kotlin
    val members : Array<String> = arrayOf("Steve", "Bill", "Musk"); // arrayOf adalah function penampung isi array

    //println(members); //perintah ini hanya mencetak nilai memori array

    /*
        Array punya beberapa operasi atau function
        variabel.size -> untuk mendapatkan panjang array
        variabel.get(index) -> mendapatkan data diposisi index
        variabel[index] -> mendapatkan data diposisi index
        variabel.set(index, value) -> mengubah data pada posisi index
        variabel[index] = value -> mengubah data pada posisi index
     */

    println("Jumlah length array members : ${members.size}");
    println("data members index ke 2 sebelum diubah: ${members[2]}")

    members[2] = "Woody";
    println("data members index ke 2 setelah diubah : ${members[2]}");

    /*
        loh kok variabel mutable kek val bisa diubah ?
        jangan salah pemahaman dulu. val itu yang gak bisa diubah datanya
        bukan isi datanya. Maksudnya gini

        val members : Array<String> = arrayOf("A", "B", "C");
        mau kamu ubah kek gini :
        members = arrayOf() -> nah ini error sih

     */

    /*
        Well, array yang kita buat tadi secara default isi array gak boleh null
        yap bakal error kalau ada null. Dibawah ini gua bakal kasi contoh
        penggunaan nullable dalam array

     */

    val balance : Array<Int?> = arrayOfNulls(5); // begini sintaks array yg boleh null

    //coba cetak ya
    println("============ Nullable Array ===========");
    //println(balance[2]) // tuhkan null gaes
    balance[0] = 1_000_000;
    balance[1] = null;
    balance[2] = 1_00;
    balance[3] = null;
    balance[4] = 5_000_000;

    println("value of index 0, 1, 3 is ${balance[0]}, ${balance[1]}, ${balance[3]}")

}