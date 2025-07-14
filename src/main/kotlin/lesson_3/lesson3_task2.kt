package lesson_3

fun main() {
    val userFirstName = "Татьяна"
    val userMiddleName = "Сергеевна"
    var userLastName = "Андреева"
    var userAge = 20

    println("$userFirstName $userMiddleName $userLastName, $userAge")

    userLastName = "Сидорова"
    userAge = 22

    println("$userFirstName $userMiddleName $userLastName, $userAge")
}