Create EndTB Patient Scenarios
===============================


CREATE PATIENT AND VERIFY
-------------------------

Tags: regression, sanity

* On the login page
* Login to the application
* Verify Login Page
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|firstName|lastName|gender|dateOfBirth|district|nationalIdentificationNumber|
    |EMR|Super|Woman|Female|20/01/2011|Bilaspur|13892|

* Logout the user


VALIDATE PATIENT CREATE FAILS WITH SAME ID
------------------------------------------

Tags: regression, sanity

* On the login page
* Login to the application
* Verify Login Page
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|idNumber|firstName|lastName|gender|dateOfBirth|district|nationalIdentificationNumber|
    |EMR|211|John|Smith|Male|20/01/2011|Bilaspur|13892|
    
* Click on create new patient link
* Create the following patient

    |prefix|idNumber|firstName|lastName|gender|dateOfBirth|district|nationalIdentificationNumber|
    |EMR|211|John|Smith|Male|20/01/2011|Bilaspur|13892|
* Verify the patient creation fails
* Logout the user

SEARCH PATIENT WITH FILTERS
---------------------------

Tags: regression, sanity

* Create random patient through API
* On the login page
* Login with username "BAHMNI_GAUGE_MSF_USER" and password "BAHMNI_GAUGE_MSF_PASSWORD"
* Verify Login Page
* Click on registration app
* Click on search patient link
* Search previously created patient with exact identifier
* Ensure that the patient edit page is opened for previously created patient
* Click on search patient link
* Search previously created patient with name
* Select the patient from the search results
* Ensure that the patient edit page is opened for previously created patient
* Logout the user

