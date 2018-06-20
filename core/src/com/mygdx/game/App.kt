package com.mygdx.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer
import com.badlogic.gdx.InputProcessor
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.mygdx.game.R.world
import com.badlogic.gdx.math.Vector2

class App: ApplicationAdapter() {

    override fun create() {
        R.init()
        EventExec.makeSubscriptions()

        Gdx.input.inputProcessor = InputMultiplexer(R.hud, Consts.mouseInputProcessor)
    }

    override fun render() {
        Gdx.gl.glClearColor(55f, 55f, 55f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        world.step(1/60f, 6, 2)

        R.camera.update()

        val currentMillis = System.currentTimeMillis()
        val dt = currentMillis - Vars.lastFrameMillis
        Vars.lastFrameMillis = currentMillis

        R.hud.draw()
        R.shapeRenderer.begin(ShapeRenderer.ShapeType.Line)
        R.batch.begin()
        Events.frameTick.onNext(dt)
        R.batch.end()
        R.shapeRenderer.end()

        R.box2DDebugRenderer.render(R.world, R.camera.combined)
    }
}