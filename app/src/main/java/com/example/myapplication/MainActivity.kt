package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.fragment1, ProductsListFragment())

                if (fragment2 != null) {
                    replace(R.id.fragment2, ProductDetailsFragment())
                }

                commitAllowingStateLoss()
            }

    }


    fun TextView.setBoldText(text: String, separator: String = ":") {
        val spannable = SpannableStringBuilder(text)
        spannable.setSpan(StyleSpan(Typeface.BOLD), 0, text.indexOf(":") + 1, 0)
        this.text = spannable
    }
}


