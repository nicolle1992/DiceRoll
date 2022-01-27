package com.example.diceroll2



fun main() {
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






// recordar a carlos hacer curso de Lambda



// separar las cosas en otras funciones
// hacer test
// generar clases e interface