package com.visa

import android.graphics.Color
import com.facebook.react.uimanager.ThemedReactContext

class VisaView(private val sensoryBrandingView: SensoryBrandingView, private val reactContext: ThemedReactContext) {
  init {
    sensoryBrandingView.apply {
      backdropColor = Color.parseColor("#123333")
      languageCode = "en"
      hapticEnabled = true
      soundEnabled = true
      checkmarkMode = CheckmarkMode.CHECKMARK_WITH_TEXT
      checkmarkText = CheckmarkTextOption.APPROVE
    }
  }

  fun setSoundEnabled(isEnabled: Boolean) {
    sensoryBrandingView.soundEnabled = isEnabled
  }

  fun setBackdropColor(color: Int) {
    sensoryBrandingView.backdropColor = color
  }
}
