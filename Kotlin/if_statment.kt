fun main(args: Array<String>) {

//    var age = 20
//    var car = false
//
//    if(age >= 18 && car){
//
//        println("can Drive")
//
//    }else{
//        println("can't Drive")
//    }

    var std_avg = -56

    /*if (std_avg == 100){
        println("Excellent 100%")
    }else if (std_avg >= 90){
        println("Excellent")
    }else if (std_avg >= 80){
        println("Very Good")
    }else if (std_avg >= 65){
        println("Good")
    }else if (std_avg >= 50){
        println("pass")
    }else{
        println("Failed")
    }*/


    var msg = when (std_avg) {
        100 -> {
            "Excellent 100%"
        }
        in 90..99 -> {
            "Excellent"
        }
        in 80..89 -> {
            "Very Good"
        }
        in 65..79 -> {
            "Good"
        }
        in 50..64 -> {
            "pass"
        }
        in 0..49 -> {
             "Failed"
        }
        else -> {
             "$std_avg is incorrect number"
        }
    }

    println(msg)

    print("end")

}