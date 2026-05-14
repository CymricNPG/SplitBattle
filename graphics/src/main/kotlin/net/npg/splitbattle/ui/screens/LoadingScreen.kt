package net.npg.splitbattle.ui.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20

class LoadingScreen : AbstractScreen() {
    override fun render(delta: Float) {
        Gdx.gl.glClearColor(0f, 0f, 0.2f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        if (Gdx.input.isTouched) {
            switcher.switchTo(ScreenId.TitleScreen)
        }
    }
}
