fun main(){
    //Конкатенация (складывание) строк
    val name_1 = "Mr. Broun"
    val greeting = "How do You do?"
    val space = ' '
    val question = "What would you like?"
    println(name_1 + "!" + space + greeting + space + question)

    //Интерполяция строк
    println("$name_1, $greeting $question")

    val multiStr = """
          string 1
        string 2
                string 3
    """.trimIndent()
    println(multiStr)
}