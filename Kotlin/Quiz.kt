fun main(args: Array<String>) {

    print("Enter Your Name: ")
    val name = readLine()!!
    print("Enter Your Birthday ex: [1997, 2001, 1975 ..] : ")
    val birtday = readLine()!!.toInt()

    val yourAge = 2020 - birtday

    val msg = if (yourAge >= 18){
        print("Do you have a Car? [y] for Yes, [n] for No: ")

        when(readLine()!!){
            "y" -> {
                "You can Drive a Car"
            }
            "n" -> {
                "You can't Drive a Car"
            }
            else -> {
                "Wrong Word!!"
            }
        }

    }else{
        val till18 = 18 - yourAge
        "Sorry $name you can't drive a Car. After $till18 years you can drive."
    }

    println(msg)


}