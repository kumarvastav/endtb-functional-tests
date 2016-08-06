Ensure the patient dashboard is navigated
=======================================
Created by psaxena on 7/29/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Create a TI form and validate in display control
-------------------------------------------------

Tags: regression

* Enroll patient to the treatment through API
* On the login page
* Login to the application
* On the dashboard page
* Create a "treatment_initiation" form with following data
    |treatmentStartDate|treatmentNextVisitDate|
    |2016-07-01|2016-08-23|
* Click on "Patient Summary" dashboard
* Ensure that "Treatment-Information" Obs display control with title "Treatment Information" has correct data
     |Current month of treatment|Treatment start date|
     |1.2|01 Jul 16|
* Delete the patient
