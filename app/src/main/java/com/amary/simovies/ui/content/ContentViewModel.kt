package com.amary.simovies.ui.content

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.paging.CombinedLoadStates
import com.amary.core.domain.usecase.UseCase

class ContentViewModel(private val useCase: UseCase) : ViewModel() {
    fun content(section: Int) = when(section){
        1 -> useCase.allMovie().asLiveData()
        else -> useCase.allTv().asLiveData()
    }

    fun pagerResource(loadState: CombinedLoadStates) = useCase.pagerResource(loadState).asLiveData()
}