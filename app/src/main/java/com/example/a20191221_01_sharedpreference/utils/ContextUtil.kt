package com.example.a20191221_01_sharedpreference.utils

import android.content.Context

class ContextUtil {




    companion object{

        //    우리가 사용할 Preference의 이름 : 메모장 - 저장/로드할 파일 이름
        val prefName = "MyProjectPreference"
        //    사용자의 ID를 저장(set)/로드(get) 할때 사용하는 항목의 이름을 상수로 저장.
        val USER_ID = "USER_ID"
        //    userId를 저장하는 기능을 구현한 함수
//    context반드시 활용 (값을 가져오기 위해), 두번째파라미터는 필요에 의한..?것을 가져오는것
        fun setUserId(context: Context, inputId:String){
//    메모장에서 txt파일을 연느것과 같은 행위
//    mode_private 이 앱 안에서만 사용한다는내용, SharedPreference를 열어줌
            val pref=context.getSharedPreferences("prefName",Context.MODE_PRIVATE)
//    열어준 preference에 USER_ID 항목에 inputId변수의 값을 저장 / 확정
            pref.edit().putString("USER_ID",inputId).apply()
        }

        fun getUserId(context: Context) : String{
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(USER_ID,"")!!
        }
    }

}