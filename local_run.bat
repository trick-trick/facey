set IS_LOCAL=TRUE
set BROWSER=Firefox
mvn clean verify -Dcucumber.options="--tags @Smoke"