Ensure the patient dashboard is navigated
=======================================

Create a TI form and validate in display control
-------------------------------------------------

Tags: regression, smoke, sanity

* Enroll patient to the treatment through API
* On the login page
* Login to the application
* On the dashboard page
* Create a "treatment_initiation" form with following data
    |treatmentStartDate|treatmentNextVisitDate|
    |2016-07-01|2016-08-23|
* Click on "Patient Summary" dashboard
* Ensure "Treatment-Information" display control with title "Treatment Information" with "01 Jul 16" as Start Date
    |Current month of treatment|Treatment start date|
* On the login page