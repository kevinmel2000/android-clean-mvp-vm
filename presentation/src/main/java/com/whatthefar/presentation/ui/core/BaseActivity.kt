package com.whatthefar.presentation.ui.core

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.whatthefar.presentation.util.LocaleManager

abstract class BaseActivity : AppCompatActivity() {

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let(LocaleManager::setLocale))
    }
}