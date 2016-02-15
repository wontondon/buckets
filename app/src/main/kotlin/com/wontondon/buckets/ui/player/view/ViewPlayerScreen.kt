package com.wontondon.buckets.ui.player.view

import com.wontondon.buckets.R
import com.wontondon.buckets.ui.ComponentFactory
import com.wontondon.buckets.ui.HasLayout
import com.wontondon.buckets.ui.di.DaggerScope
import com.wontondon.buckets.ui.di.components.ApplicationComponent
import org.parceler.Parcel
import dagger.Component as DaggerComponent

/**
 * @author Donnie McNeal (donnie.mcneal@gmail.com)
 */
@Parcel
class ViewPlayerScreen : HasLayout, ComponentFactory<ApplicationComponent> {

    @DaggerComponent(dependencies = arrayOf(ApplicationComponent::class))
    @DaggerScope(ViewPlayerScreen::class)
    interface Component {
        fun inject(view: ViewPlayerView)
    }

    override fun createComponent(parent: ApplicationComponent): ViewPlayerScreen.Component {
        return DaggerViewPlayerScreen_Component.builder()
            .applicationComponent(parent)
            .build()
    }

    override fun getLayout(): Int = R.layout.screen_view_player
}

