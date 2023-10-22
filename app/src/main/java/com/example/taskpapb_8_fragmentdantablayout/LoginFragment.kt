package com.example.taskpapb_8_fragmentdantablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import com.example.taskpapb_8_fragmentdantablayout.databinding.ActivityMainBinding
import com.example.taskpapb_8_fragmentdantablayout.databinding.FragmentLoginBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {
    // membuat fragment binding
    private lateinit var binding: FragmentLoginBinding

    // mendefinisikan variable untuk menyimpan komponen nantinya
    private lateinit var usernameEditText : EditText
    private lateinit var passworEditText: EditText
    private lateinit var loginButton : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // membuat binding
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root

        // mendefinisikan komponen dengan binding
        usernameEditText = binding.etUsername
        passworEditText = binding.etPassword
        loginButton = binding.btnLogin

        // set onclick listener ketika login button dipencet
        loginButton.setOnClickListener{
            val username = usernameEditText.text.toString()
            val password = passworEditText.text.toString()

            val usn_credential = "Fadhil"
            val pass_credential = "Fadhil123"

            // pengecekan username dan password sesuai dengan credential yang benar
            if (username == usn_credential && password == pass_credential){
                // pembuatan intenttohomeactivity
                val intenttoHomeActivity = Intent(context, HomeActivity::class.java)
                intenttoHomeActivity.putExtra("EXT_USERNAME", username)
                startActivity(intenttoHomeActivity)
            } else {
                // pembuatan toast ketika user salah memasukkan password
                Toast.makeText(context, "Masukkan Kredensial yang Benar!", Toast.LENGTH_LONG).show()
            }
        }
        return view
    }
}