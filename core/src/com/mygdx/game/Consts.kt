package com.mygdx.game

import com.badlogic.gdx.math.Vector2

object Consts {
    @JvmStatic val WINDOW_WIDTH = 800
    @JvmStatic val WINDOW_HEIGHT = 480
    val aspectRatio = Consts.WINDOW_WIDTH.toFloat() / Consts.WINDOW_HEIGHT.toFloat()

    val fpsPosition = Vector2(Consts.WINDOW_WIDTH * 0.9f, Consts.WINDOW_HEIGHT * 0.9f)
}