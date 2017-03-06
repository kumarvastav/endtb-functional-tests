Add New Obs Form In Observation
===============================

Enter the add new obs form dialog in observation page
-----------------------------------------------------

tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Create a "ObservationTest" form using "obs" with "label"
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "ObservationTest" existing form
* Enter "123" into control
* Save the consultation

* Navigate to dashboard
* Go to form builder page
* Enter version "1" of "ObservationTest" form details
* Click on Edit
* Confirm edit
* Save "ObservationTest" form using "obs_obsGroup" by API
* Navigate to form list
* Enter version "2" of "ObservationTest" form details
* Click on publish
* Navigate to dashboard

* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "ObservationTest" existing form
* Verify "ObservationTest" is disabled to add
* Expand "ObservationTest" obs form
* Clear the value in controls
* Save the consultation
* Add the "10xueying67" existing form


Add a mix of combination of section controls, obs controls and obsGroup controls
--------------------------------------------------------------------------------
tags: regression, sanity

* Login and create the "Observation test form" form by form builder
* Verify form is "v1" version and "Draft" status

* Save "Observation test form" form using "section" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Outer Section" label

* Save "Observation test form" form using "sectionObs" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Death Note, Hospital Course" label

* Save "Observation test form" form using "innerSection" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Inner Section" label

* Save "Observation test form" form using "innerSectionObsGroup" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Systolic Data" label
* Select "Mandatory" property for "Systolic Abnormal"
* Select "Notes" property for "Systolic Abnormal"
* Select "Notes" property for "Systolic(mm Hg)"



Create new obs form
-----------------------------------------------------

tags: regression, sanity

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Create a "ObservationTestForm3" form using "obs" with "manyobs"
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "ObservationTestForm3" existing form
* Fill "ObservationTestForm3" template with following observation details
    |Systolic(mm Hg)|Systolic Abnormal|
        |130|Yes|
