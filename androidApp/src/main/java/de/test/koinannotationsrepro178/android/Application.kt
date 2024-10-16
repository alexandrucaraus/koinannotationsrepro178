package de.test.koinannotationsrepro178.android

import android.app.Application
import de.test.koinannotationsrepro178.initKoin

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin(applicationContext)
    }
}