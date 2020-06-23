/*
    Day 13 : Belajar tentang function
 */

fun main() {
    sayHello();
    sayParameter("Teguh", null);
    sayParameter("Gissele", "Manja S");
    sayParameterDefault("Gigi")
    // sayParameterDefault("Gigi", "Sugigi", 22)
    // pemanggilan parameter juga bisa menggunakan nama, disebut named argument
    sayParameterDefault(
        lastName = "Sugigi",
        age = 29,
        firstName = "Gigi"
    );
}

// function parameter
fun sayParameter(firstName : String, lastName : String?) { // String? = null
    if (lastName == null){
        println("Hi $firstName");
    } else {
        println("Hi $firstName $lastName");
    }
}

// function default paramater
fun sayParameterDefault(firstName: String, lastName: String? = null, age: Int = 10){
    /*
        Kelebihan default parameter kita gak wajib mengisi parameter saat pemanggilan
     */

    if (lastName == null){
        println("Hi aku $firstName, aku berumur $age");
    } else {
        println("Hi aku $firstName $lastName dan aku berumur $age")
    }
}

// hak akses private
private fun sayHello(){
    println("Hai World");
}