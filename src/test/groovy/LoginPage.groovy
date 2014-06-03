import geb.*

class LoginPage extends Page {
    static url = new File('src/test/resources/html/login.html').toURI()
    static at = { title == "Login Page" }
    static content = {
    	header { $(".page-header") }

        loginForm { $("form") }

		username { form.username }

		password { form.password }

		loginButton(to: CheckLoginPage) { $("input", value: "Submit") }
	}
}