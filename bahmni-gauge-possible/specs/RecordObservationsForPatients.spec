Recording Observations
======================
Created by dharmens on 9/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Record Observations for patient
-------------------------------

Tags: regression, sanity, test

//* Enroll patient to the treatment through API
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|firstName|gender|dateOfBirth|age|ward|municipality|district|country|caste|
    |BAH|Automation|Female|20/01/2011|50|187|Darna|Achham|Nepal|2 - Janajati|

* Start a visit "General"
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Fill patient vitals form
    |Systolic|Diastolic|Posture|Temperature|Heart Rate|Respiratory Rate|Oxygen Saturation|Weight|
    |150|85|Sitting|110|75|15|90|140|

* Save the consultation
* Navigate to patient dashboard
* Verify observations recorded under "Patient_Vitals"

