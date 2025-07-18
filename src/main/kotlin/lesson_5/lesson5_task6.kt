package lesson_5

const val NOT_NORMAL_BODY_WEIGHT = 18.5f
const val NORMAL_BODY_WEIGHT = 25
const val OVER_NORMAL_BODY_WEIGHT = 30

fun main() {
    print("Введите ваш вес(в кг): ")
    val userWeightInput = readln().toFloat()

    print("Введите ваш рост(в см): ")
    val userGrowthInput = readln().toFloat() / 100

    val bodyMassIndex = userWeightInput / (userGrowthInput * userGrowthInput)

    when {
        bodyMassIndex < NOT_NORMAL_BODY_WEIGHT ->
            println("Недостаточная масса тела: %.02f".format(bodyMassIndex))

        bodyMassIndex < NORMAL_BODY_WEIGHT ->
            println("Нормальная масса тела: %.02f".format(bodyMassIndex))

        bodyMassIndex < OVER_NORMAL_BODY_WEIGHT ->
            println("Избыточная масса тела: %.02f".format(bodyMassIndex))

        else -> println("Ожирение: %.02f".format(bodyMassIndex))
    }
}



