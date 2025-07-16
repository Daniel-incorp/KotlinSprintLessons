package lesson_5

const val USER_NAME_REGISTERED = "Zaphod"
const val USER_PASSWORD_REGISTERED = "PanGalactic"

fun main() {
    print("Введите ваше имя пользователя: ")
    var userName = readln()

    print("Введите ваш пароль: ")
    var userPassword = readln()

    if (userName == USER_NAME_REGISTERED && userPassword == USER_PASSWORD_REGISTERED) print("Добро пожаловать на корабль")
    else {
        print("Вы не зарегистрированы. Зарегистрироваться? ")
        val userAnswer = readln().toBoolean()

        if (userAnswer) {
            print("Введите ваше имя пользователя: ")
            userName = readln()

            print("Введите ваш пароль: ")
            userPassword = readln()

            print("Добро пожаловать на корабль")
        } else return
    }
}