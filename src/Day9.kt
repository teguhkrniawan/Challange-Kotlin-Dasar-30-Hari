/*
    Day 9 : Belajar if expression & when expression

    when expression itu switch case kalau
    dibahasa pemrograman lain
 */

fun main() {

    val examValue : Int = 72;

    // contoh if else
//    if (examValue > 70){
//        println("Welcome to spaceX university")
//    } else {
//        println("Sorry, you not accepted")
//    }

    // Contoh when biasa
    val finalExam : String = "F";

//    when(finalExam){
//        "A" -> {
//            println("Very Good")
//        }
//        "B" -> {
//            println("Good")
//        }
//        "C" -> {
//            println("Not Bad")
//        }
//        "D" -> {
//            println("Bad")
//        }
//        "E" -> {
//            println("Very Bad")
//        }
//        else -> {
//            println("Ups, nilai finalExam kamu diluar kondisi")
//        }
//    }

    // when expression multiple option
    // ini merupupakan grup dari when

//    when(finalExam) {
//        "A", "B", "C" -> println("Congratulations");
//        else -> {
//            println("Sorry you rejected");
//        }
//    }

    /*
        Ada fitur kotlin yang sangat memudahkan kita untuk mengecek
        data dalam array namanya when expression in
        cth : dalam suatu array punya nilai string A, B, C
        ketika when(A) untuk mengecek apakah A ada dalam array makan dipakai in
     */

    val valueExam : Array<String> = arrayOf("A", "D", "D");
    // kasus nya kalau ada nilai ujian yang A berarti lulus

    // variabel finalExam diatas akan value nya F
    when(finalExam){
        in valueExam -> println("Kamu Lulus"); // cek divalueexam ada gak finalExam == F kalau ada cetak kamu lulus
        !in valueExam -> println("Sorry, coba lagi tahun depan"); //negasi dri pernyataan diatas
    }

    /*
        When juga bisa sebagai pengganti if else
     */

    val valueMath : Int = 87;
    when {
        valueMath > 90 -> println("Tidak Remedial");
        valueMath > 80 -> println("Tidak Remedial Tapi Perbaikan")
        else -> println("REMEDIAL")
    }


}