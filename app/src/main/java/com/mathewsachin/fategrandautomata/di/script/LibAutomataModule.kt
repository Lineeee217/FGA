package com.mathewsachin.fategrandautomata.di.script

import com.mathewsachin.libautomata.*
import com.mathewsachin.libautomata.dagger.ScriptScope
import com.mathewsachin.libautomata.extensions.AutomataApi
import com.mathewsachin.libautomata.extensions.IAutomataExtensions
import com.mathewsachin.libautomata.extensions.IImageMatchingExtensions
import com.mathewsachin.libautomata.extensions.ImageMatchingExtensions
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

@Module
@InstallIn(ScriptComponent::class)
abstract class LibAutomataModule {
    companion object {
        @ScriptScope
        @Provides
        fun exitManager() = ExitManager()
    }

    @ScriptScope
    @Binds
    abstract fun swiper(swiper: RealSwiper): Swiper

    @ScriptScope
    @Binds
    abstract fun waiter(waiter: RealWaiter): Waiter

    @ScriptScope
    @Binds
    abstract fun highlighter(highlighter: RealHighlighter): Highlighter

    @ScriptScope
    @Binds
    abstract fun clicker(clicker: RealClicker): Clicker

    @ScriptScope
    @Binds
    abstract fun scale(scale: RealScale): Scale

    @ScriptScope
    @Binds
    abstract fun transformer(transformer: RealTransformer): Transformer

    @ScriptScope
    @Binds
    abstract fun automataApi(automataApi: AutomataApi): IAutomataExtensions

    @ScriptScope
    @Binds
    abstract fun imageMatchingExtensions(imageMatchingExtensions: ImageMatchingExtensions): IImageMatchingExtensions
}