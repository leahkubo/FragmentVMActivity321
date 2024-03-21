package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val side = MutableLiveData<Int>()

    fun changeSide(newSide: Int){
        side.value = newSide
    }

    fun getSide(): LiveData<Int> {
        return side
    }
}