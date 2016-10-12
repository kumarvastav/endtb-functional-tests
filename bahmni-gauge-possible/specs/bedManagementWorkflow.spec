Bed Management Workflow
=======================
Tags: bedManagementWorkflow

Admit and verify on adt dashboard and clinical dashboard
--------------------------------------------------------
Tags: regression, sanity

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify Login Page
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|firstName|gender|dateOfBirth|age|ward|municipality|district|country|caste|
    |BAH|inpatient|Female|20/01/2011|50|Address1-187204|Darna|Achham|Nepal|2 - Janajati|
* Start a visit "General"
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Go to "Disposition" tab
* Select "Admit Patient" disposition
* Save the consultation
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "To Admit"
* Select "Admit Patient" from Patient Movement and click "Admit" button
* Assign an empty bed
* Navigate to Inpatient Dashboard
* Ensure inpatient icon exists on Patient Profile display control
* Verify display control "admissionDetails" on inpatient dashboard, has the following details
    |details|
    |-------|
    |Admission Date<NOW[dd MMM yy]>|
* Verify display control "disposition" on inpatient dashboard, has the following details
    |details|
    |-------|
    |Admit Patient<NOW[dd MMM yy]>|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Ensure inpatient icon exists on Patient Profile display control
* Navigate to dashboard
* Logout the user
