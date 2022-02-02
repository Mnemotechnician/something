package com.github.mnemotechnician.game.android

import arc.backend.android.AndroidApplication
import com.github.mnemotechnician.game.core.*

class MainActivity : AndroidApplication() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		initialize
	}
	
}
