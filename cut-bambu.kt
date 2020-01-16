fun main(){
    print("How much bamboo do you want: ")
    var countBamboo = readLine()!!.toInt()
    println()

    var bamboos: ArrayList<Int> = ArrayList()
    for (i in 0 until countBamboo step 1) {
        print("Insert length of bamboo $i: ")
        var lenghtBamboo = readLine()!!.toInt()
        bamboos.add(i, lenghtBamboo)
    }
    println("List of bamboo: $bamboos")
    println()

    print("How many times you want to cut the bamboo: ")
    var cutBamboo = readLine()!!.toInt()
    println()

    for (i in 0 until cutBamboo step 1) {
        for (j in 0 until bamboos.size step 1) {
            if (bamboos[j]==0) continue
            bamboos[j] = bamboos[j]-1
        }
        println("Step $i list bamboo: $bamboos")
    }
}
