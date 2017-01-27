Patient Admit, Transfer, Discharge and Undo Discharge
=====================================================

Verify Admit Patient end to end flow through Disposition
--------------------------------------------------------

Tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Disposition" tab
* Select "Admit Patient" disposition with notes "Admit this patient"
* Save the consultation
* Go to "Consultation" tab
* Verify Disposition details on consultation tab
* Navigate to patient dashboard
* Verify details on dashboard "Disposition" display control
* Open the current visit
* Verify details on visit page "Disposition" display control
* Navigate to patient dashboard
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "To Admit"
* Verify display control with Caption "Disposition" on inpatient dashboard, has the following details
    |details|
    |Admit Patient|
    |<NOW[dd MMM yy]>|
    |Admit this patient|
* Select "Admit Patient" from Patient Movement and click "Admit" button with notes "Patient Admitted as requested"
* Click on "Yes" button
* Assign an empty bed
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details|
    |Total Beds: 9 |
    |Available Beds: <AppGlobal.bedCount>|
* Navigate to Inpatient Dashboard
* Verify display control with Caption "Admission Details" on inpatient dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
    |Patient Admitted as requested|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Verify display control "Admission-Details" on dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
    |Patient Admitted as requested|
* Verify display control "Visits" on dashboard, has the following details
    |details|
    |IPD |
* Open the current visit
* Verify display control "admissionDetails" on visit page, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
    |Patient Admitted as requested|
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "Ward List"


Verify Transfer, Discharge and Undo Discharge Patient through Disposition
--------------------------------------------------------------------------
Tags: regression, sanity

* Create and admit a patient through API
* On the login page
* Login to the application
* Click on inpatient app
* Select existing patient from patient listing page under tab "Admitted"
* Select "Transfer Patient" from Patient Movement and click "Save" button with notes "Patient Transferred as requested"
* Assign an empty bed
* Navigate to Inpatient Dashboard
* Verify display control "admissionDetails" on inpatient dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Verify display control "Admission-Details" on dashboard, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
* Verify display control "Visits" on dashboard, has the following details
    |details|
    |OPD |
* Open the current visit
* Verify display control "admissionDetails" on visit page, has the following details
    |details|
    |General Ward <Patient.bedNumber>|
    |Admission Date<NOW[dd MMM yy]>|
* Navigate to consultation
* Go to "Disposition" tab
* Select "Discharge Patient" disposition with notes "Discharge this patient"
* Save the consultation
* Go to "Consultation" tab
* Verify Disposition details on consultation tab
* Navigate to patient dashboard
* Verify details on dashboard "Disposition" display control
* Open the current visit
* Verify details on visit page "Disposition" display control
* Navigate to patient dashboard
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "To Discharge"
* Verify display control with Caption "Disposition" on inpatient dashboard, has the following details
    |details|
    |Discharge Patient<NOW[dd MMM yy]>|
    |Discharge this patient|
* Select "Discharge Patient" from Patient Movement and click "Discharge" button with notes "Patient Discharged as requested"
* Navigate to dashboard
* Click on inpatient app
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details|
    |Total Beds: 9 |
    |Available Beds: <AppGlobal.bedCount>|
* Select existing patient from patient listing page under tab "All"
* Verify display control with Caption "Admission Details" on inpatient dashboard, has the following details
    |details|
    |Discharge Date<NOW[dd MMM yy]>|
    |Patient Discharged as requested|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Verify display control "Admission-Details" on dashboard, has the following details
    |details|
    |Discharge Date<NOW[dd MMM yy]>|
    |Patient Discharged as requested|
* Open the current visit
* Verify display control "admissionDetails" on visit page, has the following details
    |details|
    |Discharge Date<NOW[dd MMM yy]>|
    |Patient Discharged as requested|
* Navigate to consultation
* Go to "Disposition" tab
* Select "Undo Discharge" disposition with notes "Undo Discharge this patient"
* Save the consultation
* Go to "Consultation" tab
* Verify Disposition details on consultation tab
* Navigate to patient dashboard
* Verify details on dashboard "Disposition" display control
* Open the current visit
* Verify details on visit page "Disposition" display control
* Navigate to patient dashboard
* Navigate to adt dashboard
* Verify display control with Caption "Disposition" on inpatient dashboard, has the following details
    |details|
    |Undo Discharge<NOW[dd MMM yy]>|
    |Undo Discharge this patient|
* Select "Undo Discharge" from Patient Movement and click "Undo Discharge" button with notes "Patient Undo Discharge as requested"
* Verify display control "view-content" on inpatient dashboard, has the following details
    |details|
    |Total Beds: 9 |
    |Available Beds: <AppGlobal.bedCount>|
* Assign an empty bed
* Navigate to Inpatient Dashboard
* Verify display control with Caption "Admission Details" on inpatient dashboard, has the following details
  |details|
  |General Ward <Patient.bedNumber>|
  |Admission Date<NOW[dd MMM yy]>|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Verify display control "Admission-Details" on dashboard, has the following details
  |details|
  |General Ward <Patient.bedNumber>|
  |Admission Date<NOW[dd MMM yy]>|
* Open the current visit
* Verify display control "admissionDetails" on visit page, has the following details
  |details|
  |General Ward <Patient.bedNumber>|
  |Admission Date<NOW[dd MMM yy]>|
