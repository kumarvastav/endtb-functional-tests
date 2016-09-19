Specification Heading
=====================
Created by swarup on 9/17/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Scenario Heading
----------------
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
    |firstName|lastName|givenNameArabic|familyNameArabic|gender|age|governorate|country|phoneNumber1|spokenLanguages|nationality1|
    |AliAsgar|Hassan|أل |حسن |Male|12|Amman|Jordan|+9898989898|English|Egyptian|
* Enter Clinical Details
* Register the patient to following program
    |programName|dateOfRegistration|
    |Reconstructive surgery|01/01/2016|
* Navigate to "Reconstructive surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Medical History" from observation page and fill details
    |Name of MLO|Referred by|Network Area|Date of injury|Cause of injury|If caretaker is needed, why?|
    |Dr. Feras Nasr|adsadasdsad|Sanaa Network|01/01/2016|Beatings| Under 18 years|
* Select template "First Stage Validation" from observation page and fill details
    |Is the medical file complete?|Outcomes for 1st stage surgical validation|Priority|
    |Yes|Valid|Low|
* Save the consultation

