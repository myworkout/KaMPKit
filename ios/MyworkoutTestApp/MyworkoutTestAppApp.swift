//
//  MyworkoutTestAppApp.swift
//  MyworkoutTestApp
//
//  Created by Even André Fiskvik on 21/04/2021.
//  Copyright © 2021 Touchlab. All rights reserved.
//

import SwiftUI
import shared

@main
struct MyworkoutTestAppApp: App {

    var body: some Scene {
        WindowGroup {
            ContentView(viewModel: BreedViewModel())
        }
    }

    init() {
        startKoin()
    }
}
