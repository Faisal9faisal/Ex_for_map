fun main(args: Array<String>) {
    val nameOclasses = mutableMapOf<String, String>("class1" to "Math", "class2" to "History", "class3" to "english", "class4" to "islamic")
    println(nameOclasses)
    nameOclasses.put("class5","Kotlin") // add class of Islamic here

    println(nameOclasses)
    println(nameOclasses.containsKey("class2"))
    println(nameOclasses.containsValue("class2"))
    println(nameOclasses)   // eating on value here
    nameOclasses.remove("class4")
    println(nameOclasses) // here i remove class4


}



/////////////////////////////////////// part 2 //////////////////////////////////////////////////////////
fun main() {
    var nameOfstudent = mutableMapOf("name1" to "Faisal", "name2" to "Ali", "name3" to "Mohammed")
    println(nameOfstudent)
    val nameOfcity = listOf<String>("Riyadh","Jeddah","Dammam")
    println(nameOfcity)
    nameOfstudent.putAll(listOf("Riyadh","Jeddah","Dammam").mapIndexed { index,item -> index.toString() to item })

    println(nameOfstudent)
}
