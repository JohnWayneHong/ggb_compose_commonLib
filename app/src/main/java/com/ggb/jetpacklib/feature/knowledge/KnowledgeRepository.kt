package com.ggb.jetpacklib.feature.knowledge

import com.ggb.commonlib.network.extension.getApiService
import com.ggb.commonlib.network.repository.BaseRepository
import com.ggb.commonlib.network.result.NetworkResult
import com.ggb.jetpacklib.data.KnowledgeItem
import com.ggb.jetpacklib.service.KnowledgeService
import kotlinx.coroutines.flow.Flow

class KnowledgeRepository : BaseRepository() {


    val apiService by lazy {
        getApiService<KnowledgeService>()
    }

    /**
     * 知识体系
     * */
    fun getKnowledgeTree() : Flow<NetworkResult<List<KnowledgeItem>>> {
        return requestFlow(
            apiCall = { apiService.getKnowledgeTree() },
        )
    }



}