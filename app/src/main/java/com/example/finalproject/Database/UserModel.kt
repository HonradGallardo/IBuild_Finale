package com.example.finalproject.Database


data class UserModel(
    var id : Int = getAutoId(),
    var name : String = "",
    var email : String = ""
){
    companion object{
        fun getAutoId():Int{
            val random = java.util.Random()
            return random.nextInt()
        }
    }


}
