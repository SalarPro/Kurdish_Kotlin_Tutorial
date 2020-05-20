

fun main(args: Array<String>) {

//    showNumber(37)
//    showNumber(54)
//    showNumber(4)
//    showNumber(323)

//    var mySum = addTwoNumber(5,10)
//    var mySum2 = addTwoNumber(51,10)
//    println(mySum)
//    println(mySum2)

  //println(piValue())

    showInfo("Salar",23,true)
    showInfo("Ali",45,false)

}

fun showNumber(num1 : Int){
    println("The number is $num1")
}

fun addTwoNumber(num1 : Int, num2 : Int) : Int {
    var sum = num1 + num2
    return sum
}

fun hello(){
    println("Hello World :)")
}

fun piValue() : Double {
    return 3.14
}

fun showInfo(name:String, age : Int, haveACar : Boolean){
    if (haveACar){
        println("My name is $name and im $age old, and i have a Car")
    }else{
        println("My name is $name and im $age old, and i don't have a Car")
    }
}