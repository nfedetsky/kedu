fun main(){
    //Условные операторы 2

    print("Insert You age:" + " ")
    val userAge = readln()!!.toInt()

    val textResult = if (userAge >= AGE_OF_MAJORITY_22) "Show content 18+"
    else if (userAge == 16 || userAge == 17) "Show restricted content"
    else "Back to the Main page"

    println(textResult)

}

const val AGE_OF_MAJORITY_22 = 18
const val RETIREMENT_AGE_22 = 65