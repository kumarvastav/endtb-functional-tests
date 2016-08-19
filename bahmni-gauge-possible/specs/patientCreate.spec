Create Possible Patient Scenarios
=================================
Created by dharmens on 8/9/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Create Pateint, Verify
-------------------------

Tags: regression, sanity

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify Login Page
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|idNumber|firstName|gender|dateOfBirth|age|ward|municipality|district|country|caste|
    |BAH|12345|Super|Female|20/01/2011|50|Address1-187204|Darna|Achham|Nepal|2 - Janajati|

* Logout the user