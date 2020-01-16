fun main() {
    for (i in 1..10){
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    val names = arrayOf("Udin", "Aziz", "Surip")
    for (name: String in names) {
        println(name)
    }

    for (i in 0 .. 10 step 2) {
        println(i)
    }

    for (i in 2..10 step 1) {
        if (i==7) continue
        println(i)
    }
}

fun condition(){
    var waktuPengumpulan = 18

    if (waktuPengumpulan >= 8 && waktuPengumpulan <= 17) {
        print("Pengumpulan diterima")
        return
    } else {
        print("Pengumpulan tidak diterima")
    }
}

fun whenCase(){
    var x = 25.0

    when (x){
        0.0 -> print("It's zero")
        1.0 -> print("It's One")
        11.0,22.0 -> {print("eleven OR twenty two")}
        is Double -> {
            print("It's double")
        }
        in 9..20 -> print("between 9 to 20")
        else -> print("Others")
    }

}