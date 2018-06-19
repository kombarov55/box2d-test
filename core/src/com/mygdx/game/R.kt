package com.mygdx.game

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer
import com.badlogic.gdx.physics.box2d.World
import com.badlogic.gdx.scenes.scene2d.ui.Skin
import com.mygdx.game.hud.Hud

object R {
    lateinit var batch: SpriteBatch
    lateinit var camera: OrthographicCamera
    lateinit var world: World
    lateinit var font: BitmapFont
    lateinit var shapeRenderer: ShapeRenderer
    lateinit var box2DDebugRenderer: Box2DDebugRenderer
    lateinit var hud: Hud
    lateinit var skin: Skin

    fun init() {
        batch = SpriteBatch()
        camera = OrthographicCamera()
        camera.setToOrtho(false, Consts.aspectRatio * 5f, 5f)
        world = World(Vector2(0f, -10f), true)
        font = BitmapFont()
        shapeRenderer = ShapeRenderer()
        box2DDebugRenderer = Box2DDebugRenderer()
        skin = Skin(Gdx.files.internal("flat-earth/skin/flat-earth-ui.json"))
        hud = Hud(skin)
    }
}