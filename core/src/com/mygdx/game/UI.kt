package com.mygdx.game

import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2

object UI {

    fun drawMouseInfo(batch: SpriteBatch, font: BitmapFont, sr: ShapeRenderer, screenCoords: Vector2, worldCoords: Vector2) {
        val rectangleStart = Vector2(screenCoords).add(50f, - 50f)
        val fontStart = Vector2(rectangleStart).add(25f, 25f)

        drawMouseCoords(batch, font, fontStart, worldCoords)
        drawRectangle(sr, rectangleStart)

    }

    fun drawMouseCoords(batch: SpriteBatch, font: BitmapFont, leftDown: Vector2, worldCoords: Vector2) {
        font.draw(batch, "x=${worldCoords.x} y=${worldCoords.y}", leftDown.x, leftDown.y)
    }

    fun drawRectangle(sr: ShapeRenderer, leftDown: Vector2) {
        val width = 200f
        val height = 50f

        sr.setColor(0f, 1f, 0f, 1f)
        sr.rect(leftDown.x, leftDown.y, width, height)
    }

    fun drawFps(batch: SpriteBatch, font: BitmapFont, position: Vector2, dt: Long) {
        drawString(batch, font, position, "${(1000f / dt).toInt()}")
    }

    fun drawString(batch: SpriteBatch, font: BitmapFont, position: Vector2, text: String) {
        font.draw(batch, text, position.x, position.y)
    }



}