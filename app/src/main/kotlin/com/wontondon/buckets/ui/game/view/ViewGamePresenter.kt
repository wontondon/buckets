package com.wontondon.buckets.ui.game.view

import com.wontondon.buckets.ui.di.DaggerScope
import com.wontondon.buckets.ui.game.edit.EditGameScreen
import com.wontondon.buckets.ui.game.score.ScoreGameScreen
import flow.Flow
import mortar.ViewPresenter
import timber.log.Timber
import javax.inject.Inject

@DaggerScope(ViewGameScreen::class)
class ViewGamePresenter : ViewPresenter<ViewGameView> {
    @Inject constructor() {
        Timber.d("Creating %s", ViewGamePresenter::class.java.simpleName)
    }

    fun editGameClicked() {
        Flow.get(view).set(EditGameScreen())
    }


    fun scoreGameClicked() {
        Flow.get(view).set(ScoreGameScreen())
    }
}