package com.example.android.diceroller.trivia

import android.os.CountDownTimer
import android.text.format.DateUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    companion object {
        private const val DONE = 0L

        private const val ONE_SECOND = 1000L

        private const val COUNTDOWN_TIME = 10000L
    }

    private val timer: CountDownTimer
    private val _timerCount = MutableLiveData<String>()
    val timerCount: LiveData<String>
        get() = _timerCount

    private val _timerFinished = MutableLiveData<Boolean>()
    val timerFinished: LiveData<Boolean>
        get() = _timerFinished

    init {
        _timerFinished.value = false
        timer = object : CountDownTimer(COUNTDOWN_TIME, ONE_SECOND) {
            override fun onFinish() {
                _timerFinished.value = true
            }

            override fun onTick(millisUntilFinished: Long) {
                _timerCount.value = DateUtils.formatElapsedTime(millisUntilFinished/1000)
            }

        }
    }

    fun timerStart(){
        timer.start()
    }

    fun timerStop(){
        timer.cancel()
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }

}