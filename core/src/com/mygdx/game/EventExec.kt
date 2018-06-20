package com.mygdx.game

import com.badlogic.gdx.math.Vector2
import com.mygdx.game.hud.MouseMode
import io.reactivex.Observable
import io.reactivex.disposables.Disposable


object EventExec {


    lateinit var fps: Disposable
    lateinit var mouseInfo: Disposable

    fun makeSubscriptions() {
        subscribeFps()
        subscribeMouse()
        subscribeMouseModeListener()
        subscribeFpsChangeListener()
        subscribeMouseInfoChangeListener()
    }

    fun subscribeMouse() {
        mouseInfo = Events.frameTick.subscribe {
            UI.drawMouseInfo(
                    R.batch, R.font, R.shapeRenderer,
                    Vector2(Vars.mousePos).apply { y = Consts.WINDOW_HEIGHT - y },
                    R.camera.unproject(Vars.mousePos))
        }
    }

    fun subscribeFps() {
        fps = Events.frameTick.subscribe { dt ->
            UI.drawFps(R.batch, R.font, Consts.fpsPosition, dt)
        }
    }

    fun subscribeMouseModeListener() {
        Events.mouseModeChanged.subscribe { mode ->
            when (mode) {
                MouseMode.MOUSE -> UI.setMouseInputProcessor()
                MouseMode.OBJECT -> UI.setObjectInputProcessor()
            }
        }
    }

    fun subscribeFpsChangeListener() {
        Events.showFps.subscribe {
            if (!fps.isDisposed)
                fps.dispose() else
                subscribeFps()
        }
    }

    fun subscribeMouseInfoChangeListener() {
        Events.showMouseInfo.subscribe {
            if (!mouseInfo.isDisposed)
                mouseInfo.dispose() else
                subscribeMouse()
        }
    }

}