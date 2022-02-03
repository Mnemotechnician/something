package com.github.mnemotechnician.game

import android.os.Bundle
import android.widget.Toast
import android.content.Intent
import arc.backend.android.AndroidApplication
import com.github.mnemotechnician.game.*

class MainActivity : android.app.Activity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		try {
			super.onCreate(savedInstanceState)
			
			Thread.setDefaultUncaughtExceptionHandler(object : Thread.UncaughtExceptionHandler {
				override fun uncaughtException(t: Thread, exception: Throwable) {
					showToast(exception.stackTraceToString())
				}
			});
			
			//launch our activity
			startActivity(Intent(this, GameActivity::class.java))
		} catch (e: Throwable) {
			showToast(e.stackTraceToString())
		}
	}
	
	class GameActivity : AndroidApplication() {
		
		override fun onCreate(savedInstanceState: Bundle?) {
			super.onCreate(savedInstanceState)
			initialize(ApplicationLauncher())
			
			showToast("initialized!")
		}
		
	}
	
	fun showToast(text: String) = Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	
}
