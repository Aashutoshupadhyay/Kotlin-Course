package com.example.course.oops

class Encapsulation() {
    val num1 = 23
    val num2 = 89
    fun add(){
        println("Sum of these number is ${num1 + num2}")
    }
    fun sub(){
        println("Sub of these number is ${num1 - num2}")
    }
    fun multiply(){
        println("Multiply of these number is ${num1 * num2}")
    }
}

fun main() {
    val assign = Encapsulation()
    val person = Encapsulation()
    println(assign.num1)
    assign.multiply()
    assign.sub()
    person.add()
    println(person.num2)
}
