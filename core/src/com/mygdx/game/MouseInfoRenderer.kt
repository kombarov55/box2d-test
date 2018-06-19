package com.mygdx.game

import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2


class MouseInfoRenderer(
        private val sb: SpriteBatch,
        private val font: BitmapFont,
        private val sr: ShapeRenderer) {

    fun draw(mousePos: Vector2, worldPos: Vector2) {
        UI.drawMouseInfo(sb, font, sr, mousePos, worldPos)
    }
}