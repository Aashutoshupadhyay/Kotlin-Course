package com.example.course.oops
// Classes is a blueprint of any object. It is the basic syntax of the object it can used anywhere.
class DailyWork(){
    fun wakeup(){
        println("Wake up at 4:00 Am")
    }
    fun fresh(){
        println("Within 10-15 min i done with by freshening activity")
    }
    fun breakFast(){
        println("I have done my breakfast at 9:00 Am")
    }
    fun sleep(){
        println("I will go to bed at 11:00 Pm")
    }
}

// Object ::
val Ashu = DailyWork()
fun main() {
    Ashu.wakeup()
    Ashu.fresh()
    Ashu.breakFast()
    Ashu.sleep()
}