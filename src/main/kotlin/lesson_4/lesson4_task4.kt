package lesson_4

fun main() {
// Интересно, есть ли смысл здесь вынести pumpFor_ переменные в константы или нет?
    val pumpForHand = false
    val pumpForFeet = false
    val pumpForBack = false
    val pumpForPress = false
    val dayCounter = 5

    println(
        "Упражнения для рук: ${!pumpForHand && dayCounter % 2 == 1}\n" +
        "Упражнения для ног: ${!pumpForFeet && dayCounter % 2 == 0}\n" +
        "Упражнения для спины: ${!pumpForBack && dayCounter % 2 == 0}\n" +
        "Упражнения для пресса: ${!pumpForPress && dayCounter % 2 == 1}"
    )
}