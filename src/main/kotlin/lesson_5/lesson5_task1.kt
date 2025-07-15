package lesson_5

fun main() {
    print("Докажите, что вы не робот: 2 + 2 = ")

    val userInput = readln().toInt()
    val result = when(userInput) {
        4 -> "Добро пожаловать!"
        else -> "Доступ запрещён."
    }

    println(result)
}