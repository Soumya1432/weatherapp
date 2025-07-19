package com.example.weatherapp.api




sealed class NetworkResponse<T> {
    data class Success<out T>(val data: T) : NetworkResponse<@UnsafeVariance T>()
    data class Error<T>(val message: String) : NetworkResponse<T>()
    class Loading<T> :NetworkResponse<T>()
//    object Loading : NetworkResponse<T>()
}
