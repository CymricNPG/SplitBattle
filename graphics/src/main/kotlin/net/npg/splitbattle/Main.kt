package net.npg.splitbattle

import com.badlogic.gdx.Game
import net.npg.splitbattle.ui.screens.*

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
class Main : Game() {
    private lateinit var screenManager: ScreenManager

    override fun create() {
        screenManager = ScreenManager(this)

        // Screens registrieren
        screenManager.registerScreen(ScreenId.LoadingScreen, LoadingScreen::class.java)
        screenManager.registerScreen(ScreenId.TitleScreen, TitleScreen::class.java)
        screenManager.registerScreen(ScreenId.OptionsScreen, OptionsScreen::class.java)
        screenManager.registerScreen(ScreenId.SinglePlayerScreen, SinglePlayerScreen::class.java)
        screenManager.registerScreen(ScreenId.GameScreen, GameScreen::class.java)
        screenManager.registerScreen(ScreenId.ImpressumScreen, ImpressumScreen::class.java)
        screenManager.registerScreen(ScreenId.HelpScreen, HelpScreen::class.java)
        screenManager.registerScreen(ScreenId.MultiPlayerScreen, MultiPlayerScreen::class.java)
        screenManager.registerScreen(ScreenId.MultiPlayerOptionsScreen, MultiPlayerOptionsScreen::class.java)
        screenManager.registerScreen(ScreenId.WaitForPlayersScreen, WaitForPlayersScreen::class.java)

        // Mit LoadingScreen starten
        screenManager.switchTo(ScreenId.LoadingScreen)
    }
}
