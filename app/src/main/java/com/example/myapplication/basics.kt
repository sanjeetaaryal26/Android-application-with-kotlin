package com.example.myapplication

fun main() {
    println("Hello world");
    //Variable
    var n: String = "Sanjeeta"
    var age: Int = 20;
    var term: Boolean = false
    var weight: Double = 50.50
    println("My name is ${n.uppercase()}")
    println("My age is $age")


    var data = arrayOf("Sanjeeta", "Manish", "Shreeya")
    println("1st element is ${data[0]}")
    println("2nd element is ${data[1]}")
    println("3rd element is ${data[2]}")

    println("Enter day of week")
    var dayOfWeek: Int = readln().toInt()
    var day: String

    when (dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Tuesday"
        7 -> "Tuesday"
        else -> day = "Invalid Option"
    }
}


