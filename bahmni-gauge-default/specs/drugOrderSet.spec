Drug Order Set in Medication Tab
================================

Search with order set name and add order set with date in Medication Tab
-------------------------------------------------------------------------
Tags: regression, sanity

* Enroll patient to program through API
* Create orderset "Hypertension", description "Drug Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Atenolol|Atenolol 25mg|1|Tablet(s)|Twice a day|Before meals|2|Day(s)|Oral||
        |Drug Order|Ibuprofen & Paracetamol|Ibuprofen & Paracetamol 225mg/5ml|0.2|mg|Twice a day||3|Day(s)|Nasal|Dont skip this medicine|
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


Search with order set name  and add order set(mg/m2 or mg/kg rule) without date in Medication Tab
-------------------------------------------------------------------------------------------------
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

Search with order set description and add order set in Medication Tab
---------------------------------------------------------------------
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
