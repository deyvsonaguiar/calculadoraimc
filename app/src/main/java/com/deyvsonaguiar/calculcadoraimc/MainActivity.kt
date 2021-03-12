package com.deyvsonaguiar.calculcadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifeCycle", "CREATE - estou criando a tela!")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifeCycle", "START - deixei a tela visível para você!")
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifeCycle", "RESUME - agora você pode interagir com a tela!")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifeCycle", "PAUSE - a tela perdeu o foco, você não pode mais interagir!")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifeCycle", "STOP - a tela não está mais visível mas ainda existe!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifeCycle", "RESTART - a tela está retomando o foco!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifeCycle", "DESTROY - a tela foi destruída!")
    }
}