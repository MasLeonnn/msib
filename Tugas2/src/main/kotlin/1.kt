fun main(){
    val hasil = setUser( name = "Budi", age= 21)

    println(hasil)
}

fun setUser(name: String, age: Int): String{
    return "Nama kamu adalah $name, dan umur kamu $age tahun"
}