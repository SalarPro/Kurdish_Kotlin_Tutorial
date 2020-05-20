open class Calc1{

    var pi = 3.14

    fun sum(num1:Int,num2 : Int){
        println(num1 + num2)
    }
    fun min(num1:Int,num2 : Int){
        println(num1 - num2)
    }
}

class Calc2 : Calc1(){

    var name = "Salar"
    fun mul(num1:Int,num2 : Int){
        println(num1 * num2)
    }
    fun div(num1:Int,num2 : Int){
        println(num1 / num2)
    }

}
