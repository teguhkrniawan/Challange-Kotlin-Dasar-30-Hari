/*
    Day 8 : Boolean dan Operasi perbandingan


 */

fun main() {

    val a = 100;
    val b = 200;

    // contoh operator perbandingan yang haislnya boolean
    //val result : Boolean = a <= b;
    //println(result);

    // operasi boolean
    val valueExam = 80;
    val valueAttendance = 79;

    val passExam = valueExam >= 80; // passing grade nilai ujian
    val passAttendance = valueAttendance >= 80; // passing grade nilai absen

    val result : Boolean = passExam && passAttendance;
    println(result)

}