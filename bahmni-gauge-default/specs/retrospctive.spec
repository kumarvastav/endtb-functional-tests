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

