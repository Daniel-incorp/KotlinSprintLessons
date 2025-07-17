package lesson_5

const val USER_NAME_REGISTERED = "Zaphod"
const val USER_PASSWORD_REGISTERED = "PanGalactic"

fun main() {
    print("Введите ваше имя пользователя: ")
    val userName = readln()

    if (userName == USER_NAME_REGISTERED) {
        print("Введите ваш пароль: ")
        val userPassword = readln()

        if (userPassword == USER_PASSWORD_REGISTERED) println("Добро пожаловать на корабль!")
        else println("Пароль неверный!")
    } else println("Вы не зарегистрированы. Зарегистрироваться?")
}