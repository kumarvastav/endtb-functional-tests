Medication Tab
==============


Add free text drug order to a patient and Verify the details in Display Controls
--------------------------------------------------------------------------------

Tags: regression, sanity

* Enroll patient to program through API
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
*Verify display control "Recent" on medications tab, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|
*Verify display control "current visit" on medications tab, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|
* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
* click  "Treatments" on dashboard, and verify displayed dialog has the following details
        |details|
        |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
        |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
*Navigate to latest visit page
*Verify display control "treatment" on visit page, has the following details
     |details|
     |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
     |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
* Navigate to dashboard
* Logout the user

Add and Edit drug order & verify display controls
-------------------------------------------------
Tags: regression, sanity
* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* On the login page
* Login to the application
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Edit previous drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
    |Isoniazid (H)|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|

* Save the consultation
* Verify display control "Recent" on medications tab, has the following details
    |details|
    |Paracetamol 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|
    |Isoniazid (H) 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|

* Verify display control "current visit" on medications tab, has the following details
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



Stop drug and Verify the details in display controls
----------------------------------------------------

Tags: needs_fix

* Create a new patient and open visit through API
* On the login page
* Login to the application
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Verify display control "Recent" on medications tab, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))DStopRefillstarted on <NOW[dd MMM yy]>|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)DStopRefillstarted on <NOW[dd MMM yy]>|
* Stop the following drugs
    |details|
    |Paracetamol|
    |Isoniazid |
* Save the consultation
* Verify display control "current visit" on medications tab, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))DStopRefillStopped on <NOW[dd MMM yy]>|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)DStopRefillStopped on <NOW[dd MMM yy]>|
* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)Stopped on <NOW[dd MMM yy]>|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)Stopped on <NOW[dd MMM yy]>|
* click  "Treatments" on dashboard, and verify displayed dialog has the following details
        |details|
        |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)Stopped on <NOW[dd MMM yy]>|
        |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)Stopped on <NOW[dd MMM yy]>|
* Navigate to latest visit page
* Verify display control "treatment" on visit page, has the following details
     |details|
     |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)Stopped on <NOW[dd MMM yy]>|
     |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)Stopped on <NOW[dd MMM yy]>|
* Navigate to dashboard
* Logout the user

Refill Drug order
----------------

Tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* On the login page
* Login to the application
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Create drug order
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|2|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|4|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Refill previous drug order as following
    |drugName|dose|doseUnit|frequency|route|additionalInstructions|duration|durationUnit|
    |Paracetamol|4|Tablet(s)|Twice a day|Intravenous|After meals|2| Month(s)|
    |Isoniazid (H)|8|mg|Immediately|Oral|Take if Needed|2| Day(s)|
* Save the consultation
* Verify display control "Recent" on medications tab, has the following details
     |details|
     |Paracetamol 4 Tablet(s), Twice a day, Intravenous - 2 Month(s)(480 Tablet(s))|
     |Isoniazid (H) 8 mg, Immediately, Oral - 2 Day(s)(16 mg)|
     |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|
     |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|

* Verify display control "current visit" on medications tab, has the following details
    |details|
    |Paracetamol 4 Tablet(s), Twice a day, Intravenous - 2 Month(s)(480 Tablet(s))|
    |Isoniazid (H) 8 mg, Immediately, Oral - 2 Day(s)(16 mg)|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)|

* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
     |details|
     |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
     |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
     |Isoniazid (H) 8 mg, Immediately, Oral - 2 Day(s)|
     |Paracetamol 4 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
* click  "Treatments" on dashboard, and verify displayed dialog has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
    |Isoniazid (H) 8 mg, Immediately, Oral - 2 Day(s)|
    |Paracetamol 4 Tablet(s), Twice a day, Intravenous - 2 Month(s)|

* Navigate to latest visit page
* Verify display control "treatment" on visit page, has the following details
    |details|
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)|
    |Isoniazid (H) 8 mg, Immediately, Oral - 2 Day(s)|
    |Paracetamol 4 Tablet(s), Twice a day, Intravenous - 2 Month(s)|
