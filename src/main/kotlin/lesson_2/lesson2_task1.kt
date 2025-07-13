package lesson_2

fun main() {
    val firstStudentMark = 3f
    val secondStudentMark = 4f
    val thirdStudentMark = 3f
    val fourthStudentMark = 5f
    val numberOfStudents = 4
    val averageRating = (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark) / numberOfStudents

    println("Средний балл студентов: %.2f".format(averageRating))
}