//Solution 1
//fun main(){
//    var healthPoints = 89
//    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
//
//    if (karma in 0..5){
//      println("red")
//    }else if (karma in 6..10){
//        println("orange")
//    }else if (karma in 11..15){
//        println("purple")
//    }else if (karma in 16..20){
//        println("green")
//    }else{
//        println("invisible")
//    }
//}

//-----------------------------------------------------------------------------------

//Solution 2
fun main() {
    var healthPoints = 89
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()

    val auraColor: String = if (karma in 0..5) {"red"}
    else if (karma in 6..10) {"orange"}
    else if (karma in 11..15) {"purple"}
    else if (karma in 16..20) {"green"}
    else {"invisible"}

    println(auraColor)
}