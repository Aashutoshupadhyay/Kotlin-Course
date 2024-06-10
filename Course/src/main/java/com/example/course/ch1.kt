package com.example.course

import java.util.Scanner

// fun main(){
//    println("Hello Ashutosh !")
// }


//This is called single line comment;
/* This is called
 * multiline comment */


//Another form of main function that is accepted.
/*
 *  fun main (args:Array<String>){
     println("Hello world")
 }
 */

//Data  types
// 1. int - 10, 20 ,30
// 2. Long  - 234234554L, -234234554L
// 3. Float
// 4. Char
// 5. Double
// 6. Boolean
// 7. String

/*** Variables ***/
// Variables can be reassigned.package

// fun main () {
//     var name = "Ashutosh"
//     var lastName = "Upadhayay"
//     var rollNo = 24
// println("My first name is "  + name + " " + "last name is " + lastName +" " + "and roll no. is " + rollNo)
// }

/** Specific types of variables **/
// fun main(){
//     var rollNo:Int
//     rollNo=35		// This case is also allowed
//     var mobileNo:Long = 8287444755
// 	var price:Float = 80.24f
//     rollNo = 450  // value are reassigned
// 	var gender:Char = 'M'
//     var name:String = "Ashutosh"
//     var active:Boolean = false

//     println(rollNo)
//     println(mobileNo)
//     println(price)
//     println(active)
//     println(gender)
//     println(name)
// }

/* ####  val - read only local variables are defined using the keyword val.
 * This can be assigned at once and can't be changed.  */
//    ### DYNAMIC TYPES
// fun main(){
//     val rollNo = 23
//     val mobileNo = 8287444755
// 	val age = 20
//     val name = "Ashu"
//     val price = 3450
//     val gender = "M"
//     println(rollNo)
//     println(mobileNo)
//     println(name)
//     println(gender)
//     println(price)
// }

// ## Specific types
// fun main(){
//     val rollNo:Int
//     rollNo=350	// This case is also allowed
//     val mobileNo:Long = 8287444755
// 	val price:Float= 80.24f
// 	val gender:Char= 'M'
//     val name:String = "Ashutosh"
//     val active:Boolean = true

//     println(rollNo)
//     println(mobileNo)
//     println(price)
//     println(active)
//     println(gender)
//     println(name)
// }


/****** Arithmatical Operators *****/
// fun main(){
//     val a = 23
//     val b = 34
//     println(a+b) //Addition
//     println(a-b) // Subtraction
//     println(a*b) //Multiplication
//     println(a/b) // Divison
// 	println(a%b) // Modulus operator
//     println(b..a)
//     for(i in b..a){
//         println(i)
//     }
// }


/*** Comparision Operator ***/
// fun main(){
//     val a = 345
//     val b = 940
//     println(a>b) // grater than
//     println(a<b) // less than
//     println(a==b) // equal to
//     println(a>=b) //
//     println(b<=a) //
// }
//
// /** Equality Operator **/
// fun main (){
//     val a = 67
//     val b = 78
//     println(a==b)
//     println(a!=b)
// }

/** Logical Operator **/
// fun main(){
//     val a = 90
//     val b = 80
//     val c = 70
//     // And operator  both condition should be true
//     println((a>b) && (b>a))
//     println((a<b) && (b>a))
//     //Or operator anyone can be true
//     println((a>b) || (b>a))
//     println((c<b)|| (b>a))
// }

/** Increment and decrement operator **/
// fun main (){
//     var a = 1
//     println(a)
//     println(a++)
//     println(a)
//     println(++a)
//     println(a)
//
//     var b = 10
//     println(b)
//     println(b--)
//     println(b)
//     println(--b)
//     println(b)
//
// }

/*** Augemented operator ***/
// fun main (){
//     var a = 3
//     a += 5
//     println(a)
// }

/*** User Input ***/
//using readline()
//fun main(){
//    val name = readLine()
//    println(name)
//}

// readline only accept string value:
// for defined data types
//fun main(){
//    val name:String? = readLine()
//    println(name)
//    println(name!!::class.simpleName)  // This format will shows the data types
//}

/// Type Casting  like converted
//fun main(){
//    print("Enter roll no:")
//    val roll = readLine()!!.toInt()
//    println(roll)
//    println(roll::class.simpleName)  // This format will shows the data types
//}

/** Getting user input using scanner class **/
//fun main(){
////    print("Enter a name:")
//    val scanner = Scanner(System.`in`)
////    val name = scanner.next()
////    println(name)
////    println(name!!::class.simpleName)
//
//    // Converting  other data types
//    print("Enter a roll no:")
//    val roll = scanner.nextInt()
//    print("Roll No:")
//    println(roll)
//    println(roll::class.simpleName)
//}

//fun main(){
//    // Raw String
//    val message = """Hello,
//        |How are you and how can i help you ?
//    """
//    println(message)
//
//}

/****Conditional Statement***/
//{1.} If statement.............
//fun main(){
//    val a:Int =2
//    val b:Int= 50
//    val c:Int = 59
//    if (a<c){
//        println(c)
//    }

    /** IF-ELSE **/
//    if (a>b){
//        println("a is grater then b value of a is ${a} and b is ${b}")
//    }else{
//        println("Above condition is false and throwing a error.")
//    }

    /** WHEN Expression **/
//    val x = 60
//    when(x){
//        1->{
//            print("Step:")
//            println("1")
//        }
//        2->{
//            print("Step:")
//            println("2")
//        }
//        3->{
//            print("Step:")
//            println("3")
//        }
//        4->{
//            print("Step:")
//            println("4")
//        }
        /* Alternate Method */
//        in 1..9->{
//            println("One")
//            println("One")
//            println("One")
//            println("One")
//            println("One")
//            println("One")
//        }else->
//            println("Invalid Value")
//
//    }
//}

/*** Loops ***/
//1. For Loop
//fun main() {
//    for (item in 1..20){
//        println(item)
//    }
//
    // IN REVERSE MODE
//    for (item in 10 downTo 1){
//        println(item)
//    }

    /** WHILE Loop **/
//    var W = 1
//    while (W < 9){
//        W++
//        println(W)
//    }

     /**Do - While loop **/
//    var a = 6
//    do {
//        a++
//        println(" Hii meri Jaan")
//    }while (a<10)

    // BREAK AND CONTINUE STATEMENT IS EASY SO DON'T FIKAR ONLY BEFIKAR...
//}

/** Functions **/
fun main() {
    // function without parameter
    disp()
    val total = add()
}
fun disp(){
    val a= 10
    val b=20
    println(message = "value of a = ${a} and b = ${b}")
}
fun add(){
    
}