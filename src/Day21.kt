/*
    Day 21 : Penggunaan lambda

    lambda adalah penulisan function dalam variabel

 */

fun main() {

    // function lambda
    /*
        Val namaVariabel: (parameter1, parameter2) -> return type data { nama parameter1, nama parameter2
            -expression code
            -baris terakhir pasti akan bernilai return
        }
     */
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val myName = "$firstName $lastName"
        myName
    }

    // cara panggil
    val dipslayMyName = contohLambda("Teguh", "Kurniawan")
    println("Hai Saya $dipslayMyName")

    // Penggunaan it
    /*
        Penggunaan it digunakan untuk memanggil pada lambda function
        yang hanya memiliki 1 parameter
     */

    val contohIt: (String) -> String = {
        val myName = "$it"
        myName
    }

    val sayHi = contohIt("Amy")
    println("Hi $sayHi")

    // Penggunaan Method References
    /*
        digunakan untuk menuliskan funcion yang sudah ada kedalam bentuk lambda
     */

    val lambdaNameCapslock: (String)->String = ::toUpper
    val name = lambdaNameCapslock("teguh")
    println("Bacot lu $name")

}

//fun toUpper(value: String) : String {
//    return value.toUpperCase()
//}

fun toUpper(value: String) : String = value.toUpperCase()