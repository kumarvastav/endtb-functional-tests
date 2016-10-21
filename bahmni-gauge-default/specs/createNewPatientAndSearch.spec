Create and Search Patient Scenarios
===================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Create new Patient and validate the details
---------------------------------------------------

* Create a new patient
* Validate that the patient edit page is opened for previously created patient
* Logout the user

Stop Visit
--------

* On the login page
* Login to the application
* Click on registration app
* Search patient with prefix "GAN" identifier "1235068"
* Enter Visit Details Page
* Close visit

@Smoke
Regular Search and validate the details
-------------------------------

* On the login page
* Login to the application
* Click on registration app
* Click on search patient link
* Search patient with prefix "GAN" identifier "200"
* Validate that the search results are displayed
* Logout the user

Naviage to medication
---------------------

* On the login page
* Login to the application
* Click on clinical app
* Select patient "GAN200061" in tab "Active"
* Navigate to consultation
* Go to "Medication" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|startDate|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|mg|Immediately|Oral|08/08/2016|Take if Needed|2| Day(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|08/08/2016|Take if Needed|2| Day(s)|
* Save the consultation

Multiple Open Visits
---------------
Tags: regression, sanity
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
* Navigate to dashboard
* Logout the user
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on clinical app
* Verify previous patient is not listed on patient listing page under tab "Active"
* Navigate to dashboard
* Click on clinical app
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

Closing visit for an admitted patient displays error message
------------------------------
Tags: regression, sanity

* On the login page
* Login to the application
* Create the following patient using api
     |prefix|firstName|lastName|gender|dateOfBirth|district|
     |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Select "Admit Patient" from Patient Movement and click "Admit" button
* Navigate to dashboard
* Click on registration app
* Search previously created patient with exact identifier
* Enter Visit Details for Admitted Patient
* Try close visit
* Verify Error popup with message "Admitted patient's visit cannot be closed. Discharge the patient and try again" is displayed
* Navigate to dashboard
* Logout the user