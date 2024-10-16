package de.test.koinannotationsrepro178

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level

fun initKoin(context: Context) = startKoin {
    androidContext(context)
    androidLogger(Level.ERROR)
    modules(*modules.toTypedArray())
}