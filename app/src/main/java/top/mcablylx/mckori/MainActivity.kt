package top.mcablylx.mckori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.mcablylx.kori.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = Test()
    }
}