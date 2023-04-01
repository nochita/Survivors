package com.nochita.survivors.ui.qr

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class QRViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is qr Fragment"
    }
    val text: LiveData<String> = _text

    fun  askForPayment(trackData: String) {
        viewModelScope.launch {

        }
    }
}