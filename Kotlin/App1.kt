fun main(args: Array<String>) {

    //inputs

    print("Enter Y value: ")
    var y = readLine()!!.toDouble()
    print("Enter Z value: ")
    var z = readLine()!!.toDouble()
    print("Enter S value: ")
    var s = readLine()!!.toDouble()

    //process

    var z2 = Math.pow(z,2.0)
    var s3 = Math.pow(s,3.0)

    var x = (y/1)+(z2/2)+(s3/3)

    //output

    println("Value of X is = : $x")

}
