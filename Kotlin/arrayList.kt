fun main(args: Array<String>) {

    var arrayList = ArrayList<Int>()

    arrayList.add(25)
    arrayList.add(5)
    arrayList.add(7)
    arrayList.add(-5)
    arrayList.add(25)
    arrayList.add(-5)
    arrayList.add(0, 100)

    //sort array
    arrayList.sort()
    arrayList.reverse()
    arrayList.shuffle()

    arrayList[2] = 77

    println(arrayList[2])

    //index
    //arrayList.removeAt(3)

    //fist element in array
    //arrayList.remove(-5)

    //remove every element tha equal to ?
    //arrayList.removeIf { it == -5 }

    if (arrayList.contains(-55)) {
        println("yes")
    } else {
        println("No")
    }


    //var listSize = arrayList.size
    println(arrayList.size)
    arrayList.clear()
    println(arrayList.size)


    arrayList.indexOf(-5)

    //var ar = arrayOf<String>("sask","sa;diooj")

}