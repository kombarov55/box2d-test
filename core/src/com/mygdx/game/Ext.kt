package com.mygdx.game

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.ui.Button
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox

fun OrthographicCamera.unproject(v2: Vector2): Vector2 {
    val v3 = this.unproject(Vector3(v2, 0f))
    return Vector2(v3.x, v3.y)
}

fun OrthographicCamera.unproject(x: Int, y: Int): Vector2 {
    return unproject(Vector2(x.toFloat(), y.toFloat()))
}

fun Vector2.set(x: Int, y: Int): Vector2 {
    set(x.toFloat(), y.toFloat())
    return this
}

fun Vector2(x: Int, y: Int): Vector2 {
    return Vector2(x.toFloat(), y.toFloat())
}

fun Actor.addClickListener(f: () -> Unit) {
    addListener {
        f.invoke()
        true
    }
}