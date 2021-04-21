package com.rsoftware.vmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var mContador = MutableLiveData<String>().apply { value = contador.toString() }

    private var contador: Int = 0

    private fun setMContador(){
        mContador.value = contador.toString()
    }

    private fun validaContador() {
        contador++
        if(contador > 5){
            contador = 0
        }

        setMContador()
    }

    fun Contador(){
        validaContador()
    }
}