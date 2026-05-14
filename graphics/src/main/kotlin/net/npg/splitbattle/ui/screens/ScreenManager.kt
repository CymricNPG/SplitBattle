package net.npg.splitbattle.ui.screens

import com.badlogic.gdx.Game
import java.util.EnumMap

class ScreenManager(private val game: Game) : ScreenSwitcher {

    private val screens = EnumMap<ScreenId, Class<out BaseScreen>>(ScreenId::class.java)
    private var currentScreen: BaseScreen? = null

    fun registerScreen(screenId: ScreenId, screenClass: Class<out BaseScreen>) {
        screens[screenId] = screenClass
    }

    override fun switchTo(screenId: ScreenId, parameter: Any?) {
        val screenClass = screens[screenId] ?: throw IllegalArgumentException("Screen $screenId not registered")
        val nextScreen = screenClass.getDeclaredConstructor().newInstance()

        nextScreen.initialize(this)
        if (parameter != null) {
            nextScreen.setParameter(parameter)
        }

        game.screen = nextScreen
        currentScreen?.dispose()
        currentScreen = nextScreen
    }
}
