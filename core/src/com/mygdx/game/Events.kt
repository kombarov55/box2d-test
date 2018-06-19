package com.mygdx.game

import io.reactivex.subjects.PublishSubject


object Events {


    val showFps = PublishSubject.create<Unit>()

    val showMouseInfo = PublishSubject.create<Unit>()

    val frameTick = PublishSubject.create<Long>()

    val render = PublishSubject.create<R>()

}