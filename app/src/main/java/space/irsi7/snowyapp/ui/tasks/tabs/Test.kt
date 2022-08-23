package space.irsi7.snowyapp.ui.tasks.tabs

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import android.os.Bundle
import android.view.View
import space.irsi7.snowyapp.R
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class Test : AppCompatActivity() {
    var tabLayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tabLayout!!.findViewById<View>(R.id.tab_layout)
        tabLayout!!.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {}
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}