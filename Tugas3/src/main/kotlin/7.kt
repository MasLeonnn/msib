fun main(){
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    for((index,value) in days.withIndex()){
        println("value $value with index $index")
    }
    println("\n")

    days.forEach {
        value -> println("Day in $value")
    }
    println("\n")
    days.forEachIndexed { index, value ->
        println("Day $value with index: $index")
    }
}