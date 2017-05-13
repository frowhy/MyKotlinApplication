package com.frowhy.mykotlinapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

/**
 * MyKotlinApplication
 * Created by frowhy on 2017/5/13.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI().setContentView(this)
    }
}