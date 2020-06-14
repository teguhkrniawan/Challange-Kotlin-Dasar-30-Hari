/*

    while itu perulangan yg sifarnya cek kondisi terlebih dhulu
    jika bernilai benar lanjut, jika tidak bernilai false

 */

fun main() {

    var total = 0

    while (total < 10){
        println("Total ke - $total");
        total++
    }

    println("Total keseluruhan : $total")

    /*
        Pseucode nya begini :
        total kan = 0 tu
        jdi ketika while ngecek apakah total < 10
        maka
        1.cetak total ke - {nilai total saat pengecekan}
        2.total = total + 1
        keluar dari while
        dan cetak total keseluruhan

        total keseluluran kok 10 ?
        iya dong.
        nilai pertama 0 = +1
        nilai 1 = +1
        nilai 2 = +1
        nilai 3 = +1
        nilai 4 = +1
        nilai 5 = +1
        nilai 6 = +1
        nilai 7 = +1
        nilai 8 = +1
        nilai 9 = +1
        nilai 10 ? tidak dijalankan karena kan syrat whileya total < 10 , kalau 10 < 10 ya nilainya false
     */

    var i = 0

    do {
        println("Hai ini perulangan do ke $i");
        i++;
    } while (i < 10)
}