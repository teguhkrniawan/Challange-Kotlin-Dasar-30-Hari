/*
    Day 20 :Tail Recursive Function
    Ketika kita memakai recursive function ada kalanya
    terkena stack ovweflow untuk mengatasi hal itu
    maka digunakan Tail Recursive function

 */

fun main() {

    tailrec fun display(value: Int){

        println(value)

        if (value > 0){
            display(value -1);
        }
    }

    // Tanpa tailrec harusnya error stack overflow
    //display(10000);

    // contoh lain untuk solving di recrusive

    tailrec fun recursiveFactorial(value: Int,total: Int = 1) : Int {
        return when(value){
            1 -> total
            else -> recursiveFactorial(value - 1, total * value)
        }
    }

    println(recursiveFactorial(100))

}

