import geb.*

class CheckLoginPage extends Page {
    static url = new File('src/functional/resources/html/checkLogin.html').toURI()
    static at = { title == "Login Page" }
}