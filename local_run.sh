export IS_LOCAL=TRUE
export BROWSER=Firefox
mvn clean verify -Dcucumber.options="--tags @Smoke"