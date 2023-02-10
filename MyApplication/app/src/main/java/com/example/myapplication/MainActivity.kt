package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert que muda background.")
            builder.setMessage("Você deseja modificar o background para cor magenta?")
            builder.setPositiveButton("Sim"){dialog, which ->
                Toast.makeText(this,"Background está da cor magenta.",Toast.LENGTH_SHORT).show()
                layMain.setBackgroundColor(Color.MAGENTA)
            }
            builder.setNegativeButton("Não"){dialog,which ->
                Toast.makeText(this,"Background está da cor branca.",Toast.LENGTH_SHORT).show()
                layMain.setBackgroundColor(Color.WHITE)
            }
            builder.setNeutralButton("Cancelar"){_,_ ->
                Toast.makeText(this,"Você cancelou a ação.",Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        btnAlert2.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alert que muda a cor do botão.")
            builder.setMessage("Você deseja modificar a cor do botão para cor vermelha?")
            builder.setPositiveButton("Sim"){dialog, which ->
                Toast.makeText(this,"O botão está da cor vermelha.",Toast.LENGTH_SHORT).show()
                btnAlert2.setBackgroundColor(Color.RED)
                btnAlert2.setTextColor(Color.WHITE)
            }
            builder.setNegativeButton("Não"){dialog,which ->
                Toast.makeText(this,"O botão está da cor anterior.",Toast.LENGTH_SHORT).show()
                btnAlert2.setBackgroundColor(Color.rgb(118,0,255))
                btnAlert2.setTextColor(Color.WHITE)
            }
            builder.setNeutralButton("Cancelar"){_,_ ->
                Toast.makeText(this,"Você cancelou a ação.",Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}