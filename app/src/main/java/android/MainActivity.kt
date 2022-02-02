package com.github.mnemotechnician.game.android

import android.os.Bundle
import android.widget.Toast
import arc.backend.android.AndroidApplication
import com.github.mnemotechnician.game.*

class MainActivity : AndroidApplication() {

	override fun onCreate(savedInstanceState: Bundle?) {
		try {
			super.onCreate(savedInstanceState)
			initialize(ApplicationLauncher())
		} catch (e: Throwable) {
			Toast.makeText(this, e.stackTraceToString(), Toast.LENGTH_LONG).show()  
		}
	}
	
}
