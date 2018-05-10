Multiple Visit
===============

Verify observations captured in different visits
------------------------------------------------
Tags: needs_fix
* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|
* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Enter Visit Details Page
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Observations" tab
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |71|111|77|Sitting|99|17|99|
* Save the consultation
* Navigate to dashboard
* Logout the user
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on clinical app
* Verify previous patient is not listed on patient listing page under tab "Active"
* Select existing patient from patient listing page under tab "All"
* Verify Consultation button is not present
* Navigate to dashboard
* Click on registration app
* Search previously created patient with exact identifier
* Enter Visit Details Page
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Verify "2" Active visits for patient
* Navigate to dashboard
* Logout the user