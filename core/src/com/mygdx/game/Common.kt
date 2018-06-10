package com.mygdx.game

import com.badlogic.gdx.math.Vector2

object Common {

    var lastFrameMillis: Long = System.currentTimeMillis()
    val mousePos = Vector2()
    var infCreatePos: Vector2? = null // Vector2(App.WINDOW_WIDTH * 0.5f, App.WINDOW_HEIGHT - (App.WINDOW_HEIGHT * 0.8f))
    val fpsPosition = Vector2(App.WINDOW_WIDTH * 0.9f, App.WINDOW_HEIGHT * 0.9f)

}