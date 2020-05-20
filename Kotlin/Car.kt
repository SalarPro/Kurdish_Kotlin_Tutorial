class Car {

    var type : String? = null
    var model : Int? = null
    var color : String? = null
    var price : Double? = null
    var driveKM : Double? = null

    init {
       println("Class Car Created")
    }

    constructor(){

    }

    constructor(type:String,model:Int,color:String,price:Double,driveKM : Double){
        this.type = type
        this.model = model
        this.color = color
        this.price = price
        this.driveKM = driveKM
    }

    constructor(type:String,model:Int){
        this.type = type
        this.model = model
    }
    constructor(model:Int,color:String){
        this.type = type
        this.model = model
    }



    fun printCarInfo(){
        println("type : $type")
        println("model : $model")
        println("color : $color")
        println("price : $price")
        println("driveKM : $driveKM")
    }

    fun setCarData(type:String,model:Int,color:String,price:Double,driveKM : Double){
        this.type = type
        this.model = model
        this.color = color
        this.price = price
        this.driveKM = driveKM
    }
}
