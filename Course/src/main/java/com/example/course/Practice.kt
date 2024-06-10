package com.example.course

// Ques-1:  Create a program that show the Grade according to their marks  ?
// Ans:
//Using the if else Statement
fun gradeCalculator() {
    println("Enter Your Marks :")
    val m = readln().toInt();
    if (m in 91..100) {
        println("You received the Grade A as your marks is ${m}")
    } else if (m in 81..90) {
        println("You received theb Grade B as your marks is ${m}")
    } else if (m in 71..80) {
        println("You received theb Grade C as your marks is ${m}")
    } else if (m in 61..70) {
        println("You received theb Grade D as your marks is $m")
    } else if (m in 2..59) {
        println("You are Failed  as your marks is ${m}. You need to do more practice.")
    } else {
        println("Enter a valid marks.")
    }
}

// Using the when statement
fun gradeCalculator1() {
    println("Enter Your Marks :")
    val m = readln().toInt();
    when (m) {
        in 91..100 -> {
            println("You received the Grade A as your marks is $m")
        }

        in 81..90 -> {
            println("You received the Grade B as your marks is ${m}")
        }

        in 71..80 -> {
            println("You received the Grade C as your marks is ${m}")
        }

        in 61..70 -> {
            println("You received the Grade D as your marks is ${m}")
        }

        in 1..59 -> {
            println("You are FAIL. You need to do more study.")
        }

        else -> {
            println("Enter a valid marks.")
        }
    }
}

// WAP a program to take a number from user and count their digit ?
fun countDigit(num: Int) {
    var count = 0;
    var n = num
    while (n > 0) {
        val r = n % 10
        count++
        n = n / 10
    }
    println("Number of digit is $count")
}

// WAP to take a number from user and reverse them ?
fun reverse(num: Int) {
    var n1 = num
    var rev: Int = 0
    while (n1 != 0) {
        val r = n1 % 10
        rev = rev * 10 + r
        n1 = n1 / 10
    }
    println(
        """
        Your number is ${num}
        Reversed number is $rev
    """.trimIndent()
    )
}

/*Write a Kotlin function called calculateFactorial that takes an integer n as input and returns the factorial of n.
 The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
 For example, the factorial of 5 is 5 * 4 * 3 * 2 * 1 = 120.*/
var factorial: Long = 1
fun factRun() {
    println("Enter a non-negative number:")
    val inp = readln().toIntOrNull()
    if (inp != null && inp >= 0) {
        val fact = calculateFactorial(inp)
        println("The factorial of ${inp} is ${factorial} ")
    } else {
        println("Invalid number !! Enter a valid non negative number.")
    }
}

fun calculateFactorial(n: Int): Long {
    for (i in 1..n) {
        factorial *= i
    }
    return factorial
}


fun main() {
//    gradeCalculator();
//    gradeCalculator1();
//    println("Enter a number")
//    val num:Int = readln().toInt()
//    countDigit(num)
//    reverse(num)
    factRun()
}

