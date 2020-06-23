/*
    Day 24 : Label

    label itu penanda, biasanya digunakan pada expression break, continue, dan return

 */

fun main() {

    // Contoh pada break
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j > 5)
                break@loopI
            println("$i x $j = ${i*j}")
        }
        println("==============================")
    }

}