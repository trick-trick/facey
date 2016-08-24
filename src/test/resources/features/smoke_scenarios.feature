@Smoke
Feature: RE/MAX Smoke tests

  Scenario: Start driver
    Given start driver

  Scenario: 01. Verify Home page elements
    Given go to url 'http://stgweb.facey.top/'
    Then base elements of Home page are presented


  Scenario: Close driver
    Given close driver

