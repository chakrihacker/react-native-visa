//
//  VisaViewManager.swift
//  react-native-visa
//
//  Created by Subramanya on 01/09/23.
//

@objc(VisaViewManager)
class VisaViewManager: RCTViewManager {

  override func view() -> (VisaView) {
    return VisaView()
  }

  @objc override static func requiresMainQueueSetup() -> Bool {
    return false
  }
}

class VisaView : UIView {

  @objc var color: String = "" {
    didSet {
      self.backgroundColor = hexStringToUIColor(hexColor: color)
    }
  }

  func hexStringToUIColor(hexColor: String) -> UIColor {
    let stringScanner = Scanner(string: hexColor)

    if(hexColor.hasPrefix("#")) {
      stringScanner.scanLocation = 1
    }
    var color: UInt32 = 0
    stringScanner.scanHexInt32(&color)

    let r = CGFloat(Int(color >> 16) & 0x000000FF)
    let g = CGFloat(Int(color >> 8) & 0x000000FF)
    let b = CGFloat(Int(color) & 0x000000FF)

    return UIColor(red: r / 255.0, green: g / 255.0, blue: b / 255.0, alpha: 1)
  }
} 
