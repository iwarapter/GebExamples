import geb.*

class CheckLoginPage extends Page {
    static url = new File('src/test/resources/html/checkLogin.html').toURI()
    static at = { title == "Login Page" }
}