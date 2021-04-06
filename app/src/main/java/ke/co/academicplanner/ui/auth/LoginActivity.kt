package ke.co.academicplanner.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.academicplanner.databinding.ActivityLoginBinding
import ke.co.academicplanner.ui.HomeActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initWidgets()
    }

    private fun initWidgets() {

        binding.loginButton.setOnClickListener {

            val intent = Intent(this@LoginActivity, HomeActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            }

            startActivity(intent)
        }

        binding.registerPromptTv.setOnClickListener {

            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)

            startActivity(intent)
        }
    }
}