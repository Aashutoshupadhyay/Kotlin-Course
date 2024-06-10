package com.example.course

import java.util.Scanner

/*
// Variables
// We declare two types of variables
// Var and Val
var name = "Ashutosh Upadhyay"  //{ It can be reassigned}.
val Name = "Ashutosh Kumar Upadhyay" //{It can't be reassigned}.
 /*** Data Types ***/
var num1:Int = 2;
var num2:Double = 2.227
var num3:String = "Ashutosh"
var num4:Char = 'A'
var num5:Float = 2.22F
var num6:Boolean = true
var game:Array<String> = arrayOf("Cricket","PUBG")
            /** Type Casting/Type Interference **/
var number = 4

*/

/** User Input **/
/*
// Using the readline
fun main(){
    println("Enter your Name : ")
    val Name1 = readln() // using readln
    println("You Entered the name is ${Name1}")

    println("Enter Name")
    var fatherName = readlnOrNull() // Using readln or null
    println("Your father name is ${fatherName}")
    // We can also take user input with readline()
}
*/
/////// Using the Scanner
/*
fun main() {
    print("Enter a name:")
    val scanner = Scanner(System.`in`)
    val name = scanner.next()
    println(name)
  println(name!!::class.simpleName)

}
*/

/** All Operators. **/
//fun main(){
//    val a = 5
//    val b = 2
//    println(a+b) //Addition
//    println(a-b) // Subtraction
//    println(a*b) //Multiplication
//    println(a/b) // Divison
//    println(a%b) // Modulus operator
//    println(b..a)// Range Operators.
//    for(i in b..a){
//        println(i)
//    }
//}
/*** Comparision Operator ***/
//fun main(){
//    val a = 345
//    val b = 940
//    println(a>b) // grater than
//    println(a<b) // less than
//    println(a==b) // equal to
//    println(a>=b) //
//    println(b<=a) //
//}
/** Equality Operator **/
//fun main (){
//    val a = 67
//    val b = 78
//    println(a==b)
//    println(a!=b)
//}
/** Logical Operator **/
//fun main(){
//    val a = 90
//    val b = 80
//    val c = 70
//    // And operator  both condition should be true
//    println((a>b) && (b>a))
//    println((a<b) && (b>a))
//    //Or operator anyone can be true
//    println((a>b) || (b>a))
//    println((c<b)|| (b>a))
//}
/** Increment and decrement operator **/
//fun main (){
//    var a = 1
//    println(a)
//    println(a++)
//    println(a)
//    println(++a)
//    println(a)
//
//    var b = 10
//    println(b)
//    println(b--)
//    println(b)
//    println(--b)
//    println(b)
//
//}

/** Control Flow **/
// 1. If Satement;
//fun main() {
//    println("Enter a number:")
//    val i = readln().toInt()
//    println("You entered the no. ${i}")
//    if (i<9){
//        println("Entered no is less than 9")
//    }
//}

// 2. If-Else Statement;
/*
fun main() {
    println("Enter the number of science subject:")
    var num = readln().toInt()
    if (num>90&& num<100){
        println("You received the Grade A.💕")
    }
    else if(num>80&& num<=90){
        println("You received the Grade B.💕")
    }
    else if(num>70&& num<=80){
        println("You received the Grade C.💕")
    }
    else if(num > 100){
        println("Are you cheating me !! 😡🤬😡🤬")
    }
    else{
        println("You Failed.")
    }
}
*/


/** Loops Constructs **/
// 1. For loop
//fun main() {
//    println("Enter the number of your marks:")
////    var m = arrayOf(readln())
//    var m = readln().toInt()
//    println("Output Is this : ")
//    for (item in m..50){
//        println(item)
//    }
//}

// 2. do-While Loop;
//fun main() {
//    println("Enter the favourite Hero:")
//    var h = readln().toString()
//    println("Output Here:")
//    do {
//        println(" Aapko Bhi heroes Pasand hai.")
//    }while (h == "Amitabh Bachan" )
//}

/** WHEN Expression **/
fun main() {
    val x = 20
    when (x) {
//        1 -> {
//            print("Step:")
//            println("1")
//        }
//
//        2 -> {
//            print("Step:")
//            println("2")
//        }
//
//        3 -> {
//            print("Step:")
//            println("3")
//        }
//
//        4 -> {
//            print("Step:")
//            println("4")
//        }

    /* Alternate Method */
        in 1..9->{
            println("One")
            println("One")
            println("One")
            println("One")
            println("One")
            println("One")
        }else->
            println("Invalid Value")
    }
}
