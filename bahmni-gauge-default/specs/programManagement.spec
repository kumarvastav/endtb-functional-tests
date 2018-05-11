Program Enrollemnt, Editing of Program Attributes and End the Program
=====================================================================

Enrol the Patient to a Program and verify display controls
----------------------------------------------------------
Tags: needs_fix
* On the login page
* Login to the application
* Create the following patient using api
     |prefix|firstName|lastName|gender|dateOfBirth|district|
     |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |name|dateOfRegistration|
    |TB Program|21/09/2016|
* Ensure that the patient is registered to mentioned program
* Navigate to "TB Program" program dashboard
* Verify details on dashboard "Programs" display control
* Navigate to dashboard
* Logout the user


Delete the patient from an active Program
-----------------------------------------
Tags: needs_fix
* Enroll patient to program through API
* On the login page
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Ensure that the patient is registered to mentioned program
* Delete existing program for the patient
* Navigate to dashboard
* Logout the user

Edit the program and verify details
-----------------------------------
Tags: needs_fix
* Enroll patient to program through API
* On the login page
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Edit created Program with following details
    |name|dateOfRegistration|treatmentDate|patientStatus|programStatus|
    |TB Program|01/02/2015|06/07/2015|Stage 2|Sputum Positive|
* Ensure that the program is updated
* Navigate to previous program dashboard
* Ensure that the program is updated on patient program dashboard
* Navigate to dashboard
* Logout the user

Stop an existing program and verify details
-------------------------------------------
Tags: needs_fix
* Enroll patient to program through API
* On the login page
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* End previously mentioned program by setting outcome to "Treatment Outcome, Cured"
* Ensure that the mentioned program is stopped
* Navigate to dashboard
* Logout the user