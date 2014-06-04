import spock.lang.*
import geb.*
import geb.spock.*

class LoginSpec extends GebReportingSpec {

    def "Check the login page loads"() {
        when: "we are at the login page"
        to LoginPage

        then: "the page has loaded"
        at LoginPage

        when: "we add our user details"
        username = 'user1'
        password = 'password1'
        
        and:
        loginButton.click()

        then: "We are taken to the correct page"
        at CheckLoginPage
    }

}