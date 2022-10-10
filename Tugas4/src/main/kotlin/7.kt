fun main(){
    val numberList = listOf(1,2,3,4,5)
    val eventList = numberList.filter { it % 2 ==0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }

    println(numberList)
    println(eventList)
    println(notEventList)

    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)
}