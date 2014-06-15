import geb.*

class LoginPage extends Page {
    static url = new File('src/functional/resources/html/login.html').toURI()
    static at = { title == "Login Page" }
    static content = {
    	header { $(".page-header") }
		username { $('input[name=user\\.forename]') }
		password { $('input[name=user\\.password]') }
		loginButton(to: CheckLoginPage) { $("input", value: "Submit") }
	}
}