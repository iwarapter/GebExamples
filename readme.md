Geb Examples
=========

This is a simple repo for me to test Geb with. The build is setup to work with HTMLUnit and Chrome. 

The following commands will launch the tests with the individual browsers:

```sh
gradlew ieTest
gradlew chromeTest
```
To run with all, you can run:

```sh
gradlew functionalTest
```
For specific classes (example with chrome)
```sh
gradlew chromeTest -DchromeTest.single=Smoke*
```