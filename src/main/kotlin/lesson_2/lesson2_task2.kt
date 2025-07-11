package lesson_2

fun main() {
    val employees = 50
    val interns = 20
    val salaryForEmployees = 50000.00f
    val salaryForInterns = 20000.00f

    println(
        "\nВыплата постоянным сотрудникам: ${employees * salaryForEmployees} рублей" +
        "\nОбщие расходы ЗП: ${employees * salaryForEmployees + interns * salaryForInterns} рублей" +
        "\nСредняя ЗП сотрудника: ${(employees * salaryForEmployees + interns * salaryForInterns)  /(employees + interns)} рублей"
    )
}