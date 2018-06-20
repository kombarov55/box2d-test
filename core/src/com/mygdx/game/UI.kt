package com.mygdx.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.mygdx.game.hud.MouseMode

object UI {

    fun drawMouseInfo(batch: SpriteBatch, font: BitmapFont, sr: ShapeRenderer, screenCoords: Vector2, worldCoords: Vector2) {
        val rectWidth = 200f
        val rectHeight = 50f

        val rectangleStart = Vector2(screenCoords).add(50f, - 50f)
        val fontStart = Vector2(rectangleStart).add(rectWidth * 0.1f, rectHeight * 0.6f)

        drawMouseCoords(batch, font, fontStart, worldCoords)
        drawRectangle(sr, rectangleStart, rectWidth, rectHeight)
    }

    fun drawMouseCoords(batch: SpriteBatch, font: BitmapFont, leftDown: Vector2, worldCoords: Vector2) {
        font.draw(batch, "x=${worldCoords.x} y=${worldCoords.y}", leftDown.x, leftDown.y)
    }

    fun drawRectangle(sr: ShapeRenderer, leftDown: Vector2, width: Float, height: Float) {

        sr.setColor(0f, 1f, 0f, 1f)
        sr.rect(leftDown.x, leftDown.y, width, height)
    }

    fun drawFps(batch: SpriteBatch, font: BitmapFont, position: Vector2, dt: Long) {
        drawString(batch, font, position, "${(1000f / dt).toInt()}")
    }

    fun drawString(batch: SpriteBatch, font: BitmapFont, position: Vector2, text: String) {
        font.draw(batch, text, position.x, position.y)
    }

    fun setMouseInputProcessor() {
        val imul = Gdx.input.inputProcessor as InputMultiplexer
        imul.processors.removeIndex(imul.size() - 1)
        imul.addProcessor(Consts.mouseInputProcessor)
    }

    fun setObjectInputProcessor() {
        val imul = Gdx.input.inputProcessor as InputMultiplexer
        imul.processors.removeIndex(imul.size() - 1)
        imul.addProcessor(Consts.objectInputProcessor)
    }



}