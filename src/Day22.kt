/*
    Day 22 : High-Order Function

    lambda sebagai parameter.

 */

fun main() {

    /**
     * @param name : nama sebagai string
     * @param transformer : lambda parameter, parameter String, return value String
     * @return sayHello : bernilai String
     */
    fun transformHello(name: String, transformer: (String) -> String) : String {
        // Tampung nilai name yang ditangkap dalam variabel
        val nameTransform = transformer(name)
        return nameTransform
    }

    // isi parameter lambda dalam variabel
    val isiParameterLambda = {value: String -> value.toUpperCase()}

    // cetak ke terminal
    //println(transformHello("Teguh", isiParameterLambda))

    // atau
    //println(transformHello("TEGUH", {value: String -> value.toLowerCase()}))

    // atau pakai trailling lambda, syaratnya parameter dari function adalah lambda
    val result = transformHello("teguh") {
        value: String ->  value.toUpperCase()
    }

    println("Testing $result dalam trailing lambda")
}