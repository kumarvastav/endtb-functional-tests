Patient Admit, Discharge and Transfer
=====================================
Created by atmaramn on 20/10/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Admit Patient through Disposition
--------------------------------------------------------

Tags: regression, sanity

* Create a new patient through API
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|IPD|
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
* Navigate to adt dashboard
* Verify display control "disposition" on inpatient dashboard, has the following details
    |details|
    |Admit Patient|
    |<NOW[dd MMM yy]>|
    |Admit this patient|
* Navigate to dashboard
* Click on inpatient app
* Select existing patient from patient listing page under tab "To Admit"
* Select "Admit Patient" from Patient Movement and click "Admit" button with notes "Patient Admitted as requested"
* Assign an empty bed
* Verify display control "admissionDetails" on inpatient dashboard, has the following details
    |details|
    |Labour Ward|
    |Admission Date|
    |<NOW[dd MMM yy]>|
    |Patient Admitted as requested|
