fun main(){
    // логические операторы - && - "и", || - "или", !
    // операторы сравнения
    val userAge = 70
    var comparisonResult: Boolean = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE //be true If !in then be true out of diapason
    println("Результат проверки возраста: $comparisonResult")
}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65