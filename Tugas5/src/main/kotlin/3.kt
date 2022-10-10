fun main(){
    val color = "yellow"
    val lightOn = turnOnLight(color)
    println(lightOn)
}

fun lightOn(color:String):String{
    return "$color light is on"
}