package com.myworkout.prototype.android.modules.authentication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.myworkout.shared.app.usecases.LoginUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class LoginViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {

    private val _isAuthorized = MutableLiveData<Boolean>()
    val isAuthorized: LiveData<Boolean>
        get() = _isAuthorized

    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun onLoginClicked() = viewModelScope.launch {
        val input = LoginUseCase.LoginUseCaseInput(
            userName.value ?: "",
            password.value ?: ""
        )

        loginUseCase.invoke(input).collect { result ->
            _isAuthorized.postValue(result)
        }
    }
}
