Roles and Privileges
=====================

Login with the user which have only Registration role assigned and register a new user
--------------------------------------------------------------------------------------------

Tags: regression, sanity

* On the login page
* Login with user "regone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available   |
    |Registration           |true           |
    |Programs               |false          |
    |Clinical               |false          |
    |ADT                    |false          |
    |Radiology              |false          |
    |Patient.Document       |false          |
    |Admin                  |false          |
    |Reports                |false          |
    |Orders                 |false          |
    |Implementer            |false          |
    |AtomFeed               |false          |
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix |firstName  |lastName |gender|dateOfBirth |age|district|village |
    |GAN    |Maria      |Jones    |Female|20/01/2011  |50 |Bilaspur|Kahnapur|
* Start a visit "OPD"
* Enter visit details from table
    |height |weight |fees   |comments                       |
    |50     |5      |100    |bmi observations seems normal  |
* Verify the details on "bmi" display control
    |HEIGHT |WEIGHT |BMI    |BMI STATUS |
    |50     |5      |20     |Normal     |



Login with the user which have only Clinical role assigned and capture the observation and other details.
-----------------------------------------------------------------------------------------------------------

Tags: regression, sanity

* Create patient and open visit with details through API with details
       |height  |weight |registrationFee|
       |172     |67     |200            |
* On the login page
* Login with user "docone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available   |
    |Registration           |false          |
    |Programs               |true           |
    |Clinical               |true           |
    |ADT                    |false          |
    |Radiology              |false          |
    |Patient.Document       |false          |
    |Admin                  |false          |
    |Reports                |false          |
    |Orders                 |false          |
    |Implementer            |false          |
    |AtomFeed               |false          |
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add chief complaint on "History and Examination" template
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
      |Injury           |
* Fill "Vitals" template with following observation details
      |Pulse|Systolic   |Diastolic  |Posture|Temperature|RR |SPO2|
      |71   |111        |77         |Sitting|99         |17 |99  |
* Save the consultation
* Go to "Diagnosis" tab
* Add following diagnosis
      |type     |diagnosis          |order      |certainty  |status     |
      |noncoded |High Blood Pressure|Primary    |Confirmed  |Active     |
      |coded    |Pyloric stenosis   |Secondary  |PRESUMED   |Inactive   |
* Save the consultation
* Go to "Orders" tab
* Select following orders
      |type     |category   |name                               |
      |Radiology|chest      |chest, 1 view (x-ray)              |
      |Radiology|chest      |chest oblique - bilateral (x-ray)  |
      |Radiology|chest      |chest lateral                      |
* Enter notes to following "Radiology" orders
      |order                |note   |
      |chest, 1 view (x-ray)|Notes 1|
* Save the consultation
* Go to "Medications" tab
* Create drug order
      |drugName     |dose   |doseUnit   |frequency  |route      |additionalInstructions |duration   |durationUnit   |
      |Paracetamol  |2      |Tablet(s)  |Twice a day|Intravenous|After meals            |2          |Month(s)       |
      |Isoniazid (H)|4      |mg         |Immediately|Oral       |Take if Needed         |2          |Day(s)         |
* Save the consultation
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
      |Injury           |
* Verify display control "Vitals" on dashboard, has the following details
      |Pulse    |Systolic   |Diastolic  |Posture    |Temperature|RR     |SPO2   |
      |71/min   |111mm Hg   |77mm Hg    |Sitting    |99F        |17/min |99%    |
* Verify display control "Diagnosis" on dashboard, has the following details
      |details                              |
      |High Blood Pressure CONFIRMED PRIMARY|
      |Pyloric stenosis PRESUMED SECONDARY  |
* Navigate to consultation
* Go to "Observation" tab
* Remove chief complaint on "History and Examination" template
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
* Go to "Diagnosis" tab
* Remove following Diagnosis
      |Diagnosis        |
      |Pyloric stenosis |
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |Chief Complaint  |
      |Injury           |
* Verify display control "Diagnosis" on dashboard, has the following details
      |details                              |
      |High Blood Pressure CONFIRMED PRIMARY|


Program-App role should be able to enroll patient to the program and capture observations.
-----------------------------------------------------------------------------------------------------------
Tags: needs_fix

* Create patient and open visit with details through API with details
       |height  |weight |registrationFee|
       |172     |67     |200            |
* On the login page
* Login with user "doctwo" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available   |
    |Registration           |false          |
    |Programs               |true           |
    |Clinical               |true           |
    |ADT                    |false          |
    |Radiology              |false          |
    |Patient.Document       |false          |
    |Admin                  |false          |
    |Reports                |false          |
    |Orders                 |false          |
    |Implementer            |false          |
    |AtomFeed               |false          |
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |name       |dateOfRegistration |
    |TB Program |21/09/2016         |
* Ensure that the patient is registered to mentioned program
* Navigate to "TB Program" program dashboard
* Verify details on dashboard "Programs" display control
* Navigate to consultation
* Add chief complaint on "History and Examination" template
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
      |Injury           |
* Save the consultation
* Go to "Diagnosis" tab
* Add following diagnosis
      |type     |diagnosis          |order      |certainty  |status     |
      |noncoded |High Blood Pressure|Primary    |Confirmed  |Active     |
      |coded    |Pyloric stenosis   |Secondary  |PRESUMED   |Inactive   |
* Save the consultation
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
      |Injury           |
* Verify display control "Diagnosis" on dashboard, has the following details
      |details                              |
      |High Blood Pressure CONFIRMED PRIMARY|
      |Pyloric stenosis PRESUMED SECONDARY  |
* Navigate to consultation
* Go to "Observation" tab
* Remove chief complaint on "History and Examination" template
      |Chief Complaint  |
      |Headache         |
      |HeartBurn        |
* Go to "Diagnosis" tab
* Remove following Diagnosis
      |Diagnosis        |
      |Pyloric stenosis |
* Navigate to dashboard link
* Verify display control "History and Examinations" on dashboard, has the following details
      |Chief Complaint  |
      |Injury           |
* Verify display control "Diagnosis" on dashboard, has the following details
      |details                              |
      |High Blood Pressure CONFIRMED PRIMARY|


//The user role with specific permissions doesn't exist.This is no longer needed, Removed from regression
Scneario: Registarion-App-Read-only should not have "Create New" option, but should have radiology upload, patient documents upload, and running the reports
------------------------------------------------------------------------------------------------------------------------------------------------------------
Tags: needs_fix

* Create patient and open visit with details through API with details
       |height  |weight |registrationFee|
       |172     |67     |200            |
* On the login page
* Login with user "regtwo" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Verify only the following application is available
      |Application~ID(tagName)  |Is Available   |
      |Registration             |true           |
      |Programs                 |false          |
      |Clinical                 |false          |
      |ADT                      |false          |
      |Radiology                |false          |
      |Patient.Document         |false          |
      |Admin                    |false          |
      |Reports                  |false          |
      |Orders                   |false          |
      |Implementer              |false          |
      |AtomFeed                 |false          |
* Click on registration app
* Verify createNewButton is notPresent
* Search previously created patient with exact identifier
* Edit previous patient details as follow
    |prefix |firstName  |lastName   |gender|dateOfBirth |age|district   |gramPanchayat  |
    |GAN    |Maria      |Karia      |Female|20/01/2011  |50 |Dispur     |Brindavan      |
* Verify Error popup with message "User is logged in but doesn't have the relevant privilege [Privileges required: Get Patient Identifiers]" is displayed

Scneario: Validation with "Clinical-App-Disposition", "Clinical-App-Observations", "InPatient-App" role
-----------------------------------------------------------------------------------------------------------
Tags: regression, sanity

* Create patient and open visit with details through API with details
       |height  |weight |registrationFee|
       |172     |67     |200            |
* On the login page
* Login with user "docone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on clinical app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Go to "Disposition" tab
* Select "Admit Patient" disposition with notes "Admit this patient"
* Save the consultation
* Navigate to dashboard
* Logout the user
* Login with user "nurseone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
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
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Verify only the following tab is available
    |tabName     |
    |Observations|
* Navigate to dashboard link
* Verify details on dashboard "Disposition" display control
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "To Admit"
* Verify display control with Caption "Disposition" on inpatient dashboard, has the following details
    |details            |
    |Admit Patient      |
    |<NOW[dd MMM yy]>   |
    |Admit this patient |
* Select "Admit Patient" from Patient Movement and click "Admit" button with notes "Patient Admitted as requested"
* Click on "Yes" button
* Assign an empty bed
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details                                |
    |Total Beds: 9                          |
    |Available Beds: <AppGlobal.bedCount>   |
* Navigate to Inpatient Dashboard
* Verify display control with Caption "Admission Details" on inpatient dashboard, has the following details
    |details                            |
    |General Ward <Patient.bedNumber>   |
    |Admission Date<NOW[dd MMM yy]>     |
    |Patient Admitted as requested      |
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Verify display control "Admission-Details" on dashboard, has the following details
    |details                            |
    |General Ward <Patient.bedNumber>   |
    |Admission Date<NOW[dd MMM yy]>     |
    |Patient Admitted as requested      |
* Verify display control "Visits" on dashboard, has the following details
    |details|
    |IPD    |
* Open the current visit
* Verify display control "admissionDetails" on visit page, has the following details
    |details                            |
    |General Ward <Patient.bedNumber>   |
    |Admission Date<NOW[dd MMM yy]>     |
    |Patient Admitted as requested      |