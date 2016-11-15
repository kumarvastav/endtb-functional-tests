Observation
=====================
Created by prabhashs on 11/15/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Consultation - Enter and verify data entered on Observation templates
----------------
Tags: regression, sanity

* Create a new patient and add diagnosis through API
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Fill "History and Examination" template with following observation details
    |Chief Complaint|for|Chief Complaint Notes|History Notes|Examination Notes|Smoking History|
    |Headache: :Accept|0|pain|repeat|repeat|No|
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |71|111|77|Sitting|99|17|99|




//* Create the following patient using api
//      |prefix|firstName|lastName|gender|dateOfBirth|district|
//      |GAN|Ram|Singh|M|20/01/2011|Bilaspur|
//* Login to the application
//* Click on clinical app
//* Select existing patient from patient listing page under tab "Active"
//*
