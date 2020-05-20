fun main(args: Array<String>) {

    var box = 5

    var counter = 0

    while (box > counter){
        //counter = counter + 1
        //counter += 1
        counter++
        println("While")
    }

    do {
        counter++
        println("Do While")
    }while (box > counter)

}