package com.frowhy.mykotlinapplication

import android.app.Activity
import android.os.Bundle
import org.jetbrains.anko.setContentView

/**
 * MyKotlinApplication
 * Created by frowhy on 2017/5/13.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainUI().setContentView(this)
    }
}