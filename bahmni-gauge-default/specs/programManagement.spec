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
* End previously mentioned program by setting outcome to "Treatment Outcome, Cured"
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

Program Management Workflows - Display controls based on programs filter
-----------------------------------------
Tags: regression, sanity

* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|
* Enroll patient to the program
    |name|dateOfRegistration|patientStatus|treatmentDate|programStatus|
    |TB Program|21/09/2016|Stage 1|23/09/2016|Initial Treatment Phase|
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|OPD|
* On the login page
* Login to the application
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



[EOC] Verify Patient Summary based on Program Filter
---------------------------

Tags: regression, sanity

* Enroll patient to program through API
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|OPD|
* On the login page
* Login to the application
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Go to "Observations" tab
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |72/min|123mm Hg|82mm Hg|Sitting|98.6F|18/min|99%|
* Go to "Bacteriology" tab
* Add following bacteriology samples
    |dateOfSampleCollection|typeOfSample|identifier|note|smearResult|labIdNumber|otherSymptom|aFBDate|aFBTime|xpertTestDate|xpertTestId|xpertResult|
    |11-01-2016|Blood|12345|Sample collected Note 1|Negative|4321|Yes|11-02-2016|12:12PM|11-03-2016|34567|ACD - Active Case Detection|
    |11-04-2016|Blood|67890|Sample collected Note 2|Negative|9876|No|11-05-2016|12:12PM|11-06-2016|76543|ACD - Active Case Detection|
* Save the consultation
* Navigate to patient dashboard

* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)<NOW[dd MMM yy]>|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)<NOW[dd MMM yy]>|
* Verify data on Obs display control
* Expand all sections from display control with Caption "Bacteriology Results"
* Verify display control "Bacteriology-Results" on dashboard, has the following details
    |details|
    |Blood : 12345|
    |Smear resultNegative|
    |Smear test lab ID number4321|
    |Diagnosed with other SymptomYes|
    |Date of AFB smear02 Nov 16|
    |Date of Xpert test done03 Nov 16|
    |Xpert test ID number34567|
    |Xpert MTB resultACD - Active Case Detection|
    |Blood : 67890|
    |Smear resultNegative|
    |Smear test lab ID number9876|
    |Diagnosed with other SymptomNo|
    |Date of AFB smear05 Nov 16|
    |Date of Xpert test done06 Nov 16|
    |Xpert test ID number76543|
    |Xpert MTB resultACD - Active Case Detection|
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |name|dateOfRegistration|
    |HIV Program|21/09/2016|
* Navigate to "HIV Program" program dashboard
* Navigate to adt dashboard link
* Click on "Patient Summary" dashboard
* Verify following value in display controls
    |displayControl|values|
    |Treatments|No Drugs to show for this patient|
    |Bacteriology-Results|No data captured|
    |History-and-Examinations|No History and Examinations for this patient|
