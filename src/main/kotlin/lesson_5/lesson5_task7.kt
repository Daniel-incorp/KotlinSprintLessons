package lesson_5

const val ONE_HUNDRED_FOR_CALCULATION = 100

fun main() {
    print("Введите расстояние поездки(в км.): ")
    val userDistanceInput = readln().toFloat()

    print("Введите расход топлива на 100км(в л.): ")
    val userFuelUsageInput = readln().toFloat()

    print("Введите текущую цену за литр топлива: ")
    val userFuelPriceInput = readln().toFloat()

    val totalFuelUsage = (userDistanceInput * userFuelUsageInput) / ONE_HUNDRED_FOR_CALCULATION
    val totalFuelPrice = totalFuelUsage * userFuelPriceInput

    println(
        "Количество необходимого топлива: %.2f литров\nИтоговая стоимость поездки %.2f рублей".format(
            totalFuelUsage,
            totalFuelPrice
        )
    )
}