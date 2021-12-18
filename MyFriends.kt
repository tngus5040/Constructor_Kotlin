package com.hanmoo.construcctor

import android.util.Log

class MyFriends() {

    val TAG: String = "로그"


    var name : String? = null
    var age : Int? = null
    var isMarried : Boolean = false
    var nickname : String? = null

    //Default
    init{
        Log.d(TAG, "MyFriends - init() called")
        name = ""
        age = 22
        isMarried = false
        nickname = "Absturz"
    }

    constructor(name:String) : this(){
        this.name = name
    }

}
