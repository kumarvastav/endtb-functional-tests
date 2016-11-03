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

Create a new patient with Auto generated id, fetch & validate patient details
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
//* Enter visit details from table
//    |height|weight|fees|comments|
//    |10.11|10.55|100|bmi observations seems normal|
//* Verify the details on "bmi" display control
//    |details|
//    |HEIGHT10.11WEIGHT10.55BMI1032.17BMI STATUSVery Severely Obese|
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
