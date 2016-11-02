Specification Heading
=====================
Created by atmaramn on 01/11/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Add coded and non coded dignosis for existing patient
--------------------------------------------
* Create a new patient through API
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|OPD|
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Diagnosis" tab
* Add following diagnosis
    |type|diagnosis|order|certainty|status|
    |noncoded|High Blood Pressure|Primary|Confirmed|Active|
    |coded|Pyloric stenosis|Secondary|PRESUMED|Inactive|
* Save the consultation
* Verify diagnoses on current display control on diagnosis page
* Navigate to patient dashboard
* Verify display control "Diagnosis" on dashboard, has the following details
    |details|
    |High Blood Pressure CONFIRMED PRIMARY|
    |Pyloric stenosis PRESUMED SECONDARY|
* Open the current visit
* Verify display control with Caption "Diagnoses" on visit page, has the following details
    |details|
    |High Blood Pressure CONFIRMED PRIMARY|
    |Pyloric stenosis PRESUMED SECONDARY|
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Verify display control with Caption "Diagnosis" on inpatient dashboard, has the following details
    |details|
    |High Blood Pressure CONFIRMED PRIMARY|
    |Pyloric stenosis PRESUMED SECONDARY|
* Navigate to dashboard
* Logout the user