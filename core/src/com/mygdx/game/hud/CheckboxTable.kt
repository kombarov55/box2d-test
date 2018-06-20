package com.mygdx.game.hud

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.scenes.scene2d.ui.*
import com.mygdx.game.Events
import com.mygdx.game.addClickListener


class CheckboxTable(skin: Skin): Table(skin) {

    val showFps: Button
    val showMouseInfo: Button
    val mouseMode: CheckBox
    val objectMode: CheckBox
    val mouseGroup: ButtonGroup<CheckBox>


    init {
//        debug = true

        width = Gdx.graphics.width * 0.2f
        height = Gdx.graphics.height * 0.3f
        x = Gdx.graphics.width * 0.01f
        y = Gdx.graphics.height * 0.69f

        defaults().expand().top().left()

        showFps = TextButton("fps", skin)
        showMouseInfo = TextButton("mouse info", skin)
        mouseMode = CheckBox("mouse", skin)
        objectMode = CheckBox("objects", skin)

        mouseGroup = ButtonGroup(mouseMode, objectMode)


        showFps.addClickListener { Events.showFps.onNext(Unit) }
        showMouseInfo.addClickListener { Events.showMouseInfo.onNext(Unit) }
        objectMode.addClickListener { Events.mouseModeChanged.onNext(MouseMode.OBJECT) }
        mouseMode.addClickListener { Events.mouseModeChanged.onNext(MouseMode.MOUSE) }


        add(showFps)
        row()
        add(showMouseInfo)
        row()
        add(mouseMode)
        add(objectMode)

    }


}