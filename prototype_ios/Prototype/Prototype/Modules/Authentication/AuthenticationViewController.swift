//
//  AuthenticationViewController.swift
//  Prototype
//
//  Created by Alex Severyanov on 6/17/21.
//

import UIKit

class AuthenticationViewController: UIViewController, AuthenticationView {

    @IBOutlet var emailField: UITextField!
    @IBOutlet var passwordField: UITextField!
    @IBOutlet var activityIndicator: UIActivityIndicatorView!
    @IBOutlet var statusLabel: UILabel!

    var presenter: AuthenticationPresenter!

    override func viewDidLoad() {
        super.viewDidLoad()
        AuthenticationFactory.attach(to: self)
        
        statusLabel.alpha = 0
    }

    @IBAction func loginAction(_ sender: Any?) {
        statusLabel.alpha = 0
        activityIndicator.startAnimating()
        presenter.performLogin(email: emailField.text ?? "", password: passwordField.text ?? "")
    }

    func showSuccess() {
        activityIndicator.stopAnimating()
        UIView.animate(withDuration: 0.2) { self.statusLabel.alpha = 1 }

        statusLabel.text = "Success!"
        statusLabel.textColor = .green
    }

    func show(error: String) {
        activityIndicator.stopAnimating()
        UIView.animate(withDuration: 0.2) { self.statusLabel.alpha = 1 }

        statusLabel.text = error
        statusLabel.textColor = .red
    }
}
