package com.myworkout.prototype.android.modules.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.myworkout.prototype.android.databinding.FragmentLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentLoginBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
            loginViewModel = this@LoginFragment.loginViewModel
        }.root
    }

    override fun onResume() {
        super.onResume()
        loginViewModel.isAuthorized.observe(viewLifecycleOwner) { isAuthorized ->
            activity?.run {
                Toast.makeText(this, isAuthorized.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}