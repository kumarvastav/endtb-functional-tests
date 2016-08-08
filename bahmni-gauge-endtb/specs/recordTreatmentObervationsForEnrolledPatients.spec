Recording Observations for patient
==================================
Created by dharmens on 7/31/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
RECORD OBSERVATIONS FOR ENROLLED PATIENT
----------------------------------------

Tags: regression, sanity, smoke

* Enroll patient to the treatment through API
* On the login page
* Login to the application
* Click on registration app
* Click on search patient link
* Search previously created patient with exact identifier
* Click on treatment enrollment
* Click on the patients previously program enrolled
* Navigate to consultation
* Select the template "Baseline" from on the observation page
* Fill baseline form
    |Date baseline assessment|Marital Status|Other Marital Status|Homeless|Employed|Other employment|ever been treated for TB in the past?|Year first TB treatment|
    |01/01/2015|Married||Yes|Pensioner||No|2016|

* Save the consultation
* Navigate to patient dashboard
* Verify previously recorded observations
* Delete the patient