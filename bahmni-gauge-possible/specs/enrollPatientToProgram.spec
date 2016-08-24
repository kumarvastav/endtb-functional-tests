Program Enrollemnt, Editing of Program Attributes and End the Program
=====================================================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


Create Patient and Enrol to a Program
---------------------------------------------------

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Create the following patient using api

    |prefix|firstName|gender|dateOfBirth|age|ward|municipality|district|country|caste|
    |BAH|SuperNew|Female|20/01/2011|50|187|Darna|Achham|Nepal|2 - Janajati|

* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |TB Register|Date Of Registration|Program State|
    |ANC|01/01/2015|ANC program State 1|
* Ensure that the patient is registered to "ANC"

Delete a Program
-----------------------------
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Ensure that the patient is registered to "ANC"
* Unenroll patient from "ANC" program
* Ensure that the patient is not registered to "ANC"

//End the Program Enrolled for Patient
//------------------------------------
//
//* Navigate to dashboard
//* Click on programs app
//* Select existing patient from patient listing page under tab "All"
//* End the program "TB Program"
//* Ensure that the patient is registered to mentioned program