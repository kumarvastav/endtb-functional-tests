Registration
=====================
Created by nityadas on 20/10/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
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

Create a new patient with Auto generated id and photo, fetch & validate patient details
------------------------------

Tags: regression, sanity

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|photo|
    |GAN|DevKumar|Karia|Male|20/01/2011|50|Bilaspur|Kahnapur|true|

* Click on search patient link
* Search previously created patient with name
* Verify previous patient is listed in search result
* Click on previous patient link from search results
* Verify patient details
* Navigate to dashboard
* Logout the user

Create a new patient with Manual id and photo, fetch & validate patient details
------------------------------

Tags: regression, sanity

* Create a new patient through API
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Click on create new patient link
* Try creating patient with same identifier
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|
    |GAN|DevKumar|Karia|Male|20/01/2011|50|Bilaspur|

* Verify Identifier Error popup with message "'Patient#null' failed to validate with reason: Identifier %s already in use by another patient" is displayed
* Navigate to dashboard
* Logout the user

Update patient, Search by name, fetch & validate patient details
------------------------------

Tags: regression, sanity

* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|village|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|Khanapur|

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Search previously created patient with exact identifier
* Edit previous patient details as follow
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|DevKumar|Karia|Male|20/01/2011|50|Dispur|kamalganj|
* Navigate to dashboard
* Click on registration app
* Click on search patient link
* Search previously created patient with name
* Verify previous patient is listed in search result
* Click on previous patient link from search results
* Verify patient details
* Navigate to dashboard
* Logout the user

Update patient, Search by gramp panchayat, fetch & validate patient details
------------------------------

Tags: regression, sanity

* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|gramPanchayat|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|Narnia|

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Click on registration app
* Search previously created patient with exact identifier
* Edit previous patient details as follow
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|gramPanchayat|
    |GAN|DevKumar|Karia|Male|20/01/2011|50|Dispur|Brindavan|
* Navigate to dashboard
* Click on registration app
* Click on search patient link
* Search previously created patient with gram panchayat
* Verify previous patient is listed in search result
* Click on previous patient link from search results
* Verify patient details
* Navigate to dashboard
* Logout the user

Discharge an admitted patient and verifications
----------------
Tags: regression, sanity
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
* Navigate to inpatient search page
* Select existing patient from patient listing page under tab "Admitted"
* Select "Discharge Patient" from Patient Movement and click "Discharge" button
* Select existing patient from patient listing page under tab "All"
* Ensure inpatient icon does not exist on Patient Profile display control 
* Verify only "Undo Discharge" option is displayed in Patient Movement 
* Navigate to dashboard
* Logout the user


 Admit patient through API, discharge and close visit 
------------------------------------------
Tags: regression, sanity
* Create and admit a patient through API
* On the login page 
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION" 
* Click on inpatient app 
* Select existing patient from patient listing page under tab "Admitted" 
* Select "Discharge Patient" from Patient Movement and click "Discharge" button 
* Navigate to dashboard  
* Click on registration app 
* Search previously created patient with exact identifier
* Enter Visit Details for Admitted Patient
* Close visit 
* Search previously created patient with exact identifier  
* Verify "Start OPD visit" button is "displayed"
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Verify only "Admit Patient" option is displayed in Patient Movement 
* Navigate to dashboard 
* Logout the user


Verify BMI display control verification
-------------------------
Tags: regression, sanity
* Create a new patient through API
* On the login page 
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Enter visit details from table
    |height|weight|fees|comments|
    |50|5|100|bmi observations seems normal|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT50|
    |WEIGHT5|
    |BMI20|
    |BMI STATUSNormal|
* Enter visit details from table
    |height|weight|fees|comments|
    |10.11|10.55|100|bmi observations seems normal|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT10.11WEIGHT10.55BMI1032.17BMI STATUSVery Severely Obese|
* Enter visit details from table
    |height|weight|fees|
    |50|1|100|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT50|
    |WEIGHT1|
    |BMI4|
    |BMI STATUSVery Severely Underweight|
* Enter visit details from table
    |height|weight|fees|
    |10|5|100|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT10|
    |WEIGHT5|
    |BMI500|
    |BMI STATUSVery Severely Obese|


Admit Patient with closed visit and verify display controls
----------------
* Create a new patient through API
* On the login page 
* Login to the application
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Select "Admit Patient" from Patient Movement and click "Admit" button
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details|
    |Total Beds: 9 |
    |Available Beds: 7|
* Assign an empty bed
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details|
    |Total Beds: 9 |
    |Available Beds: 6|
* Navigate to Inpatient Dashboard
* Verify display control "admissionDetails" on inpatient dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
* Click on "Patient Visit Page" link
* Verify display control "admissionDetails" on inpatient dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
* Navigate to dashboard link
* Verify display control "Admission-Details" on dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|

