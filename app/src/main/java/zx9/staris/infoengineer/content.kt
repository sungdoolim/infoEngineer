package zx9.staris.infoengineer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_content.*
import zx9.staris.infoengineer.content

class content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        val contentText:String=intent.getStringExtra("url")?:"0"
        contentTEXT.text=contentText
    }
}