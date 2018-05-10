Add New Obs Form In Observation
===============================

Enter the add new obs form dialog in observation page
-----------------------------------------------------

Tags: needs_fix
//The form "Observation test form" already exists.  Ensure you delete it before creating a new one!!

* Login and create the "Observation test form" form by form builder
* Verify form is "v1" version and "Draft" status

* Save "Observation test form" form using "label" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Change the "Label" label name to "Observation Form"
* Verify canvas has "Observation Form" label
* Save "Observation test form" form using "labelObs" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "WEIGHT" label

* Click on save
* Verify "Form Saved Successfully" showed up
* Verify "Publish" button is "enabled" on form builder

* Navigate to form list
* Verify version "1" of "Observation test form" form "version" is "1" on form dashboard
* Verify version "1" of "Observation test form" form is created On today on form dashboard
* Verify version "1" of "Observation test form" form "Status" is "Draft" on form dashboard
* Verify version "1" of "Observation test form" form "action" is "edit" on form dashboard

* Enter version "1" of "Observation test form" form details
* Click on publish
* Verify "Form Successfully Published" showed up
* Verify the form is read only
* Verify the form is non-editable
* Verify form is "v1" version and "Published" status

* Create a new patient through API
* Open visit of type "OPD" in "BAHMNI_GAUGE_APP_LOCATION" location for previous patient using api
* Navigate to dashboard
* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "Observation test form" existing form
* Verify "Observation test form" is added to the left pane

* Enter "11" into control
* Save the consultation
* Go to "Consultation" tab
* Verify display control with Caption "Observation test form" on "Consultation" tab, has the following details
|WEIGHT|
|11|

* Navigate to dashboard
* Go to form builder page
* Enter version "1" of "Observation test form" form details
* Click on Edit
* Verify confirmation message for form builder when click on edit button
* Confirm edit
* Click on save
* Verify form is "v2" version and "Draft" status
* Save "Observation test form" form using "obs_obsGroup" by API
* Navigate to form list
* Enter version "2" of "Observation test form" form details
* Click on publish
* Verify form is "v2" version and "Published" status
* Navigate to form list
* Verify version "2" of "Observation test form" form "version" is "2" on form dashboard
* Verify version "2" of "Observation test form" form is created On today on form dashboard
* Verify version "2" of "Observation test form" form "Status" is "Published" on form dashboard
* Verify version "2" of "Observation test form" form "action" is "Published" on form dashboard

* Navigate to dashboard
* Click on "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Add the "Observation test form" existing form
* Verify "Observation test form" is disabled to add

* Expand "Observation test form" obs form
* Clear the value in controls
* Save the consultation
* Add the "Observation test form" existing form
* Enter "Observation test form" template with all observation details
|WEIGHT|Pulse(/min)|Pulse Abnormal|
|11|50|Yes|
* Save the consultation
* Go to "Consultation" tab
* Verify display control with Caption "Observation test form" on "Consultation" tab, has the following details
|WEIGHT|Pulse(/min)|
|11|50|


Add a mix of combination of section controls, obs controls and obsGroup controls
--------------------------------------------------------------------------------
Tags: needs_fix

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
* Click the error message button
* Verify "Diabetes, Cormorbidities" is "autocomplete"
* Verify "Diabetes, Cormorbidities" is "multiSelect"

* Click on collapse all
* Verify "Outer Section" set is "collapsed"
* Click on expand all
* Verify "Outer Section" set is "expanded"
* Click on "Systolic Data" stronged text
* Verify "Systolic Data" set is "collapsed"
* Click on "Systolic Data" stronged text
* Verify "Systolic Data" set is "expanded"
* Click on "Outer Section" stronged text
* Verify "Outer Section" set is "collapsed"
* Click on "Outer Section" stronged text
* Verify "Outer Section" set is "expanded"
* Click on "Inner Section" stronged text
* Verify "Inner Section" set is "collapsed"
* Click on "Inner Section" stronged text
* Verify "Inner Section" set is "expanded"

* Click add Note button
* Enter "Observation test form" template with all observation details with hide label
    |Death Note, Hospital Course|Systolic(mm Hg)|Systolic Abnormal|BMI STATUS|BMI STATUS ABNORMAL|P/A Presenting Part|Diabetes, Cormorbidities|Diabetes, Exercise|
    |test|55:note|note:No|test: :note|note:Yes|note:Cephalic:Cephalic|CKD|Standing at work|
* Save the consultation
* Go to "Consultation" tab
* Verify display control with Caption "Observation test form" on "Consultation" tab, has the following details
|Death Note, Hospital Course|Systolic(mm Hg)|BMI STATUS|P/A Presenting Part|Diabetes, Cormorbidities|Diabetes, Exercise|
|test|55|test|Cephalic|CKD|Standing at work|

Create new obs form
-----------------------------------------------------

Tags: needs_fix

* Login and create the "Observation test form" form by form builder
* Verify form is "v1" version and "Draft" status
* Verify "Save" button is "enable" on form builder
* Verify "Publish" button is "disabled" on form builder

* Save "Observation test form" form using "consultationnote" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Consultation Note" label
* Select "Mandatory" property for "Consultation Note"
* Select "Notes" property for "Consultation Note"

* Verify "Consultation Note" checked "Mandatory" property
* Verify "Consultation Note" checked "Notes" property
* Verify "Consultation Note" has notes icon
* Verify "Consultation Note" has asterisk mark

* Save "Observation test form" form using "weight" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "WEIGHT" label
* Select "Mandatory" property for "WEIGHT"
* Select "Notes" property for "WEIGHT"
* Verify "WEIGHT" checked "Mandatory" property
* Verify "WEIGHT" checked "Notes" property
* Verify "WEIGHT" has notes icon
* Verify "WEIGHT" has asterisk mark

* Save "Observation test form" form using "presentingpart" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "P/A Presenting Part" label
* Select "AutoComplete" property for "P/A Presenting Part"
* Verify "P/A Presenting Part" checked "AutoComplete" property

* Save "Observation test form" form using "smokinghistory" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Smoking History" label
* Change the "Smoking History" label name to "Is Patient Smoking ?"
* Verify canvas has "Is Patient Smoking ?" label

* Save "Observation test form" form using "date" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Date of Operation" label
* Select "HideLabel" property for "Date of Operation"

* Save "Observation test form" form using "systolicdata" by API
* Navigate to form list
* Enter version "1" of "Observation test form" form details
* Verify canvas has "Systolic Data" label
* Change the "Systolic Data" label name to "Systolic Observation Data"
* Verify canvas has "Systolic Observation Data" label

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
* Click the error message button
* Click add Note button

* Enter "Observation test form" template with all observation details with hide label
    |Consultation Note|WEIGHT|P/A Presenting Part|Is Patient Smoking ?|Date|Systolic(mm Hg)|Systolic Abnormal|
        |test: :hello|55:world|Breech|Yes|11/11/2016|133|No|
* Save the consultation
//* Verify display control with Caption "Observation test form" on "Consultation" tab, has the following details
//                    |WEIGHT|P/A Presenting Part|Systolic(mm Hg)|
//                    |55|Breech|133|
