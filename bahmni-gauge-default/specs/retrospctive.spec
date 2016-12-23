[Retrospective] Existing patient retrospective data
=====================
Created by prabhashs on 08/12/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Verify retrospective entry of data
----------------
Tags: regression, sanity

* Create a new patient and open visit through API
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "All"
* Set retrospective date to "01/03/2015"
* Navigate to consultation
* Fill "History and Examination" template with following observation details
    |Chief Complaint|for|Chief Complaint Notes|History Notes|Examination Notes|Smoking History|
    |Fever: :Accept|0|Body Pain|repeat|repeat|No|
* Fill "Vitals" template with following observation details
    |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
    |71|111|77|Sitting|99|17|99|
* Select the template "Gynaecology" from on the observation page
* Fill "Gynaecology" template with following observation details
    |P/S (Per Speculum) - Cervix|
    |Normal:VIA -ve|
* Navigate to patient dashboard
* Navigate to latest visit page
* Verify display control with Caption "Observations" on visit page, has the following details
    |details|
    |Chief ComplaintFever|
    |Chief Complaint NotesBody Pain|
    |History Notesrepeat|
    |Examination Notesrepeat|
    |Smoking HistoryNo|
    |Pulse (72 - 72)71/min|
    |Systolic (110 - 140)111mm Hg|
    |Diastolic (70 - 85)77mm Hg|
    |PostureSitting|
    |Temperature (98.6 - 98.6)99F|
    |RR (16 - 20)17/min|
    |SPO2 (> 97)99%|
    |Normal|


Existing patient retrospective data >>Verify retrospective entry of data
-----------------------------------------------------------------------
Tags: regression, sanity

* Create a new patient through API
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_ANOTHER_LOCATION"
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Set retrospective date to "01/03/2015"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
    |Isoniazid (H)|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
* Save the consultation
* Verify display control "Recent" on medications tab, has the following details
    |details|
    |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|
    |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|

* Verify display control "retrospective visit" on medications tab, has the following details
    |details|
    |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|
    |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|

* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)|
    |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|

* click  "Treatments" on dashboard, and verify displayed dialog has the following details
    |details|
    |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)|
    |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
* Navigate to latest visit page
* Verify display control "treatment" on visit page, has the following details
     |details|
     |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)|
     |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|

* Navigate to dashboard
* Logout the user


Add/delete coded and non coded retrospective dignosis for existing patient
-----------------------------------------------------------------------
Tags: regression, sanity

* Create a new patient and open visit through API
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Set retrospective date to "01/03/2015"
* Navigate to consultation
* Go to "Diagnosis" tab
* Add following diagnosis
    |type|diagnosis|order|certainty|status|
    |noncoded|High Blood Pressure|Primary|Confirmed|Active|
    |coded|Pyloric stenosis|Secondary|PRESUMED|Inactive|
* Save the consultation
* Verify past diagnoses on current display control on diagnosis page
* Navigate to patient dashboard
* Verify display control "Diagnosis" on dashboard, has the following details
    |details|
    |High Blood Pressure CONFIRMED PRIMARY|
    |Pyloric stenosis PRESUMED SECONDARY|
 * open the visit for date "01 Mar 15"
 * Verify display control with Caption "Diagnoses" on visit page, has the following details
     |details|
     |High Blood Pressure CONFIRMED PRIMARY|
     |Pyloric stenosis PRESUMED SECONDARY|
* Navigate to patient dashboard
* Set retrospective date to "current Date"
* Navigate to consultation
* Go to "Diagnosis" tab
* Verify past diagnoses on current display control on diagnosis page
* Navigate to patient dashboard
* open the visit for date "01 Mar 15"
* Verify display control with Caption "Diagnoses" on visit page, has the following details
    |details|
    |High Blood Pressure CONFIRMED PRIMARY|
    |Pyloric stenosis PRESUMED SECONDARY|

