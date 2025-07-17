package lesson_5

fun main() {
    print("Введите расстояние поездки(в км.): ")
    val userDistanceInput = readln().toFloat()

    print("Введите расход топлива на 100км(в л.): ")
    val userFuelUsageInput = readln().toFloat()

    print("Введите текущую цену за литр топлива: ")
    val userFuelPriceInput = readln().toFloat()

    val totalFuelUsage = (userDistanceInput * userFuelUsageInput) / 100
    val totalFuelPrice = totalFuelUsage * userFuelPriceInput

    println("Количество необходимого топлива: %.02f литров\nИтоговая стоимость поездки %.02f рублей".format(totalFuelUsage, totalFuelPrice))
}