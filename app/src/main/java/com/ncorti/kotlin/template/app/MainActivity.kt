package com.ncorti.kotlin.template.app

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.kotlin.template.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.buttonCompute.setOnClickListener {
			if (binding.editTextFactorial.text.isNotEmpty()) {
				val input = binding.editTextFactorial.text.toString().toInt()
				val result = input.let {
					var i = 1
					for (i in 1..it) i *= i
					i
				}

				binding.textResult.text = result
				binding.textResult.visibility = View.VISIBLE

				notificationUtil.showNotification(
					context = this,
					title = getString(R.string.notification_title),
					message = result
				)
			} else {
				Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
			}
		}
	}
}
