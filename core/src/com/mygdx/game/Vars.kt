package com.mygdx.game

import com.badlogic.gdx.math.Vector2

object Vars {

    var lastFrameMillis: Long = System.currentTimeMillis()
    val mousePos = Vector2()
    var infCreatePos: Vector2? = null // Vector2(App.WINDOW_WIDTH * 0.5f, App.WINDOW_HEIGHT - (App.WINDOW_HEIGHT * 0.8f))

    var showFps = true
    var showMouseInfo = true

}