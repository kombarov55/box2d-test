package com.mygdx.game

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.physics.box2d.BodyDef
import com.badlogic.gdx.physics.box2d.PolygonShape
import com.badlogic.gdx.physics.box2d.World

object Bodies {

    fun createBox(world: World, width: Float, height: Float, center: Vector2) {
        val bdef = BodyDef()
        bdef.type = BodyDef.BodyType.DynamicBody
        bdef.position.set(center)
        val body = world.createBody(bdef)

        val shape = PolygonShape()
        shape.setAsBox(width, height)
        val fixture = body.createFixture(shape, 0f)
    }

}