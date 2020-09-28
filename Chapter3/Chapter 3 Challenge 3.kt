//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    val isBlessed = true
//    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
//    val healthStatus: String = if (healthPoints == 100) {"is in excellent condition!"}
//    else if (healthPoints >= 90) {"has a few scratches."}
//    else if (healthPoints >= 75){
//        if (isBlessed) {"has some minor wounds but is healing quite quickly!"}
//        else {"has some minor wounds."}}
//    else if (healthPoints >= 15) {"looks pretty hurt."}
//    else {"is in awful condition!"}
//
//    val auraColor: String = if (karma in 0..5) {"Red"}
//    else if (karma in 6..10) {"Orange"}
//    else if (karma in 11..15) {"Purple"}
//    else if (karma in 16..20) {"Green"}
//    else {"Invisible"}
//
//
//    println("(Aura: $auraColor) " +
//            "(Blessed: ${if (isBlessed) "YES" else "NO" })")
//    println("$name $healthStatus")
//}

//--------------------------------------------------------------------
// Difficult Challenge
fun main() {
    val name = "Madrigal"
    var healthPoints = 100
    val isBlessed = true
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    val healthStatus: String = if (healthPoints == 100) {"is in excellent condition!"}
    else if (healthPoints >= 90) {"has a few scratches."}
    else if (healthPoints >= 75){
        if (isBlessed) {"has some minor wounds but is healing quite quickly!"}
        else {"has some minor wounds."}}
    else if (healthPoints >= 15) {"looks pretty hurt."}
    else {"is in awful condition!"}

    val auraColor: String = if (karma in 0..5) {"Red"}
    else if (karma in 6..10) {"Orange"}
    else if (karma in 11..15) {"Purple"}
    else if (karma in 16..20) {"Green"}
    else {"Invisible"}

var statusFormatString = "(HP: $healthPoints)(Aura: $auraColor) -> $name is in $healthStatus"
    println(statusFormatString)
}
