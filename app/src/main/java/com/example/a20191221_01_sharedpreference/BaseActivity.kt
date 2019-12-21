package com.example.a20191221_01_sharedpreference

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity:AppCompatActivity() {
    var mContext = this

    abstract fun setupEvents()
    abstract fun setValues()
}