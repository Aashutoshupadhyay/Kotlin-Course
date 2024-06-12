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
fun age(){
    println("Your Age:")
    var age = readln().toInt()
    println("Entered age is $age")
}
// Function with named argument
fun named(x:Int, y:Int){
    var sum = x + y;
    println("The total of $x and $y is ${sum} . ")
}
// Lamdas And Higher order function:
// LAMDAS;
/** This is the act as a function that can be used anywhere as a function without declaration the function syntax. **/
var lamdas = {
    println("Hello! How are you ?")
    println(" I am a lamdas expression.")
}
val square = {x:Int -> x*x}
var add = {x:Int , y:Int -> x+y}
var all = {
    println("The square of given digit is ${square(5)}");
    println("The addition of given digit is ${add(2,5)}")
}
fun main() {
    // Calling Simple Function
//    name1()
    // Calling function with parameter
//    detail(
//        "Ashu","Gopal Upadhyay","Sushila Devi", "Gali No.17 Baprola Vihar"
//    )
//    named(x=5, y=10)
//    age()
//    lamdas()
all()

}


