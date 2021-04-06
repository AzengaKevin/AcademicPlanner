package ke.co.academicplanner.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ke.co.academicplanner.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initWidgets()
    }

    private fun initWidgets() {

        binding.loginPromptTv.setOnClickListener {
            //Finish the activity and take user to the previous activity or kill the application
            finish()
        }
    }
}