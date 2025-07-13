package lesson_2

fun main() {
    val employees = 50
    val interns = 30
    val salaryForEmployee = 50000
    val salaryForIntern = 20000
    val salaryForAllEmployees  = employees * salaryForEmployee
    val salaryForAll = employees * salaryForEmployee + interns * salaryForIntern
    val averageSalary = (employees * salaryForEmployee + interns * salaryForIntern)  / (employees + interns)

    println(
        "Выплата постоянным сотрудникам: $salaryForAllEmployees рублей\n" +
        "Общие расходы ЗП: $salaryForAll рублей\n" +
        "Средняя ЗП сотрудника: $averageSalary рублей"
    )
}