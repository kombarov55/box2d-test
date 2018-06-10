package com.mygdx.game

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer
import com.badlogic.gdx.physics.box2d.World

object R {
    lateinit var batch: SpriteBatch
    lateinit var camera: OrthographicCamera
    lateinit var world: World
    lateinit var font: BitmapFont
    lateinit var shapeRenderer: ShapeRenderer
    lateinit var box2DDebugRenderer: Box2DDebugRenderer

    fun init() {
        batch = SpriteBatch()
        camera = OrthographicCamera()
        camera.setToOrtho(false, 25f, 25f)
        world = World(Vector2(0f, -10f), true)
        font = BitmapFont()
        shapeRenderer = ShapeRenderer()
        box2DDebugRenderer = Box2DDebugRenderer()
    }
}