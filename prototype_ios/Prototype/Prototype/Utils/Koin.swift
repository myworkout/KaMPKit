//
//  Koin.swift
//  Prototype
//
//  Created by Alex Severyanov on 6/21/21.
//

import Foundation
import shared

func startKoin() {
    let userDefaults = UserDefaults.standard
    let iosAppInfo = IosAppInfo()
    let doOnStartup = {}

    let koinApplication = KoinIOSKt.doInitKoinIos(userDefaults: userDefaults, appInfo: iosAppInfo, doOnStartup: doOnStartup)
    _koin = koinApplication.koin
}

private var _koin: Koin_coreKoin? = nil
var koin: Koin_coreKoin {
    if _koin == nil {
        startKoin()
    }
    return _koin!
}

extension Koin_coreKoin {
    func get<T: AnyObject>(_ class: T.Type = T.self) -> T {
        return get(objCClass: `class`, parameter: "") as! T
    }
}

class IosAppInfo : AppInfo {
    let appId: String = Bundle.main.bundleIdentifier!
}

@propertyWrapper
public struct Inject<Value: AnyObject> {

    public var wrappedValue: Value

    public init() {
        self.wrappedValue = koin.get()
    }
}
