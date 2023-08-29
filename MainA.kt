package com.uvg.laboratorio4

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.appcompat.widget.AppCompatButton

class MainA: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val buttonContainer = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }

        addButtonToContainer(buttonContainer, "Activity 1", MainActivity::class.java)
        addButtonToContainer(buttonContainer, "Activity 2", MainActivity2::class.java)
        addButtonToContainer(buttonContainer, "Activity 3", MainActivity3::class.java)
        addButtonToContainer(buttonContainer, "Activity 4", MainActivity4::class.java)

        setContentView(buttonContainer)
    }
    private fun addButtonToContainer(
        container: ViewGroup,
        buttonText: String,
        targetActivity: Class<*>
    ) {
        val button = AppCompatButton(this).apply {
            text = buttonText
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            setOnClickListener {
                val intent = Intent(this@MainA, targetActivity)
                startActivity(intent)
            }
        }
        container.addView(button)
    }
}