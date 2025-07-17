package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год вашего рождения: ")

    val userYearOfBorn = readln().toInt()
    val yearOnToday = LocalDate.now().year
    val userAge = yearOnToday - userYearOfBorn

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вы не достигли возраста совершеннолетия!")
}
