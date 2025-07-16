package lesson_5

const val FIRST_LUCKY_NUMBER = 27
const val SECOND_LUCKY_NUMBER = 35

fun main() {
    print("Введите первое число от 0 до 42: ")
    val firstUserInput = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val secondUserInput = readln().toInt()

    if (firstUserInput in 0..42 && secondUserInput in 0..42) {
        if(firstUserInput == FIRST_LUCKY_NUMBER && secondUserInput == SECOND_LUCKY_NUMBER) println("Поздравляем! Вы выиграли главный приз!")
        else if (firstUserInput == FIRST_LUCKY_NUMBER || secondUserInput == SECOND_LUCKY_NUMBER) println("Вы выиграли утешительный приз!")
        else println("Неудача!")
    } else println("Пожалуйста введи числа в диапазоне от 0 до 42")
}