package com.example.a20191221_01_sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191221_01_sharedpreference.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun setupEvents() {

//        Q1. 아이디 저장 로직 구현
//        loginBtn 이 눌리면 idCheckBtn 가 체크되어 있는지 검사

        loginBtn.setOnClickListener {
            if(idCheckBox.isChecked){
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext, userId)
            }
        }

    }

    override fun setValues() {

    }


}
