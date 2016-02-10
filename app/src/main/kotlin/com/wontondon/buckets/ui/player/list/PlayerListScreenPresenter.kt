package com.wontondon.buckets.ui.player.list

import com.wontondon.buckets.ui.di.DaggerScope
import mortar.ViewPresenter
import timber.log.Timber
import javax.inject.Inject

@DaggerScope(PlayerListScreen::class)
class PlayerListScreenPresenter : ViewPresenter<PlayerListView> {
    @Inject constructor() {
        Timber.d("Creating PlayerListScreenPresenter")
    }
}