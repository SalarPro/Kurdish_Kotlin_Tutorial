fun main(args: Array<String>) {

    val str1 = "Hello world"
    val str2 = "Kotlin"

    println(str1.length)
    println(str1[0])

    for (item in str2){
        println(item)
    }

    println(str1.toUpperCase())
    println(str1.toLowerCase())

    println(str1.subSequence(2,7))

    println(str1.subSequence(2..7))



    println("${str1.toUpperCase()} $str2  ${5+5}")




}