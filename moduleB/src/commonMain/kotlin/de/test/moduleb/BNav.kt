package de.test.moduleb

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import org.koin.compose.viewmodel.koinViewModel

private const val B_ROUTE = "broute"

fun NavController.navToBScreen() = navigate(B_ROUTE)

fun NavGraphBuilder.bScreen(
    modifier: Modifier = Modifier,
    navBack: () -> Unit,
) {
    composable(B_ROUTE) {
        val vm = koinViewModel<BViewModel>()
        BScreen(
            modifier = modifier,
            text = vm.text,
            navBack = navBack,
        )
    }
}
