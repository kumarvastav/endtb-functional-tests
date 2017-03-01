Add New Obs Form In Observation
===============================

Enter the add new obs form dialog in observation page
-----------------------------------------------------

tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Create a "10xueying67" form using "obs"
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "10xueying67" existing form
* Enter "123" into control
* Save the consultation

* Navigate to dashboard
* Go to form builder page
* Enter version "1" of "10xueying67" form details
* Click on Edit
* Confirm edit
* Save "10xueying67" form using "obs_obsGroup" by API
* Navigate to form list
* Enter version "2" of "10xueying67" form details
* Click on publish
* Navigate to dashboard

* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "10xueying67" existing form
* Verify "10xueying67" is disabled to add
* Expand "10xueying67" obs form
* Clear the value in controls
* Save the consultation
* Add the "10xueying67" existing form
