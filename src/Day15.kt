/*
    Day 15 : varargs pada paremeter

    apa itu varargs ?
    varargs itu variable arguments yang sederhananya menjadikan
    parameter terakhir dalam function menjadi array

 */



fun main() {
    //val isiValues : Array<Int> = arrayOf(10, 10, 10, 20, 30)
    //val tampungFunction = hitungTotal("Teguh",isiValues)
    val tampungFunction = hitungTotal("Teguh", 10, 20, 10, 15, 90, 20)
    println("Berat Badannya $tampungFunction")
}

//fun hitungTotal(name: String, values: Array<Int>) : Int {  // Contoh penggunaan array biasa dalam function
fun hitungTotal(name: String, vararg values : Int) : Int { // contoh penggunaan vararg
    println("Nama : $name")

    var total = 0;

    for (value in values){
        total += value;
    }

    return total;
}