Create and Search Patient Scenarios
===================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Create new Patient and validate the details
---------------------------------------------------

* Create a new patient
* Validate that the patient edit page is opened for previously created patient
* Logout the user

Stop Visit
--------

* On the login page
* Login to the application
* Click on registration app
* Search patient with prefix "GAN" identifier "1235068"
* Enter Visit Details Page
* Close visit

@Smoke
Regular Search and validate the details
-------------------------------

* On the login page
* Login to the application
* Click on registration app
* Click on search patient link
* Search patient with prefix "GAN" identifier "200"
* Validate that the search results are displayed
* Logout the user

Naviage to medication
---------------------

* On the login page
* Login to the application
* Click on clinical app
* Select patient "GAN200061" in tab "Active"
* Navigate to consultation
* Go to "Medication" tab
* Create drug order
* Save the consultation

