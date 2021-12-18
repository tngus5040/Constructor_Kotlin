package com.hanmoo.construcctor

import android.util.Log

class WithParams(var name: String?, var age: Int?, var isMarried: Boolean?, var nickname: String? ) {


    val TAG: String = "로그"
    var address:String = ""

    //weiteres Parameter hinzufügen
    constructor(name: String?, age: Int?, isMarried: Boolean?, nickname: String?,
                address: String): this(name, age, isMarried, nickname){
        this.address = address
    }


}