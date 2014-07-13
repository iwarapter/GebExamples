package pages

import geb.*

class LoginPage extends Page {
    static url = 'login.html'
    static at = { title == "Login Page" }
    static content = {
    	header { $(".page-header") }
		username { $('input[name=user\\.forename]') }
		password { $('input[name=user\\.password]') }
		loginButton(to: CheckLoginPage) { $("input", value: "Submit") }
	}
}