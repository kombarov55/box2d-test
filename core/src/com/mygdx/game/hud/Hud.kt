package com.mygdx.game.hud

import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.ui.Skin


class Hud(skin: Skin): Stage() {


    init {
        addActor(CheckboxTable(skin))
    }


    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        return false
    }
}