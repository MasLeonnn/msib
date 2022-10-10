fun main(){
    var i = 0

    while(i < 10){
        println("Loop to : $i")
        i++
    }

    while(true){
        println("Break $i")
        i++
        if(i > 10){
            break
        }
    }

    while(true){
        println("Break $i")
        i++
        if(i > 10){
            break
        }
    }
println("\n \n \n")
    val c = 2
    for(b in 1..10){
        println("Sayang...")
        if(b==c){
            println("Putus!!")
            break
        }
    }
}