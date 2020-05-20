
fun main(args: Array<String>) {

    var car1 : Car = Car("BMW",2020,"Black",50000.0,10000.0)
    var car2 : Car = Car()
    var car3 : Car = Car("BMW",2020)

    var car4 = Car("KIA",2020)

    car1.printCarInfo()

    car2.printCarInfo()

    car2.setCarData("BMW",2020,"Black",50000.0,10000.0)

    car2.printCarInfo()

    //car1.printCarInfo()

    println(car1.model)

//    var car2 : Car = Car()
//    car2.setCarData("Kia",2015,"White",20000.0,0.0)
//    car2.printCarInfo()


}