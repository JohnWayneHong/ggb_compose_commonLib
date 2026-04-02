package com.ggb.jetpacklib

import com.ggb.commonlib.mvi.ViewIntent
import com.ggb.jetpacklib.data.Article

/**
 * MainActivity 的 Intent
 */
sealed class MainIntent : ViewIntent {
    /**
     * 切换 Tab
     */
    data class SelectTab(val tabIndex: Int) : MainIntent()
    
    /**
     * 打开文章链接
     */
    data class OpenArticle(val article: Article) : MainIntent()
    
    /**
     * 关闭 LinkScreen
     */
    object CloseLinkScreen : MainIntent()
}

