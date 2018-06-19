package com.mygdx.game.hud

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.mygdx.game.Events
import com.mygdx.game.addClickListener


class CheckboxTable(skin: Skin): Table(skin) {

    val showFps: Button
    val showMouseInfo: Button

    init {
//        debug = true

        width = Gdx.graphics.width * 0.2f
        height = Gdx.graphics.height * 0.3f
        x = Gdx.graphics.width * 0.01f
        y = Gdx.graphics.height * 0.69f

        defaults().expand().top().left()

        showFps = TextButton("show fps", skin)
        showMouseInfo = TextButton("show mouse info", skin)

        showFps.addClickListener { Events.showFps.onNext(Unit) }
        showMouseInfo.addClickListener { Events.showMouseInfo.onNext(Unit) }


        add(showFps)
        row()
        add(showMouseInfo)

    }


}