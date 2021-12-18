package com.hanmoo.construcctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called")

        var myFriend = MyFriends()

        Log.d(TAG, "MainActivity - myFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend.isMarried : ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - myFriend.nickname : ${myFriend.nickname}")

        var minsu = MyFriends(name= "Minsu")
        Log.d(TAG, "MainActivity - minsu.name : ${minsu.name}")
        
        var myFriendEins= WithParams(name = "Millli", age = 30, isMarried = true, nickname = "Mola")
        Log.d(TAG, "MainActivity - myFriendeins.name : ${myFriendEins.name}")
        Log.d(TAG, "MainActivity - myFriendeins.age : ${myFriendEins.age}")
        Log.d(TAG, "MainActivity - myFriendeins.isMarried : ${myFriendEins.isMarried}")
        Log.d(TAG, "MainActivity - myFriendeins.nickname : ${myFriendEins.nickname}")


        var myFriendzwei = WithParams(name = "minji", age = 30, isMarried = false, nickname = "Leo",
                                                address = "Deutschland")
        Log.d(TAG, "MainActivity - myFriendzwei.name : ${myFriendzwei.name}")
        Log.d(TAG, "MainActivity - myFriendzwei.age : ${myFriendzwei.age}")
        Log.d(TAG, "MainActivity - myFriendzwei.isMarried : ${myFriendzwei.isMarried}")
        Log.d(TAG, "MainActivity - myFriendzwei.nickname : ${myFriendzwei.nickname}")
        Log.d(TAG, "MainActivity - myFriendzwei.address : ${myFriendzwei.address}")


    }
}