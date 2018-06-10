package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.mygdx.game.R.world

class App: ApplicationAdapter(), InputProcessor {

    override fun create() {
        R.init()

        Gdx.input.inputProcessor = this
    }

    override fun render() {
        Gdx.gl.glClearColor(55f, 55f, 55f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        world.step(1/60f, 6, 2)

        R.camera.update()

        val currentMillis = System.currentTimeMillis()
        val dt = currentMillis - Common.lastFrameMillis
        Common.lastFrameMillis = currentMillis

        R.shapeRenderer.begin(ShapeRenderer.ShapeType.Line)
        R.batch.begin()
        UI.drawMouseInfo(R.batch, R.font, R.shapeRenderer, Vector2(Common.mousePos).apply { y = App.WINDOW_HEIGHT - y }, R.camera.unproject(Common.mousePos))
        UI.drawFps(R.batch, R.font, Common.fpsPosition, dt)
        if (Common.infCreatePos != null) {
            Bodies.createBox(world, 0.5f, 0.5f, R.camera.unproject(Common.infCreatePos!!))
        }


        R.batch.end()
        R.shapeRenderer.end()

        R.box2DDebugRenderer.render(R.world, R.camera.combined)
    }

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
//        Common.infCreatePos = Vector2(screenX, screenY
        return true
    }

    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        Common.mousePos.set(screenX, screenY)
        return true
    }





    override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        return false
    }

    override fun keyTyped(character: Char): Boolean {
        return false
    }

    override fun scrolled(amount: Int): Boolean {
        return false
    }

    override fun keyUp(keycode: Int): Boolean {
        return false
    }

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
        return false
    }

    override fun keyDown(keycode: Int): Boolean {
        return false
    }


    companion object {
        @JvmStatic val WINDOW_WIDTH = 800
        @JvmStatic val WINDOW_HEIGHT = 480
    }
}