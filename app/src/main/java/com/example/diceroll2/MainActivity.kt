package com.example.diceroll2

import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.file.StandardOpenOption
import java.util.ArrayList
import kotlin.random.Random


fun main() {
    val inputStream: InputStream = File("/Users/mobdev/Documents/GitHub/DiceRoll2/app/src/main/res/raw/data").inputStream()
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println(inputString)

   // val outString = "nicolle,salinas,18.087.154-3"
    //File("/Users/mobdev/Documents/GitHub/DiceRoll2/app/src/main/res/raw/data").bufferedWriter().use { out -> out.write(outString)  }

    fun list():ArrayList<String> = arrayListOf("1","2")
    val list = File("/Users/mobdev/Documents/GitHub/DiceRoll2/app/src/main/res/raw/data")
        .readLines()
        .map { it }






    val hourJob: Int = 150
    val valueHour: Int = 5000

    printSeparationLine(24)
    println("Nombre:"); println(informationWorker("Nicolle ", "Salinas"))
    printSeparationLine(24)
    println("Rut:"); println(idNumber("18087154-3"))
    printSeparationLine(24)
    println("Total haberes:"); println(calculationAssets(hourJob, valueHour))
    println("Total salud:"); println(calculationHealth(hourJob, valueHour))
    println("Total AFP:"); println(calculationPensionFundManager(hourJob, valueHour))
    println("Total bono :");println(calculationBonus(hourJob))
    printSeparationLine(24)
    println("Sueldo liquido a pagar:"); println(
        calculationAssets(hourJob, valueHour) -
                calculationHealth(hourJob, valueHour) - calculationPensionFundManager(hourJob,
            valueHour) +
                calculationBonus(hourJob)
    )
}

fun informationWorker(name: String, lastName: String): String {
    return name + lastName
}

fun idNumber(id: String): String {
    return id

}

fun calculationAssets(hourJob: Int, valueHour: Int): Double {
    val totalDaysJob = hourJob * valueHour
    val gratification = 0.25
    val totalAssets = totalDaysJob * gratification
    return totalAssets + totalDaysJob

}
fun calculationPensionFundManager(hourJob: Int, valueHour: Int): Double {
    val totalAssets = calculationAssets(hourJob,valueHour)
    val pensionFundManager = 0.1125
    val totalPensionFundManager = totalAssets * pensionFundManager
    return (totalPensionFundManager)
}

fun calculationHealth(hourJob: Int, valueHour: Int): Double {
    val totalAssets = calculationAssets(hourJob,valueHour)
    val health = 0.07
    val totalHealth = totalAssets * health
    return (totalHealth)
}

fun calculationBonus(hourJob: Int): Int {
    val valueBonus = 400
    return hourJob * valueBonus
}

fun printSeparationLine(script: Int) {
    repeat(script) {
        print("=")
    }
    println()
}







