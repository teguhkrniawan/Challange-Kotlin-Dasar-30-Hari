/*
    Day 7 : Operasi matematika

    ya kek biasa cuy operasi matematikanya ada plus minus bagi kali modulo
 */

fun main() {
    val result1 : Double = 12.0 / 5.0;
    println(result1);

    val result2 : Int = 10 + 10 / 2;
    println(result2)

    // Augmanted assignment
    /*
        etc : a = a + 100;
     */

    var totalCost : Int = 0;

    val item1 : Int = 100_000;
    totalCost += item1; // totalCost = totalCost + item1

    val item2 : Int = 27_000;
    totalCost += item2;

    val item3 : Int = 2_000;
    totalCost -= item3;

    println(totalCost);

    // Unary Operator
    /*
        etc : a = a + 1
     */

    totalCost++;
    println(totalCost)
}