//
//  AuthenticationViewModel.swift
//  Prototype
//
//  Created by Alex Severyanov on 6/21/21.
//

import Foundation
import Combine
import shared

class AuthenticationViewModel: ObservableObject {

    enum State {
        case loading
        case error(String)
        case success
        case initial
    }

    @Published var email: String = ""
    @Published var password: String = ""
    @Published var state: State = .initial

    @Inject var useCase: LoginUseCase

    private var disposeBag: [AnyCancellable] = []

    func login() {
        state = .loading
        disposeBag.append(
            useCase.invoke(.init(userName: email, password: password)).sink { [weak self] completion in
                if case .failure(let error) = completion {
                    self?.state = .error(error.localizedDescription)
                }
            } receiveValue: { [weak self] value in
                if value {
                    self?.state = .success
                } else {
                    self?.state = .error("Invalid data!")
                }
            })
    }
}
