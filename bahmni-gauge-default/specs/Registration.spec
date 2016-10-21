Registration
=====================
Created by nityadas on 20/10/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
Create a new patient, fetch and update the patient details
------------------------------

Tags: regression, sanity

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|DevKumar|Karia|Male|20/01/2011|50|Bilaspur|Kahnapur|

* Click on search patient link
* Search previously created patient with name
* Verify previous patient is listed in search result
* Click on previous patient link from search results
* Verify patient details
* Navigate to dashboard
* Logout the user

Discharge an admitted patient and verifications
----------------
* Create a new patient through API
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Select "Admit Patient" from Patient Movement and click "Admit" button
* Click on "Continue with current Visit" button
* Navigate to Inpatient Dashboard
* Select existing patient from patient listing page under tab "Admitted"
* Select "Discharge Patient" from Patient Movement and click "Discharge" button
* Select existing patient from patient listing page under tab "All"
* Ensure inpatient icon does not exist on Patient Profile display control 
* Verify only "Undo Discharge" option is displayed in Patient Movement 
* Navigate to dashboard
* Logout the user


