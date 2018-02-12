package com.moohow.testgradlebuildtool

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.moohow.idlikeanimation.Model.IDUser

class MainActivity : AppCompatActivity() {
    var user: IDUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
