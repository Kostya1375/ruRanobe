package dowell.com.ua.ruranobe

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import dowell.com.ua.ruranobe.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}
