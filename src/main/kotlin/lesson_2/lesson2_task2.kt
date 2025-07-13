package lesson_2

fun main() {
    val employees = 50
    val interns = 30
    val salaryForEmployee = 30000
    val salaryForIntern = 20000
    val salaryForAllEmployees  = employees * salaryForEmployee
    val salaryForAllInterns = interns * salaryForIntern
    val salaryForAll = salaryForAllEmployees + salaryForAllInterns
    val averageSalary = salaryForAll  / (employees + interns)

    println(
        "Выплата постоянным сотрудникам: $salaryForAllEmployees рублей\n" +
        "Общие расходы ЗП: $salaryForAll рублей\n" +
        "Средняя ЗП сотрудника: $averageSalary рублей"
    )
}