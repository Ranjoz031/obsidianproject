package layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obsidianbank.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

    }
}