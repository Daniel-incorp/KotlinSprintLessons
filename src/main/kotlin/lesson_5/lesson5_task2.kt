package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год вашего рождения: ")

    val userYearOfBorn = readln().toInt()
    val yearOnToday = java.util.Date().toString().substringAfterLast(" ").toInt()
    val userAge = yearOnToday - userYearOfBorn

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вы не достигли возраста совершеннолетия!")
}
