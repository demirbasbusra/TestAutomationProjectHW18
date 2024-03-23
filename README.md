## About this project

Api tests were carried out with the RestAssured framework. You can access detailed information at https://rest-assured.io/.

## Api Test Requirement

If you want to view reports after testing, you need to install Allure Reports.

You can find the necessary information for this at https://docs.qameta.io/allure-report/#_installing_a_commandline


## Test Execution

```
 mvn clean test -Dtest=BookingTest      
```

After the tests are finished, you can access the Test report by using the command below.

```
 allure serve target/allure-results
```
