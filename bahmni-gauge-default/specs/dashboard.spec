Multiple Dashboard Scenarios
=====================
Created by atmaramn on 17/11/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Verify display of patient profile on ADT, dashboard & Visit page
--------------------------
Tags: regression, sanity

* Create the following patient using api
    |prefix|firstName|lastName|gender|age|district|village|
    |GAN|Ram|Singh|M|12/12/1963|Bilaspur|Khanapur|
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|OPD|
* Enter visit details through API
    |height|weight|registrationFee|
    |170|70|15|
* Admit the patient through api
* Discharge the patient through api
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Open "Trends" tab on patient dashboard page
* Verify "Trends" is open
* Verify patient details on patient dashboard
* Open "General" tab on patient dashboard page
* Verify "General" is open
* Open the current visit
* Open "Discharge Summary" tab on visit page
* Verify "Discharge Summary" is open
* Verify patient details on patient dashboard
* Verify display control with Caption "Advice on Discharge" on visit page, has the following details
    |advice|
    |No Advice on Discharge for this patient|
* Navigate to dashboard
* Click on "InPatient" app
* Select existing patient from patient listing page under tab "All"
* Verify patient details on patient dashboard

