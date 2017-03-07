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
* Add the "ObservationTest" existing form


Add a mix of combination of section controls, obs controls and obsGroup controls
--------------------------------------------------------------------------------
tags: regression, sanity

* Login and create the "Observation test form" form by form builder
* Verify form is "v1" version and "Draft" status
* Verify "Save" button is "enable" on form builder
* Verify "Publish" button is "disabled" on form builder

* Save "Observation test form" form using "section" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Change the "Section" label name to "Outer Section"
* Verify canvas has "Outer Section" label

* Save "Observation test form" form using "sectionObs" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Death Note, Hospital Course" label
* Verify "Outer Section" section has "Death Note, Hospital Course"

* Save "Observation test form" form using "innerSection" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Change the "Section" label name to "Inner Section"
* Verify canvas has "Inner Section" label
* Verify "Outer Section" section has "Inner Section"

* Save "Observation test form" form using "innerSectionObsGroup" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Systolic Data" label
* Verify "Inner Section" section has "Systolic Data"
* Select "Mandatory" property for "Systolic Abnormal"
* Select "Notes" property for "Systolic Abnormal"
* Select "Notes" property for "Systolic(mm Hg)"
* Verify "Systolic Abnormal" checked "Mandatory" property
* Verify "Systolic Abnormal" checked "Notes" property
* Verify "Systolic Abnormal" has notes icon
* Verify "Systolic Abnormal" has asterisk mark
* Verify "Systolic(mm Hg)" checked "Notes" property
* Verify "Systolic(mm Hg)" has notes icon

* Save "Observation test form" form using "innerSectionObsGroups" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "BMI Status Data" label
* Verify "Inner Section" section has "BMI Status Data"
* Select "Mandatory" property for "BMI STATUS ABNORMAL"
* Select "Notes" property for "BMI STATUS ABNORMAL"
* Select "Notes" property for "BMI STATUS"
* Verify "BMI STATUS ABNORMAL" checked "Mandatory" property
* Verify "BMI STATUS ABNORMAL" checked "Notes" property
* Verify "BMI STATUS ABNORMAL" has notes icon
* Verify "BMI STATUS ABNORMAL" has asterisk mark
* Verify "BMI STATUS" checked "Notes" property
* Verify "BMI STATUS" has notes icon

* Save "Observation test form" form using "obsInnerSectionObsGroups" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "P/A Presenting Part" label
* Verify "Outer Section" section has "P/A Presenting Part"
* Verify "Inner Section" section has no "P/A Presenting Part"
* Select "Notes" property for "P/A Presenting Part"
* Select "DropDown" property for "P/A Presenting Part"
* Verify "P/A Presenting Part" checked "DropDown" property
* Verify "P/A Presenting Part" checked "Notes" property
* Verify "P/A Presenting Part" has notes icon
* Verify "P/A Presenting Part" is displayed by drop down style

* Save "Observation test form" form using "twoObsInnerSectionObsGroups" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Diabetes, Cormorbidities" label
* Verify "Outer Section" section has "Diabetes, Cormorbidities"
* Verify "Inner Section" section has no "Diabetes, Cormorbidities"
* Select "AutoComplete" property for "Diabetes, Cormorbidities"
* Select "MultiSelect" property for "Diabetes, Cormorbidities"
* Verify "Diabetes, Cormorbidities" checked "MultiSelect" property
* Verify "Diabetes, Cormorbidities" checked "AutoComplete" property

* Save "Observation test form" form using "threeObsInnerSectionObsGroups" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Diabetes, Exercise" label
* Select "MultiSelect" property for "Diabetes, Exercise"
* Verify "Diabetes, Cormorbidities" checked "MultiSelect" property

* Click on save
* Verify "Form Saved Successfully" showed up
* Click on publish
* Verify "Form Successfully Published" showed up
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify form is "v1" version and "Published" status
* Verify the form is read only

* Navigate to dashboard
* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "Observation test form" existing form

* Enter "Observation test form" template with following observation details
    |Systolic(mm Hg)|Systolic Abnormal|
        |130|Yes|
* Save the consultation
* Verify error message "Please enter a value in the mandatory fields or correct the value in the highlighted fields to proceed" is displayed

* Click on collapse all
* Click on expand all

* Enter "Observation test form" template with all observation details
    |Death Note, Hospital Course|Systolic(mm Hg)|Systolic Abnormal|BMI STATUS|BMI STATUS ABNORMAL|P/A Presenting Part|Diabetes, Cormorbidities|Diabetes, Exercise|
        |test|55|Yes|test|No|Cephalic|CKD|Standing at work|
* Save the consultation

Create new obs form
-----------------------------------------------------

tags: regression, sanity

* Login and create the "ObservationTestForm" form by form builder
* Verify form is "v1" version and "Draft" status

* Save "ObservationTestForm" form using "consultationnote" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "Consultation Note" label
* Select "Mandatory" property for "Consultation Note"
* Select "Notes" property for "Consultation Note"

* Save "ObservationTestForm" form using "weight" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "WEIGHT" label
* Select "Mandatory" property for "WEIGHT"
* Select "Notes" property for "WEIGHT"

* Save "ObservationTestForm" form using "presentingpart" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "P/A Presenting Part" label
* Select "AutoComplete" property for "P/A Presenting Part"

* Save "ObservationTestForm" form using "smokinghistory" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "Smoking History" label
* Change the "Smoking History" label name to "Is Patient Smoking ?"
//* Verify canvas has "Is Patient Smoking ?" label

* Save "ObservationTestForm" form using "date" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "Date of Operation" label
* Select "HideLabel" property for "Date of Operation"

* Save "ObservationTestForm" form using "systolicdata" by API
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify canvas has "Systolic Data" label
* Change the "Systolic Data" label name to "Systolic Observation Data"

* Click on save
* Click on publish
* Navigate to form list
* Enter version "1" of "ObservationTestForm" form details
* Verify form is "v1" version and "Published" status

* Navigate to dashboard
* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "ObservationTestForm" existing form

* Enter "ObservationTestForm" template with following observation details
    |Systolic(mm Hg)|Systolic Abnormal|
        |130|Yes|
* Save the consultation
* Click the error message button
* Click add Note button

* Enter "ObservationTestForm" template with all observation details
    |Consultation Note|WEIGHT|P/A Presenting Part|Is Patient Smoking ?|Systolic(mm Hg)|Systolic Abnormal|
        |test|55|Breech|Yes|130|Yes|
//* Enter "ObservationTestForm4" template note ""
* Save the consultation
