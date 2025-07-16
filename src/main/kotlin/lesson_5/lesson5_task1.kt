package lesson_5

fun main() {
    val captchaRandomNumber1 = (0..10).random()
    val captchaRandomNumber2 = (0..10).random()

    print("Докажите, что вы не робот: $captchaRandomNumber1 + $captchaRandomNumber2 = ")

    val userInput = readln().toInt()
    val captchaResult = if (userInput == captchaRandomNumber1 + captchaRandomNumber2) "Добро пожаловать!" else "Доступ запрещён."

    println(captchaResult)
}