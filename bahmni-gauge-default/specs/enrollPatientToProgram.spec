Program Management Workflows
============================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
Program Management Workflows - Create & Add Patient to a Program
----------------
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

Program Management Workflows - Delete the patient from an active Program
--------------------------------------
* On the login page
* Login to the application
* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|
    |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Enroll patient to the program
    |name|dateOfRegistration|patientStatus|treatmentDate|programStatus|
    |TB Program|21/09/2016|Stage 1|23/09/2016|Initial Treatment Phase|
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Ensure that the patient is registered to mentioned program
* Unenroll patient from "TB Program" program
* Navigate to dashboard
* Logout the user

Program Management Workflows - Edit
-----------------------------------
* Create the following patient using api
     |prefix|firstName|lastName|gender|dateOfBirth|district|
     |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Enroll patient to the program
    |name|dateOfRegistration|treatmentDate|patientStatus|programStatus|
    |TB Program|01/01/2015|06/06/2015|Stage 1|Sputum Positive|
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

Program Managmnt Workflows - Stop
---------------------------------
* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|
    |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Enroll patient to the program
    |name|dateOfRegistration|treatmentDate|patientStatus|programStatus|
    |TB Program|01/01/2015|06/06/2015|Stage 1|Sputum Positive|
* On the login page
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* End previously mentioned program
* Ensure that the mentioned program is stopped
* Navigate to dashboard
* Logout the user

Display controls based on programs filter
-----------------------------------------
* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|
* Enroll patient to the program
    |name|dateOfRegistration|patientStatus|treatmentDate|programStatus|
    |TB Program|21/09/2016|Stage 1|23/09/2016|Initial Treatment Phase|
* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Navigate to previous program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |71|111|77|Sitting|99|17|99|
* Navigate back to program dashboard
* Verify data on Obs display control
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |name|dateOfRegistration|
    |HIV Program|21/09/2016|
* Navigate to "HIV Program" program dashboard
* Verify Vitals display control is empty
