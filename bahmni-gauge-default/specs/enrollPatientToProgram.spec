Program Enrollemnt, Editing of Program Attributes and End the Program
=====================================================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


Create Patient and Enrollment of Patient to Program
---------------------------------------------------

Tags: regression, sanity

* On the login page
* Login to the application
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|Test|Patient|Male|20/01/2011|50|Bilaspur|khanapur|

* Navigate to dashboard
* Logout the user
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |TB Register|Date Of Registration|Registration Number|Registration Facility|
    |Basic management unit TB register|01/01/2015|ABC|Facility1, City1, Country1|
* Ensure that the patient is registered to mentioned program


Editing of Program Attributes
-----------------------------

Tags: regression, sanity

* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
//* Edit attribute to registration "DEF" and facility "Facility1, City1, Country1"
//* Ensure that the patient is registered to mentioned program


End the Program Enrolled for Patient
------------------------------------

Tags: regression, sanity

* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* End the program "TB Program"
* Ensure that the patient is registered to mentioned program


Program Management Workflows - Create & Add Patient to a Program
----------------------------------------------------------------

Tags: regression, sanity

* On the login page
* Login to the application
* Create the following patient using api
     |prefix|firstName|lastName|gender|dateOfBirth|district|
     |EMR|Hanah|Jones|F|20/01/2011|Bilaspur|
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |name|dateOfRegistration|registrationNumber|registrationFacility|
    |TB Program|21/09/2016|ABC|Facility1, City1, Country1|
* Ensure that the patient is registered to mentioned program
* Navigate to "TB Program" program dashboard
* Verify details on dashboard "Programs" display control
* Navigate to dashboard
* Logout the user


Program Management Workflows - Delete the patient from an active Program
------------------------------------------------------------------------

Tags: regression, sanity

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
