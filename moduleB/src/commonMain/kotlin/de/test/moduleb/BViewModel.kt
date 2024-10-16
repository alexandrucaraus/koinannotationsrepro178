package de.test.moduleb

import androidx.lifecycle.ViewModel
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class BViewModel : ViewModel() {
    val text = "BViewModel"
}
