package lesson_5

const val MAX_LUCKY_NUMBER = 42

fun main() {
    val firstLuckyNumber = (0..MAX_LUCKY_NUMBER).random()
    val secondLuckyNumber = (0..MAX_LUCKY_NUMBER).random()

    print("Введите первое число от 0 до 42: ")
    val firstUserInput = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val secondUserInput = readln().toInt()

    if (firstUserInput in 0..MAX_LUCKY_NUMBER && secondUserInput in 0..MAX_LUCKY_NUMBER) {
        if (
            (firstUserInput == firstLuckyNumber ||
                    firstUserInput == secondLuckyNumber) &&
            (secondUserInput == firstLuckyNumber ||
                    secondUserInput == secondLuckyNumber)
        ) println("Поздравляем! Вы выиграли главный приз!")
        else if (
            (firstUserInput == firstLuckyNumber ||
                    firstUserInput == secondLuckyNumber) ||
            (secondUserInput == firstLuckyNumber ||
                    secondUserInput == secondLuckyNumber)
        ) println("Вы выиграли утешительный приз!")
        else println("Неудача!")
    } else println("Пожалуйста введи числа в диапазоне от 0 до 42")
    println("Загаданные числа $firstLuckyNumber и $secondLuckyNumber",)
}