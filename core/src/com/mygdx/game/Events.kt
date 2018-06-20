package com.mygdx.game

import com.mygdx.game.hud.MouseMode
import io.reactivex.subjects.PublishSubject


object Events {


    val showFps = PublishSubject.create<Unit>()
    val showMouseInfo = PublishSubject.create<Unit>()
    val mouseModeChanged = PublishSubject.create<MouseMode>()

    val frameTick = PublishSubject.create<Long>()
    val render = PublishSubject.create<R>()

}