Radiology Upload Scenarios
==========================
     
Upload radiology documents
--------------------------

Tags: regression

* Create a new patient and open visit through API
* On the login page
* Login to the application
* Click on radiology upload app
* Select existing patient from patient listing page under tab "Active Patients"
* Upload following images in visit "1"
    |image|name|
    |xray.jpeg|Knee - Right, 1 or 2 views (X-ray)|
    |xray.jpeg|Knee - Right, 1 or 2 views (X-ray)|
* Save radiology upload
* Create new visit on radiology upload page
    |type|startDate|endDate|
    |LAB VISIT|01-03-2015|02-03-2015|
* Upload following images in visit "0"
    |image|name|
    |xray.jpeg|Knee - Right, 1 or 2 views (X-ray)|
* Save radiology upload
* Expand current visit
* Remove image no "1" on current visit
* Remove image no "2" on current visit
* Undo Remove image no "1" on current visit
* Upload following images in visit "1"
    |image|name|
    |xray.jpeg|Knee - Right, 1 or 2 views (X-ray)|
* Save radiology upload

