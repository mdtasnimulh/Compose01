package com.tasnim.chowdhury.compose01.util

import androidx.annotation.DrawableRes
import com.tasnim.chowdhury.compose01.R

sealed class OnBoardingPage (
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    data object First: OnBoardingPage (
        image = R.drawable.android,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, lorem ipsum dolor sit amet."
    )

    data object Second: OnBoardingPage (
        image = R.drawable.android,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, lorem ipsum dolor sit amet."
    )

    data object Third: OnBoardingPage (
        image = R.drawable.android,
        title = "Dialog",
        description = "Lorem ipsum dolor sit amet, lorem ipsum dolor sit amet."
    )
}