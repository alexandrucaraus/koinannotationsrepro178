package de.test.modulea

import androidx.lifecycle.ViewModel
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class AViewModel : ViewModel() {
    val text = "AViewModel"
}
