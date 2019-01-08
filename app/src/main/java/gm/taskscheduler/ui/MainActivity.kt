package gm.taskscheduler.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import gm.taskscheduler.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val intent = Intent(this, LoginFormActivity::class.java)
        intent.putExtra("msg123", "1233")
        button.setOnClickListener{startActivity(intent)}

    }

    //fun showChlen(view: View) = Toast.makeText(applicationContext, "123", Toast.LENGTH_SHORT).show()
}
