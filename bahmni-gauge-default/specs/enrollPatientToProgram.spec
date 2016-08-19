Program Enrollemnt, Editing of Program Attributes and End the Program
=====================================================================
Created by dharmens on 7/5/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


Create Patient and Enrollment of Patient to Program
---------------------------------------------------

* On the login page
* Login to the application
* Click on registration app
* Click on create new patient link
* Create the following patient

    |prefix|firstName|lastName|gender|dateOfBirth|age|district|
    |GAN|Test|Patient|Male|20/01/2011|50|Bilaspur|

* Navigate to dashboard
* Logout the user
* Login to the application
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Register the patient to following program
    |TB Register|Date Of Registration|Registration Number|Registration Facility|
    |Basic management unit TB register|01/01/2015|ABC|Facility1, City1, Country1|
* Ensure that the patient is registered to mentioned program


Editing of Program Attributes
-----------------------------

* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* Edit attribute to registration "DEF" and facility "Facility1, City1, Country1"
* Ensure that the patient is registered to mentioned program


End the Program Enrolled for Patient
------------------------------------

* Navigate to dashboard
* Click on programs app
* Select existing patient from patient listing page under tab "All"
* End the program "TB Program"
* Ensure that the patient is registered to mentioned program