package com.github.mnemotechnician.game.android

import android.os.Bundle
import arc.backend.android.AndroidApplication
import com.github.mnemotechnician.game.*

class MainActivity : AndroidApplication() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		initialize(ApplicationLauncher())
	}
	
}
