Specification Heading
=====================
Created by manpreetrajpal on 12/24/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     

Login with the user which have only Registration role assigned and register a new user
--------------------------------------------------------------------------------------------

Tags: regression, sanity

* On the login page
* Login with user "regone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available|
    |Registration|true|
    |Programs|false|
    |Clinical|false|
    |ADT|false|
    |Radiology|false|
    |Patient.Document|false|
    |Admin|false|
    |Reports|false|
    |Orders|false|
    |Implementer|false|
    |AtomFeed|false|
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|Maria|Jones|Female|20/01/2011|50|Bilaspur|Kahnapur|
* Start a visit "OPD"
* Enter visit details from table
    |height|weight|fees|comments|
    |50|5|100|bmi observations seems normal|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT50|
    |WEIGHT5|
    |BMI20|
    |BMI STATUSNormal|



Login with the user which have only Clinical role assigned and capture the observation and other details.
-----------------------------------------------------------------------------------------------------------

Tags: regression, sanity

* Create patient and open visit with details through API with details
       |height|weight|registrationFee|
       |172|67|200|
* On the login page
* Login with user "docone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
      |Application~ID(tagName)|Is Available|
      |Registration|false|
      |Programs|true|
      |Clinical|true|
      |ADT|false|
      |Radiology|false|
      |Patient.Document|false|
      |Admin|false|
      |Reports|false|
      |Orders|false|
      |Implementer|false|
      |AtomFeed|false|
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add chief complaint on "History and Examination" template
      |Chief Complaint|
      |Headache|
      |HeartBurn|
      |Injury|
* Fill "Vitals" template with following observation details
      |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
      |71|111|77|Sitting|99|17|99|
* Save the consultation
* Go to "Diagnosis" tab
* Add following diagnosis
      |type|diagnosis|order|certainty|status|
      |noncoded|High Blood Pressure|Primary|Confirmed|Active|
      |coded|Pyloric stenosis|Secondary|PRESUMED|Inactive|
* Save the consultation
* Go to "Orders" tab
* Select following orders
      |type|category|name|
      |Radiology|chest|chest, 1 view (x-ray)|
      |Radiology|chest|chest oblique - bilateral (x-ray)|
      |Radiology|chest|chest lateral|
* Enter notes to following "Radiology" orders
      |order|note|
      |chest, 1 view (x-ray)|Notes 1|
* Save the consultation
* Go to "Medications" tab
* Create drug order
      |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
      |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
      |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |details|
      |History and Examination |
      |Chief Complaint Headache|
      |Chief Complaint HeartBurn|
      |Chief Complaint Injury|
* Verify display control "Vitals" on dashboard, has the following details
      |details|
      |Pulse (72 - 72) 71 /min|
      |Systolic (110 - 140) 111 mm Hg|
      |Diastolic (70 - 85) 77 mm Hg|
      |Posture Sitting|
      |Temperature (98.6 - 98.6) 99 F|
      |RR (16 - 20) 17 /min|
      |SPO2 (> 97) 99 %|
* Verify display control "Diagnosis" on dashboard, has the following details
      |details|
      |High Blood Pressure CONFIRMED PRIMARY|
      |Pyloric stenosis PRESUMED SECONDARY|

* Navigate to consultation
* Go to "Observation" tab
* Remove chief complaint on "History and Examination" template
      |Chief Complaint|
      |Headache|
      |HeartBurn|
* Go to "Diagnosis" tab
* Remove following Diagnosis
  |Diagnosis|
  |Pyloric stenosis|
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |details|
      |History and Examination |
      |Chief Complaint Injury|
* Verify display control "Diagnosis" on dashboard, has the following details
      |details|
      |High Blood Pressure CONFIRMED PRIMARY|



Program-App role should be able to enroll patient to the program and capture observations.
-----------------------------------------------------------------------------------------------------------

Tags: regression, sanity

* Create patient and open visit with details through API with details
       |height|weight|registrationFee|
       |172|67|200|
* On the login page
* Login with user "doctwo" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
      |Application~ID(tagName)|Is Available|
      |Registration|false|
      |Programs|true|
      |Clinical|true|
      |ADT|false|
      |Radiology|false|
      |Patient.Document|false|
      |Admin|false|
      |Reports|false|
      |Orders|false|
      |Implementer|false|
      |AtomFeed|false|
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add chief complaint on "History and Examination" template
      |Chief Complaint|
      |Headache|
      |HeartBurn|
      |Injury|
* Fill "Vitals" template with following observation details
      |Pulse|Systolic|Diastolic|Posture|Temperature|RR|SPO2|
      |71|111|77|Sitting|99|17|99|
* Save the consultation
* Go to "Diagnosis" tab
* Add following diagnosis
      |type|diagnosis|order|certainty|status|
      |noncoded|High Blood Pressure|Primary|Confirmed|Active|
      |coded|Pyloric stenosis|Secondary|PRESUMED|Inactive|
* Save the consultation
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |details|
      |History and Examination |
      |Chief Complaint Headache|
      |Chief Complaint HeartBurn|
      |Chief Complaint Injury|
* Verify display control "Vitals" on dashboard, has the following details
      |details|
      |Pulse (72 - 72) 71 /min|
      |Systolic (110 - 140) 111 mm Hg|
      |Diastolic (70 - 85) 77 mm Hg|
      |Posture Sitting|
      |Temperature (98.6 - 98.6) 99 F|
      |RR (16 - 20) 17 /min|
      |SPO2 (> 97) 99 %|
* Verify display control "Diagnosis" on dashboard, has the following details
      |details|
      |High Blood Pressure CONFIRMED PRIMARY|
      |Pyloric stenosis PRESUMED SECONDARY|

* Navigate to consultation
* Go to "Observation" tab
* Remove chief complaint on "History and Examination" template
      |Chief Complaint|
      |Headache|
      |HeartBurn|
* Go to "Diagnosis" tab
* Remove following Diagnosis
  |Diagnosis|
  |Pyloric stenosis|
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |details|
      |History and Examination |
      |Chief Complaint Injury|
* Verify display control "Diagnosis" on dashboard, has the following details
      |details|
      |High Blood Pressure CONFIRMED PRIMARY|


Scneario 4 Registarion-App-Read-only should not have "Create New" option, but should have radiology upload, patient documents upload, and running the reports.


Scneario: Registarion-App-Read-only should not have "Create New" option, but should have radiology upload, patient documents upload, and running the reports.
-----------------------------------------------------------------------------------------------------------

Tags: regression, sanity


* Create patient and open visit with details through API with details
       |height|weight|registrationFee|
       |172|67|200|
* On the login page
* Login with user "regtwo" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
      |Application~ID(tagName)|Is Available(true/false)|
      |Registration|true|
      |Programs|false|
      |Clinical|false|
      |ADT|false|
      |Radiology|true|
      |Patient.Document|true|
      |Admin|false|
      |Reports|true|
      |Orders|false|
      |Implementer|false|
      |AtomFeed|false|
* Click on registration app
* Verify createNewButton is notPresent
* Search previously created patient with exact identifier
* Edit previous patient details as follow
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|gramPanchayat|
    |GAN|Maria|Karia|Female|20/01/2011|50|Dispur|Brindavan|
* Verify Error popup with message "TypeError: Cannot read property 'person' of undefined" is displayed
* Navigate to dashboard
* Click on radiology upload app
* Select existing patient from patient listing page under tab "Active Patients"
* Upload following images in visit "2"
    |image|name|
    |xray.jpeg|Knee - Right, 1 or 2 views (X-ray)|
* Save radiology upload


[WIP] Scenario 5 : Validation with "Clinical-App-Disposition", "Clinical-App-Observations", "InPatient-App" role

Scneario: Validation with "Clinical-App-Disposition", "Clinical-App-Observations", "InPatient-App" role
-----------------------------------------------------------------------------------------------------------
Tags: regression, sanity

* On the login page
* Login with user "nurseone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available|
    |Registration           |false       |
    |Programs               |true        |
    |Clinical               |true        |
    |ADT                    |true        |
    |Radiology              |false       |
    |Patient.Document       |false       |
    |Admin                  |false       |
    |Reports                |false       |
    |Orders                 |false       |
    |Implementer            |false       |
    |AtomFeed               |false       |
* Click on clinical app
* Select patient "GAN203687" in tab "Active"
* Navigate to consultation
* Verify only the following tab is available
    |tabName     |
    |Observations|
    |Disposition |
* Go to "Disposition" tab
* Select "Admit Patient" disposition with notes "Admit this patient"
* Save the consultation
* Navigate to dashboard link
* Verify details on dashboard "Disposition" display control
* Navigate to dashboard
* Click on inpatient app