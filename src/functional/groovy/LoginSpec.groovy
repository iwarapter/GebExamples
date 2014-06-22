import spock.lang.*
import geb.*
import geb.spock.*

class LoginSpec extends GebReportingSpec {

    def "Check the login page loads"() {
        when: "we are at the login page"
        to LoginPage

        then: "the page has loaded"
        waitFor { at LoginPage }

        when: "we add our user details"
        username = 'user1'
        password = 'password1'
        
        and:
        loginButton.click()

        then: "We are taken to the correct page"
        at CheckLoginPage
    }

    @Unroll
    def "Try login with #user"(){
        when: "we are at the login page"
        to LoginPage

        then: "the page has loaded"
        waitFor { at LoginPage }

        when: "we add our user details"
        username = user
        password = pass

        and:
        loginButton.click()

        then: "We are taken to the correct page"
        at CheckLoginPage

        where:
        user    | pass
        'user1' | 'password1'
        'user2' | 'password2'
    }
}