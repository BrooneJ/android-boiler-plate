package com.example.application

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navigation

@Composable
fun NavigationRoot(
  navController: NavHostController
) {
  NavHost(
    navController = navController,
    startDestination = "auth"
  ) {
    authGraph(navController)
  }
}

private fun NavGraphBuilder.authGraph(navController: NavHostController) {
  navigation(
    startDestination = "intro",
    route = "auth"
  ) {
    /*
    composable(route = "intro") {
      IntroScreenRoot(
        onSignUpClick = {
          navController.navigate("register")
        },
        onSignInClick = {
          navController.navigate("login")
        }
      )
    }
    composable(route = "register") {
      RegisterScreenRoot(
        onSignInClick = {
          navController.navigate("login") {
            popUpTo("register") {
              inclusive = true
              saveState = true
            }
            restoreState = true
          }
        },
        onSuccessfulRegistration = {
          navController.navigate("login")
        }
      )
    }
    composable(route = "login") {
      LoginScreenRoot(
        onSignUpClick = {
          navController.navigate("register")
        },
        onSignInClick = {
          navController.navigate("run")
        }
      )
    }
     */
  }
}