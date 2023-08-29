package com.visa

import android.graphics.Color
import android.util.Log
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class VisaViewManager : SimpleViewManager<SensoryBrandingView>() {
  override fun getName() = "VisaView"

  private lateinit var visaView: VisaView

  override fun createViewInstance(reactContext: ThemedReactContext): SensoryBrandingView {
    val sensoryBrandingView = reactContext.currentActivity?.let { SensoryBrandingView(it, null) }
    visaView = sensoryBrandingView?.let { VisaView(it, reactContext) }!!
    return sensoryBrandingView
  }

  @ReactProp(name = "backdropColor")
  fun setBackdropColor(view: SensoryBrandingView, color: String) {
    visaView.setBackdropColor(Color.parseColor(color))
  }

  @ReactProp(name="soundEnabled")
  fun setSoundEnabled(view: SensoryBrandingView, isEnabled: Boolean) {
    visaView.setSoundEnabled((isEnabled))
  }
}
