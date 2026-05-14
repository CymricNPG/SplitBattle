package net.npg.splitbattle.ui.screens

interface ScreenSwitcher {
    fun switchTo(screenId: ScreenId, parameter: Any? = null)
}
