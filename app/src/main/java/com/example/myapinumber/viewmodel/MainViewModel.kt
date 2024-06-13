package com.example.myapinumber.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import androidx.lifecycle.viewModelScope
import com.example.myapinumber.api.RetrofitHelper
import com.example.myapinumber.api.dto.ActivityData
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val apiService = RetrofitHelper.apiService

    // Campo para almacenar los datos de la actividad
    private val _activityData = MutableLiveData<ActivityData>()
    val activityData: LiveData<ActivityData> = _activityData

    // Método para recuperar los datos de la actividad
    fun retrieveActivity() {
        viewModelScope.launch {
            try {
                val response = apiService.getActivity()
                _activityData.value = response
            } catch (e: Exception) {
                // Manejar errores aquí
            }
        }
    }
}