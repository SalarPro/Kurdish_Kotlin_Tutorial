fun main(args: Array<String>) {

    var hashMap = HashMap<String,String>()

    hashMap["name"] = "Salar Khalid"
    hashMap["age"] = "23"
    hashMap["address"] = "Duhok"
    hashMap["email"] = "salar@salar.com"

//    for ( (k,v) in hashMap ){
//        println("$k : $v")
//    }

    //println(hashMap["email"])

    var hashMap2 = HashMap<Double,String>()

    hashMap2[1.1] = "Salar Khalid"
    hashMap2[1.2] = "23"
    hashMap2[36.25] = "Duhok"
    hashMap2[0.0] = "salar@salar.com"

//    for ( (k,v) in hashMap2 ){
//        println("$k : $v")
//    }

//    for (keys in hashMap2.keys){
//        println(keys)
//    }
//    for (valu in hashMap2.values){
//        println(valu)
//    }

    var hashMap3 = HashMap<String,Any>()

    hashMap3["name"] = "Salar Khalid"
    hashMap3["age"] = 23
    hashMap3["address"] = "Duhok"
    hashMap3["email"] = "salar@salar.com"
    hashMap3["haveACar"] = false

    hashMap3["name"] = "Osama Ismail"

    println(hashMap3["name"])

    hashMap3.remove("name")

    var hasMap4 = hashMapOf<String,Any>("name" to "Salae","age" to 25)

    

}
