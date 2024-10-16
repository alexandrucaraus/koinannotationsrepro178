package de.test.modulea

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import org.koin.compose.viewmodel.koinViewModel

private const val A_ROUTE = "aroute"

fun NavController.navToAScreen() = navigate(A_ROUTE)

fun NavGraphBuilder.aScreen(
    modifier: Modifier = Modifier,
    navBack: () -> Unit,
) {
    composable(A_ROUTE) {
        val vm = koinViewModel<AViewModel>()
        AScreen(
            modifier = modifier,
            text = vm.text,
            navBack = navBack,
        )
    }
}
