fun main(){
    val rangeInt = 1..10
    println("Step: "+ rangeInt.step)
    print(rangeInt.toList())
    println("\n")

    val range = 1.rangeTo(10)
    println("Step: "+ range.step)
    print(range.toList())
    println("\n")

    val Range = 1..10 step 2
    println("Step: "+ Range.step)
    print(Range.toList())
}