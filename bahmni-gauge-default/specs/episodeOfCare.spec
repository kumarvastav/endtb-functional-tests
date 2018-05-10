Episode of Care
================

Verify Program Specfic data on display controls & Observation Templates
-----------------------------------------------------------------------
Tags: needs_fix
//The Program TB Program doesn't exist

* Enroll patient to program through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* On the login page
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Navigate to "TB" program dashboard
* Navigate to consultation
* Select the template "Obstetrics" from on the observation page
* Fill "Obstetrics" template with following observation details
    |Fundal Height (Weeks)|P/A Presenting Part|FHS|Amount of Liquor|
    |10|Breech|Absent|10|
* Save the consultation
* Navigate to dashboard link
* Verify display control "Obstetrics" on dashboard, has the following details
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
* Verify following value in display controls
      |displayControl|values|
      |Obstetrics|No Obstetrics for this patient|
* Navigate to consultation
* Verify the "Obstetrics" concept set is "not displayed"


Verify data captured through clinical is not present on Program Specific Patient Summary
----------------------------------------------------------------------------------------
Tags: needs_fix

* Enroll patient to program through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |72/min|123mm Hg|82mm Hg|Sitting|98.6F|18/min|99%|
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Go to "Bacteriology" tab
* Add following bacteriology samples
    |dateOfSampleCollection|typeOfSample|identifier|note|smearResult|labIdNumber|otherSymptom|aFBDate|aFBTime|xpertTestDate|xpertTestId|xpertResult|
    |11-01-2016|Blood|12345|Sample collected Note 1|Negative|4321|Yes|11-02-2016|12:12PM|11-03-2016|34567|ACD - Active Case Detection|
    |11-04-2016|Blood|67890|Sample collected Note 2|Negative|9876|No|11-05-2016|12:12PM|11-06-2016|76543|ACD - Active Case Detection|
* Save the consultation
* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Navigate to "TB Program" program dashboard
* Navigate to adt dashboard link
* Click on "Patient Summary" dashboard
* Verify following value in display controls
    |displayControl|values|
    |Treatments|No Drugs to show for this patient|
    |Bacteriology-Results|No data captured|
    |History-and-Examinations|No History and Examinations for this patient|
