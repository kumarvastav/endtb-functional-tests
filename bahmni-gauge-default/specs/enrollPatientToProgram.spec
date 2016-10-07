Program Enrollemnt, Editing of Program Attributes and End the Program
=====================================================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
Program Management Workflows - Create & Add Patient to a Program
----------------
Tags: regression, sanity
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
Tags: regression, sanity
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
Tags: regression, sanity
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


Program Management Workflows - Verify Observation Templates based on program Filter
------------------------------------------------------------------
Tags: regression, sanity

* On the login page
* Login to the application
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|Test|Patient|Male|20/01/2011|50|Bilaspur|khanapur|
* Enroll patient to the program
    |name|dateOfRegistration|treatmentDate|patientStatus|programStatus|
    |TB Program|01/01/2015|06/06/2015|Stage 1|Sputum Positive|
* Start a visit "OPD"
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Navigate to "TB Program" program dashboard
* Navigate to consultation
*Select the template "Obstetrics" from on the observation page
* Enter values in "Obstetrics" template
    |Fundal Height (Weeks)|P/A Presenting Part|FHS|Amount of Liquor|
    |10|Breech|Absent|10|
*Save the consultation
* Navigate to dashboard link
*Verify display control "Obstetrics" on dashboard, has the following details
    |details|
    |Obstetrics|
    |P/A (PER ABDOMEN)Fundal|
    |Height (Weeks)10|
    |P/A Presenting PartBreech|
    |FHSAbsent|
    |Amount of Liquor|
    |10|
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
        |name|dateOfRegistration|
        |HIV Program|21/09/2016|
* Navigate to "HIV Program" program dashboard
* Navigate to consultation
* Verify the "Obstetrics" concept set is "not displayed"
* Navigate to dashboard
* Logout the user

Display controls based on programs filter
-----------------------------------------
Tags: regression, sanity

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
* Navigate to dashboard
* Logout the user

Order Set - Add
---------------
Tags: regression, sanity
* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* Click on create new button on orderset dashboard
* Create orderset and enter following orderset details
    |name|description|operator|
    |Orderset|Test orderset|ALL|
* Enter following orderset members
    |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
    |Drug Order|Paracetamol|Paracetamol 60ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
    |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
    |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
* Save the orderset
* Click on back button on orderset page
* Verify orderset created
* Click on previous orderset
* Verify previous orderset
* Navigate to dashboard
* Logout the user

Order Set - Edit
----------------
Tags: regression, sanity
* Create orderset "Orderset", description "Test Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Paracetamol|Paracetamol 60ml|3|Tablet(s)|Twice a day|After meals|1|Day(s)|Oral|Dont skip this medicine|
        |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
        |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
        
* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* Click on previous orderset
* Edit previous orderset as "Edited", description "Edited test orderset", operator "ANY" with following details
      |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
      |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
      |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
      |Drug Order|Paracetamol|Paracetamol 60ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
* Save the orderset
* Click on back button on orderset page
* Verify orderset created
* Click on previous orderset
* Verify previous orderset
* Navigate to dashboard
* Logout the user

Order Set - Delete
------------------
Tags: regression, sanity

* Create orderset "Orderset", description "Test Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Paracetamol|Paracetamol 60ml|3|Tablet(s)|Twice a day|After meals|1|Day(s)|Oral|Dont skip this medicine|
        |Lab Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
        
* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* delete previous orderset
* verify previous orderset deleted
* Navigate to dashboard
* Logout the user