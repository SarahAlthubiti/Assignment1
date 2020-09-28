//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 100
//    if (healthPoints == 100) {
//        println(name + " is in excellent condition!")
//    } else {
//        println(name + " is in awful condition!")
//    }
//}

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89 //we change this value
//    if (healthPoints == 100) {
//        println(name + " is in excellent condition!")
//    } else {
//        println(name + " is in awful condition!")
//    }
//}

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    if (healthPoints == 100) {
//        println(name + " is in excellent condition!")
//    } else if (healthPoints >= 90) {
//        println(name + " has a few scratches.")
//    } else if (healthPoints >= 75) {
//        println(name + " has some minor wounds.")
//    } else if (healthPoints >= 15) {
//        println(name + " looks pretty hurt.")
//    } else {
//        println(name + " is in awful condition!")
//    }
//}

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    val isBlessed = true
//    if (healthPoints == 100) {
//        println(name + "is in excellent condition!")
//    } else if (healthPoints >= 90) {
//        println(name + " has a few scratches.")
//    } else if (healthPoints >= 75) {
//        if (isBlessed) {
//            println(name + " has some minor wounds but is healing quite quickly!")
//        } else {
//            println(name + " has some minor wounds.")
//        }
//    } else if (healthPoints >= 15) {
//        println(name + " looks pretty hurt.")
//    } else {
//        println(name + " is in awful condition!")
//    }
//}

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    val isBlessed = true
//    val isImmortal = false
//    // Aura
//    if (isBlessed && healthPoints > 50 || isImmortal) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
//
//        if (healthPoints == 100) {
//        println(name + "is in excellent condition!")
//    } else if (healthPoints >= 90) {
//        println(name + " has a few scratches.")
//    } else if (healthPoints >= 75) {
//        if (isBlessed) {
//            println(name + " has some minor wounds but is healing quite quickly!")
//        } else {
//            println(name + " has some minor wounds.")
//        }
//    } else if (healthPoints >= 15) {
//        println(name + " looks pretty hurt.")
//    } else {
//        println(name + " is in awful condition!")
//    }
//    }

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    val isBlessed = true
//    val isImmortal = false
//    // Aura
//    if (isBlessed && healthPoints > 50 || isImmortal) {
//        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//        if (auraVisible) {
//            println("GREEN")
//        } else {
//            println("NONE")
//        }
//        if (healthPoints == 100) {
//            println(name + "is in excellent condition!")
//        } else if (healthPoints >= 90) {
//            println(name + " has a few scratches.")
//        } else if (healthPoints >= 75) {
//            if (isBlessed) {
//                println(name + " has some minor wounds but is healing quite quickly!")
//            } else {
//                println(name + " has some minor wounds.")
//            }
//        } else if (healthPoints >= 15) {
//            println(name + " looks pretty hurt.")
//        } else {
//            println(name + " is in awful condition!")
//        }
//    }
//}

//----------------------------------------------------------

//fun main() {
//    val name = "Madrigal"
//    var healthPoints = 89
//    val isBlessed = true
//    // Aura
//        val healthStatus: String = if (healthPoints == 100) {
//            "is in excellent condition!"
//        } else if (healthPoints >= 90) {
//            "has a few scratches."
//        } else if (healthPoints >= 75) {
//            if (isBlessed) {
//                "has some minor wounds but is healing quite quickly!"
//            } else {
//                "has some minor wounds."
//            }
//        } else if (healthPoints >= 15) {
//            "looks pretty hurt."
//        } else {
//            "is in awful condition!"
//        }
//
//        // Player status
//        println(name + " " + healthStatus)
//
//    }

//----------------------------------------------------------

//fun main() {
//    var healthPoints = 89
//    val isBlessed = true
//    val healthStatus: String = if (healthPoints == 100) "is in excellent condition!"
//    else if (healthPoints >= 90) "has a few scratches."
//    else if (healthPoints >= 75)
//        if (isBlessed) "has some minor wounds but is healing quite quickly!"
//        else "has some minor wounds."
//    else if (healthPoints >= 15) "looks pretty hurt."
//    else "is in awful condition!"
//
//    println(healthStatus)
//}

//----------------------------------------------------------

