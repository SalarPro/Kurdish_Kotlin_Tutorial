fun main(args: Array<String>) {

    var arr1 = Array<Int>(5){0}

    arr1[0] = 3
    arr1[1] = 4
    arr1[2] = 0
    arr1[3] = -5
    arr1[4] = 100

    for (index in 0..2){
        println(arr1[index])
    }

    arr1[1] = 8456
    arr1[2] = -545
    arr1[3] = 3500

    for (item in arr1){
        println(item)
    }

    var arr2 = Array<String>(5){""}
    arr2[2] = "sd;kfgjliskd"

    var arr3 = Array<Boolean>(5){ false }
    arr3[0] = true



}