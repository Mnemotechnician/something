package com.github.mnemotechnician.game

import arc.*
import arc.scene.*
import arc.assets.*
import arc.graphics.*
import arc.graphics.g2d.*

class ApplicationLauncher : ApplicationCore() {
	
	override fun setup() {
		//halp wat do i do here QwQ
		
		Log.info("GL Version: @", Core.graphics.getGLVersion());
		Log.info("Max texture size: @", Gl.getInt(Gl.maxTextureSize));
		Log.info("Using @ Context", if (Core.gl30 != null) "OpenGL 3" else "OpenGL 2");
		
		Core.assets = new AssetManager();
        	batch = new SortedSpriteBatch();
		Core.camera = new Camera();
		Core.batch = new SortedSpriteBatch();
		Core.atlas = TextureAtlas.blankAtlas();
		
		Core.scene.root.fill {
			it.left().top().add("AMOGUS")
		}
	}
	
}