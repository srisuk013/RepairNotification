package com.srisuk.repairnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(baseContext, "${chickenNot()}", Toast.LENGTH_SHORT).show()
    }

    private fun chickenNot(): String {
        return "Hello chicken not"
    }
}