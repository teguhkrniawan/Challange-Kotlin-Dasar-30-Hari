/*
    Day 3 : Tipe data character,boolean, dan string

    character itu tipe data yang merupakan karakter huruf
    artinya satu huruf doang. Misalkan T, E, G, U, H

    tipe data nya di representasikan dengan Char
    dan ditandai dengan tanda kutip satu (')

    Let's go to do it
 */

fun main(){

    var T : Char = 'T';
    var I : Char = 'I';
    var R : Char = 'R';

//    print(T);
//    print(I);
//    print(R);

    /*
        Next

        Tentang Boolean, merupakan tipe data yang bernilai benar atau salah
        (True atau False).

     */

    var right : Boolean = true;
    var wrong : Boolean = false;

//    println(right)
//    println(wrong)

    /*
        Next

        Tentang String, merupakan tipe data kumpulan dari karakter
        simplenya ya thats is a sentence(kalimat).

        dalam string bisa memakai tanda kutip dua atau tiga
        bedanya sebagai berikut :
            " -> digunakan untuk membuat satu baris kalimat
            """ -> digunakan untuk membuat lebih dari satu baris kalimat
     */

    var firstName : String = "Teguh";
    var lastName : String = "Kurniawan";
//    var address : String = """
//        Jalani aja dulu No.15,
//        Kecamatan Bangko,
//        Bagansiapiapi-Riau,
//        Indonesia
//    """;

    /*
        pada variabel address kalau dijalankan pasti ada kejanggalan pada
        barisnya, masuk kedalem kan. untuk mengatasi hal tersebut kita pakai
        trim. Dalam kasus ini trim adalah menggabungkan beberapa line menjadi satu line.

        function nya ialah : trimMargin()

        pakai simbol | untuk menggabungkannya

        Let's do it.
     */

//    var address : String = """
//        |Jalani aja dulu No.15,
//        |Kecamatan Bangko,
//        |Bagansiapiapi-Riau,
//        |Indonesia
//    """.trimMargin();

    // atau bisa begini

    var address : String = """
        >Jalani aja dulu No.15,
        >Kecamatan Bangko,
        >Bagansiapiapi-Riau,
        >Indonesia
    """.trimMargin(">"); // biar seenak hati gitu simbolnya gak monoton simbol | aja


//    println(firstName);
//    println(address);

    /*
        Next

        Dalam kotlin penggabungan string menggunakan simbol dolor
        ${isi ekspresi} digunakan untuk permasalah yang lebih kompleks

        haa gimana gimana ?

        let's do it

     */

    // diatas kan uda variabel firstName dan lastName, yok gabungin

    var fullName : String = "$firstName $lastName"; // penggunaan $ untuk kasus simple
    var descriptionLength : String = "Panjang atau Length dari $firstName adalah ${firstName.length}";

    println(fullName);
    println(descriptionLength);

}