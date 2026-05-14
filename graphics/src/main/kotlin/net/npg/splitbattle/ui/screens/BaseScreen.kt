package net.npg.splitbattle.ui.screens

import com.badlogic.gdx.Screen

interface BaseScreen : Screen {
    fun initialize(switcher: ScreenSwitcher)
    fun setParameter(parameter: Any?) {}
}
