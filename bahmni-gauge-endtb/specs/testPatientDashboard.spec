Ensure the patient dashboard is navigated
=======================================
Created by psaxena on 7/29/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Login From MSF,PIH and IRD User IDs and ensure login
-----------------------------------------------------

Tags: temp,regression

* On the login page
* Login with username "superman" and password "Admin123"
* Navigate to our patient
* Click on "Patient Summary" dashboard
* Ensure that "Treatment-Information" Obs display control with title "Treatment Information" has correct data
     |Current month of treatment|End of treatment date|Outcome|Treatment start date|
     |0.2|01 Jun 16|Died|01 Aug 16|
* Ensure that "Case-Defintion" Obs display control with title "Case Defintion" has correct data
     |WHO registration group|Disease site|
     |Other previously treated patients|Pulmonary, Extrapulmonary|
