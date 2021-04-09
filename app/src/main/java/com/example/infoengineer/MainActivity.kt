package com.example.infoengineer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var toast: Toast? =null
    override fun onStart() {
        super.onStart()
        var pref=getSharedPreferences("session",0)
        var sessionNum=pref?.getInt("num",0)
        toast?.cancel()
        toast?.setText(sessionNum.toString()+"까지 학습했습니다")
        toast?.show()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pref=getSharedPreferences("session",0)
        var sessionNum=pref?.getInt("num",0)
        toast= Toast.makeText(this,sessionNum.toString()+"까지 학습했습니다",Toast.LENGTH_LONG)
        toast?.show()

        web_rv.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        web_rv.setHasFixedSize(true)
        web_rv.addItemDecoration(
            DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL)
        )// 경계선을 추가합니다
        web_rv.adapter=
            title_adapter(
                this
            )
    }
}