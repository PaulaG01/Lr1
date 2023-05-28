package bsuir.ganebnaya_polina.lr1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import bsuir.ganebnaya_polina.lr1.text.TextFunction

class MainActivity : AppCompatActivity() {
    //    TODO: Lr1 todo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        extracted()
    }

    private fun extracted() {
        val tf: TextFunction = TextFunction()
        val nt: TextView = findViewById(R.id.newtest)
        nt.text = tf.value
    }
}