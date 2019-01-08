package gm.taskscheduler.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import gm.taskscheduler.R

class LoginFormActivity : AppCompatActivity() {

    private val LOGIN = "gjmrd"
    private val PASSWORD = "admin"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_form)
    }

    fun showDick(view: View) {
        val loginField = findViewById<EditText>(R.id.editText2)
        val passwordField = findViewById<EditText>(R.id.editText)

        if (loginField.value == LOGIN && passwordField.value == PASSWORD)
            showToast("welcome to the club, buddy")
        else
            showToast("get your ass back, fucking slave")
    }

    var EditText.value: String
        get() = this.text.toString()
        set(value) = this.setText(value)

    private fun showToast(text: String) = makeText(applicationContext, text, Toast.LENGTH_LONG).show()
}