package com.nochita.survivors.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _balanceCrypto = MutableLiveData<String>().apply {
        value = "10"
    }
    val balanceCrypto: LiveData<String> = _balanceCrypto

    private val _balanceARS = MutableLiveData<String>().apply {
        value = "~= $4000"
    }
    val balanceARS: LiveData<String> = _balanceARS


    private val _address = MutableLiveData<String>().apply {
        value = "0x0J5N6...9G7J5"
    }
    val address: LiveData<String> = _address
}