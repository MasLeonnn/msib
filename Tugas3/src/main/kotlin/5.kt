fun main(){
    var i = 4
    if(i in 1.rangeTo(10)){
        println("Value 4 available in Range")
    }

    var j = 13
    if(j !in 20.downTo(1)){
        println("Value 13 is not available in Range")
    }else println("Value is available in Range")
}