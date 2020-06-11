/*
    Day 10 : For Loop

    for digunakan untuk mengulang iterasi
    dimana iteratornya ialah (array, range, dll)

 */

fun main() {

    // Contoh for penggunaan iterator array
    val names : Array<String> = arrayOf("Teguh", "Amy", "Saphira", "Epipany");
//    for (name in names){ // name adalah variable untuk menampung hasil perulangan
//        println(name);
//    }

    // Contoh for penggunaan iterator range
//    for (number in 1..100){
//        println(number);
//    }

    // Contoh for kombinasi iterator array dan range
    val ukuranArray = names.size - 1 // names.size = 4 kan tu, jadi untuk dapat value index yg
                                     // dimulai dari 0 kita kurangin satu

    for (i in 0..ukuranArray){ // 0..ukuranArray = 0 s/d ukuranArray
        println("index ke $i adalah ${names.get(i)}") // names.get(i), ambil data array, dimana get(i) yang i nya hasil perulangan
    }

}