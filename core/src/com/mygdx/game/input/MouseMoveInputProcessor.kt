package com.mygdx.game.input

import com.badlogic.gdx.InputProcessor
import com.mygdx.game.Vars
import com.mygdx.game.set


abstract class MouseMoveInputProcessor : InputProcessor {

    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        Vars.mousePos.set(screenX, screenY)
        return true
    }
}