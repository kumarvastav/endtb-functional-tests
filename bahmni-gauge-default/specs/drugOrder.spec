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
* Navigate to dashboard
* Logout the user


Scenario 2 - Search with order set name  and add order set(mg/m2 or mg/kg rule) without date in Medication Tab
----------------
Tags: regression, sanity

* Enroll patient to program through API
* On the login page
* Login to the application
* Click on registration app
* Search previously created patient with exact identifier
* Start a visit "OPD"
* Enter visit details
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
* Navigate to dashboard
* Logout the user



Scenario 3 - Search with order set description and add order set in Medication Tab
----------------
Tags: regression, sanity

* Enroll patient to program through API
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
* Add "Drug" drug order set
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
* Navigate to dashboard
* Logout the user


