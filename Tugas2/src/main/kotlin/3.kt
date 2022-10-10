fun main(){
    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if(timeNow >= timeClose){
       "class already closed"
    }else if(timeNow >= timeOpen){
        "Class is open"
    }else{
        "Class in not open yet"
    }
    println(classStatus)
}