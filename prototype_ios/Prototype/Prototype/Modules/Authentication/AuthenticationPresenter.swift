//
//  AuthenticationPresenter.swift
//  Prototype
//
//  Created by Alex Severyanov on 6/17/21.
//

import Foundation
import shared

protocol AuthenticationView: AnyObject {
    func show(error: String)
    func showSuccess()
}

protocol AuthenticationPresenterProtocol: AnyObject {
    func performLogin(email: String, password: String)
}

class AuthenticationPresenter {

    weak var view: AuthenticationView!
    let useCase: LoginUseCase

    init(useCase: LoginUseCase) {
        self.useCase = useCase
    }

    func performLogin(email: String, password: String) {

        let input = LoginUseCase.LoginUseCaseInput(userName: email, password: password)
        useCase.invoke(t: input) { [weak self] flow, error in
            if let error = error {
                self?.view.show(error: error.localizedDescription)
            } else if let flow = flow {

                flow.collect(collector: Collector<Bool> { [weak self] in
                    if $0 {
                        self?.view.showSuccess()
                    } else {
                        self?.view.show(error: "Incorrect data")
                    }
                }, completionHandler: { _, _ in })
            }
        }
    }
}

class AuthenticationFactory {
    static func attach(to viewController: AuthenticationViewController) {
        let useCase = koin.get(LoginUseCase.self)
        let presenter = AuthenticationPresenter(useCase: useCase)
        viewController.presenter = presenter
        presenter.view = viewController
    }
}
