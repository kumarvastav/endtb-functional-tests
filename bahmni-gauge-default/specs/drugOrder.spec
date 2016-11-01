Drug Order Set
=====================
Created by nityadas on 05/10/2016

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Scenario 1 - Search with order set name and add order set with date in Medication Tab
----------------
Tags: regression, sanity

* Enroll patient to program through API
* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Enter visit details from table
    |height|weight|fees|
    |10|5|100|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Add "Hypertension" drug order set with previous date
* Save the consultation
*Verify display control "Recent" on medications tab, has the following details
    |details|
    |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)(4 Tablet(s))|
    |Amlodipine & Atenolol 5mg + 50mg (Tablet) 3 Capsule(s), Once a day, After meals, Oral - 2 Day(s)(6 Capsule(s))|
* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)|
    |Amlodipine & Atenolol 5mg + 50mg (Tablet) 3 Capsule(s), Once a day, After meals, Oral - 2 Day(s)|
*Navigate to latest visit page
*Verify display control "treatment" on visit page, has the following details
     |details|
     |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)|
     |Amlodipine & Atenolol 5mg + 50mg (Tablet) 3 Capsule(s), Once a day, After meals, Oral - 2 Day(s)|
* Navigate to dashboard
* Logout the user


Scenario 2 - Search with order set name  and add order set(mg/m2 or mg/kg rule) without date in Medication Tab
----------------
Tags: regression, sanity

* Enroll patient to program through API
* Create orderset "Chemotherapy", description "Chemotherapy", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Ibuprofen & Paracetamol|Ibuprofen & Paracetamol 225mg/5ml|0.2|mg|Twice a day||3|Day(s)|Nasal|Dont skip this medicine|
        |Drug Order|Warfarin|Warfarin 1mg|5|mg|Once a day||4|Day(s)|Intramuscular|Dont skip this medicine|
        |Drug Order|Polyvalent Anti Snake Serum|Polyvalent Anti Snake Serum|30|mg|Once a day||3|Day(s)|Intramuscular|Dont skip this medicine|

* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Enter visit details from table
    |height|weight|fees|
    |10|5|100|
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Add "Chemotherapy" drug order set
* Save the consultation
*Verify display control "Recent" on medications tab, has the following details
    |details|
    |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)(2 mg)|
    |Warfarin 1mg (Tablet) 5 mg, Once a day, Intramuscular - 4 Day(s)(20 mg)|
    |Polyvalent Anti Snake Serum (Injection) 30 mg, Once a day, Intramuscular - 3 Day(s)(90 mg)|
* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
     |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)|
     |Warfarin 1mg (Tablet) 5 mg, Once a day, Intramuscular - 4 Day(s)|
     |Polyvalent Anti Snake Serum (Injection) 30 mg, Once a day, Intramuscular - 3 Day(s)|
*Navigate to latest visit page
*Verify display control "treatment" on visit page, has the following details
     |details|
     |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)|
     |Warfarin 1mg (Tablet) 5 mg, Once a day, Intramuscular - 4 Day(s)|
     |Polyvalent Anti Snake Serum (Injection) 30 mg, Once a day, Intramuscular - 3 Day(s)|
* Navigate to dashboard
* Logout the user



Scenario 3 - Search with order set description and add order set in Medication Tab
----------------
Tags: regression, sanity

* Enroll patient to program through API
* Create orderset "Drug Orderset", description "Drug Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Atenolol|Atenolol 25mg|1|Tablet(s)|Twice a day|Before meals|2|Day(s)|Oral||
        |Drug Order|Ibuprofen & Paracetamol|Ibuprofen & Paracetamol 225mg/5ml|0.2|mg|Twice a day||3|Day(s)|Nasal|Dont skip this medicine|
* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Navigate to dashboard
* Click on clinical app
* Select existing patient from patient listing page under tab "All"
* Navigate to consultation
* Go to "Medications" tab
* Add "Drug Orderset" drug order set
* Save the consultation
*Verify display control "Recent" on medications tab, has the following details
    |details|
    |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)(4 Tablet(s))|
    |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)(2 mg)|
* Navigate to patient dashboard
* Verify display control "Treatments" on dashboard, has the following details
    |details|
    |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)|
    |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)|
*Navigate to latest visit page
*Verify display control "treatment" on visit page, has the following details
     |details|
     |Atenolol 25mg (Tablet) 1 Tablet(s), Twice a day, Before meals, Oral - 2 Day(s)|
     |Ibuprofen & Paracetamol 225mg/5ml (Suspension) 0.2 mg, Twice a day, Nasal - 3 Day(s)|
* Navigate to dashboard
* Logout the user



Ability to add free text drug order to a patient and Verify the details in Medication Display Control, Dashboard Treatment Display Control and Visit page
----------------------------------

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

Drug order - Edit
----------------
Tags: regression, sanity
* Create a new patient through API
* Open visit for previous patient using api
    |location|type|
    |Registration Desk|OPD|
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



Stop drug and Verify the details in Medication Display Control, Dashboard Treatment Display Control and Visit page
----------------------------------

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
    |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)(240 Tablet(s))DStopRefillstarted on <NOW[dd MMM yy]>|
    |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)(8 mg)DStopRefillstarted on <NOW[dd MMM yy]>|
*Stop the following drugs
|details|
|Paracetamol|
|Isoniazid |
*Save the consultation
*Verify display control "current visit" on medications tab, has the following details
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
*Navigate to latest visit page
*Verify display control "treatment" on visit page, has the following details
     |details|
     |Paracetamol 2 Tablet(s), Twice a day, Intravenous - 2 Month(s)Stopped on <NOW[dd MMM yy]>|
     |Isoniazid (H) 4 mg, Immediately, Oral - 2 Day(s)Stopped on <NOW[dd MMM yy]>|
* Navigate to dashboard
* Logout the user

Refill Drug order
----------------

Tags: regression, sanity

 * Create a new patient through API
 * Open visit for previous patient using api
     |location|type|
     |Registration Desk|OPD|
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
