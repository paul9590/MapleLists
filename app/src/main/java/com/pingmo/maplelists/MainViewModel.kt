package com.pingmo.maplelists

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pingmo.maplelists.model.CharacterInfo


class MainViewModel: ViewModel() {
    private val _characterInfo = MutableLiveData<CharacterInfo>()
    val characterInfo = _characterInfo

    private val _result = MutableLiveData<Boolean>()
    val result = _result


}