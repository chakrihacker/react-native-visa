package com.visa


import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.UIBlock
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.UIManagerModule


@ReactModule(name = VisaViewModule.TAG)
class VisaViewModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
  companion object {
    const val TAG = "VisaViewModule"
  }

  override fun getName(): String {
    return TAG
  }

  @ReactMethod
  fun startAnimation(viewTag: Int) {
    val uiManagerModule = reactApplicationContext.getNativeModule(UIManagerModule::class.java)
    uiManagerModule?.addUIBlock(UIBlock {nativeViewHierarchyManager ->
      val view = nativeViewHierarchyManager.resolveView(viewTag) as SensoryBrandingView
      view.animate { result ->
        result?.message ?: "OK"
      }
    })
  }
}
