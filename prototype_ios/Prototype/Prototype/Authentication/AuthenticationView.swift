//
//  AuthenticationView.swift
//  Prototype
//
//  Created by Alex Severyanov on 6/21/21.
//

import SwiftUI

struct AuthenticationView: View {

    @ObservedObject var viewModel: AuthenticationViewModel = .init()

    var body: some View {
        VStack(alignment: .center, spacing: 20) {
            VStack {
                Text("Enter login information:")
                TextField("Account", text: $viewModel.email)
                    .textFieldStyle(RoundedBorderTextFieldStyle())
                    .padding()
                SecureField("Pasword", text: $viewModel.password)
                    .textFieldStyle(RoundedBorderTextFieldStyle())
                    .padding()
            }.padding(20)

            switch viewModel.state {
            case .initial:
                EmptyView()
            case .loading:
                ProgressView()
            case .error(let string):
                Text(string)
                    .foregroundColor(Color.red)
            case .success:
                Text("Success!")
                    .foregroundColor(Color.green)
            }

            Button("Login") { viewModel.login() }

        }
    }
}

struct AuthenticationView_Previews: PreviewProvider {
    static var previews: some View {
        AuthenticationView()
    }
}
