package com.example.a20191221_01_sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a20191221_01_sharedpreference.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

//        Q1. 아이디 저장 로직 구현
//        loginBtn 이 눌리면 idCheckBtn 가 체크되어 있는지 검사

        loginBtn.setOnClickListener {
            if(idCheckBox.isChecked){
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext, userId)
                Log.d("log","BtnListener${userId}")
            }
        }

//        var isChecked = idCheckBox.isChecked

        idCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
            ContextUtil.setCheckBoxState(mContext, isChecked)
        }

    }

//    idCheckBox가 체크 되면 체크 된 값을 contextUtil - SharedPreference활용해서 저장.
//    앱이 켜질때 setValues에서 저장된 체크 여부를 반영


    override fun setValues() {
        idEdt.setText(ContextUtil.getUserId(mContext))
        idCheckBox.isChecked = ContextUtil.getCheckBoxState(mContext)
        Log.d("log","${idEdt.text}")
    }


}
