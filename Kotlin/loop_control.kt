fun main(args: Array<String>) {

     salar@ for(item in 1..5){

        for (item2 in 1..3){
            println("$item : $item2")

            if (item2 == 2){
                continue@salar
            }
        }

    }

}