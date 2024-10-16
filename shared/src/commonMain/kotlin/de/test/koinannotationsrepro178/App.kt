package de.test.koinannotationsrepro178

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import de.test.modulea.aScreen
import de.test.moduleb.bScreen
import org.koin.compose.KoinContext

@Composable
fun App() = KoinContext {
    val navController = rememberNavController()
    NavHost(
        startDestination = "aroute",
        navController = navController,
    ) {
        aScreen(navBack = navController::popBackStack)
        bScreen(navBack = navController::popBackStack)
    }
}