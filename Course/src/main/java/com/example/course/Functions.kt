package com.example.course
// Simple function
fun name1(){
    println("Enter Your Name:")
    val n = readln().toString();
    println("Your name is $n")
}
// Function With Argument/ Parameter.
fun detail(name:String , fName:String , mName:String , address:String) {
     println("""
         Your name is $name
         Your Father name is $fName
         Your Mother name is $mName
         Your Address is $address
     """.trimIndent())
}
fun main() {
    // Calling Simple Function
    name1()
    // Calling function with parameter
    detail(
        "Ashu","Gopal Upadhyay","Sushila Devi", "Gali No.17 Baprola Vihar"
    )
}


