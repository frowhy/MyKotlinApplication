package com.frowhy.mykotlinapplication

import android.view.Gravity
import org.jetbrains.anko.*

/**
 * MyKotlinApplication
 * Created by frowhy on 2017/5/14.
 */
class MainUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

        verticalLayout {
            textView {
                lparams(width = matchParent, height = matchParent)
                text = context.getString(R.string.hello_world)
                gravity = Gravity.CENTER
            }
        }
    }
}