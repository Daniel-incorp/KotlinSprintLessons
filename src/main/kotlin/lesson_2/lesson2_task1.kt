package lesson_2

fun main() {
    val firstStudentMark = 3.00f
    val secondStudentMark = 4.00f
    val thirdStudentMark = 3.00f
    val fourthStudentMark = 5.00f
    val numberOfStudents = 4
    val averageRating = (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark) / numberOfStudents


    println(String.format("\nСредний балл студентов: %.2f", averageRating))
}