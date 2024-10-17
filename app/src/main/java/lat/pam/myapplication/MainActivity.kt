package lat.pam.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var mCount = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonSwitchPage = findViewById<Button>(R.id.button_switchpage)
        val buttonBrowser = findViewById<Button>(R.id.button_browser)

        buttonCountUp.setOnClickListener {
            mCount++
            Log.d("mCount", mCount.toString())
            mShowCount.text = mCount.toString()
        }

        buttonToast.setOnClickListener {
            val tulisan: String = mShowCount.text.toString()
            Toast.makeText(this, "Angka yang dimunculkan $tulisan", Toast.LENGTH_LONG).show()
        }

        buttonSwitchPage.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        buttonBrowser.setOnClickListener {
            val intentbrowse = Intent(Intent.ACTION_VIEW)
            intentbrowse.setData(Uri.parse("https://www.google.com/"))
            startActivity(intentbrowse)
        }

    }
}
