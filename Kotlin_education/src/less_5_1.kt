fun main() {
    // условные операторы
    print("Insert You age:" + " ")
    val userAge = readln()!!.toInt()
    if (userAge >= AGE_OF_MAJORITY_21) {
        println("Show content 18+")
    }
    else if (userAge == 16 || userAge ==17) {
        println("Show restricted content")
    }
    else {
        println("back to the Main page")
    }


}
const val AGE_OF_MAJORITY_21 = 18
const val RETIREMENT_AGE_21 = 65