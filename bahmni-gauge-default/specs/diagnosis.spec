Diagnosis
===========

Add coded and non coded dignosis for existing patient
--------------------------------------------

Tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
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


[Diagnosis] Edit and delete coded diagnosis for existing patient and verify the display controls
-------------------------------------------------
Tags: regression

* Create a new patient and open visit through API
* Add diagnosis through API
    |type|diagnosis|order|certainty|status|
    |coded|Anemia, pernicious|Primary|CONFIRMED|Active|
    |coded|Pyloric stenosis|SECONDARY|Presumed|Inactive|
    |noncoded|High Blood Pressure|Primary|Confirmed|Active|

* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Diagnosis" tab
* Verify diagnoses on current display control on diagnosis page
* Edit the following diagnosis
    |type|diagnosis|order|certainty|status|
    |coded|Anemia, pernicious|SECONDARY|CONFIRMED|Active|
* Save the consultation
* Delete the following diagnoses
    |diagnosis|
    |High Blood Pressure|
* Save the consultation
* Verify diagnoses on current display control on diagnosis page
* Navigate to patient dashboard
* Verify display control "Diagnosis" on dashboard, has the following details
    |details|
    |Anemia, pernicious CONFIRMED SECONDARY|
    |Pyloric stenosis PRESUMED SECONDARY Inactive|
* Open the current visit
* Verify display control with Caption "Diagnoses" on visit page, has the following details
    |details|
    |Anemia, pernicious CONFIRMED SECONDARY|
    |Pyloric stenosis PRESUMED SECONDARY Inactive|
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "All"
* Verify display control with Caption "Diagnosis" on inpatient dashboard, has the following details
    |details|
    |Anemia, pernicious CONFIRMED SECONDARY|
    |Pyloric stenosis PRESUMED SECONDARY Inactive|
* Navigate to dashboard
* Logout the user
