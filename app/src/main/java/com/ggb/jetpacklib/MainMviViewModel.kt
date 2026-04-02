package com.ggb.jetpacklib

import com.ggb.commonlib.mvi.MviViewModel

/**
 * MainActivity 的 MVI ViewModel
 */
class MainMviViewModel : MviViewModel<MainIntent, MainViewState>() {
    
    override fun initialState(): MainViewState {
        return MainViewState.initial()
    }
    
    override fun reduce(currentState: MainViewState, intent: MainIntent): MainViewState {
        return when (intent) {
            is MainIntent.SelectTab -> {
                currentState.copy(selectedTab = intent.tabIndex)
            }
            is MainIntent.OpenArticle -> {
                currentState.copy(
                    linkScreenData = Pair(intent.article.title, intent.article.link)
                )
            }
            is MainIntent.CloseLinkScreen -> {
                currentState.copy(linkScreenData = null)
            }
        }
    }
}

