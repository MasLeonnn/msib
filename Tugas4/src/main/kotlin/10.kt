fun main(){
    val numberList = listOf(1,3,2,6,5,4)
    val total = numberList.sum()
    println(total)

    val hackerChar = listOf('h','a','c','k','e','r')

    val ascendingShort1 = numberList.sorted()
    val ascendingShort2 = hackerChar.sorted()
    val ascendingShort3 = numberList.sortedDescending()
    val ascendingShort4 = hackerChar.sortedDescending()

    println(ascendingShort1)
    println(ascendingShort2)
    println(ascendingShort3)
    println(ascendingShort4)


}