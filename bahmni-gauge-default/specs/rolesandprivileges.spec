Specification Heading
=====================
Created by manpreetrajpal on 12/24/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     

Login with the user which have only Registration role assigned and register a new user
--------------------------------------------------------------------------------------------

Tags: regression, sanity

* On the login page
* Login with user "regone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "Registration Desk"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available|
    |Registration|true|
    |Programs|false|
    |Clinical|false|
    |ADT|false|
    |Radiology|false|
    |Patient.Document|false|
    |Admin|false|
    |Reports|false|
    |Orders|false|
    |Implementer|false|
    |AtomFeed|false|
* Click on registration app
* Click on create new patient link
* Create the following patient
    |prefix|firstName|lastName|gender|dateOfBirth|age|district|village|
    |GAN|Maria|Jones|Female|20/01/2011|50|Bilaspur|Kahnapur|
* Start a visit "OPD"
* Enter visit details from table
    |height|weight|fees|comments|
    |50|5|100|bmi observations seems normal|
* Verify the details on "bmi" display control
    |details|
    |HEIGHT50|
    |WEIGHT5|
    |BMI20|
    |BMI STATUSNormal|



Login with the user which have only Clinical role assigned and capture the observation and other details.
-----------------------------------------------------------------------------------------------------------

Tags: regression, sanity

* Create the following patient using api
    |prefix|firstName|lastName|gender|dateOfBirth|district|gramPanchayat|
    |GAN|Hanah|Jones|F|20/01/2011|Bilaspur|Narnia|
* On the login page
* Login with user "docone" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "OPD-1"
* Verify only the following application is available
    |Application~ID(tagName)|Is Available|
    |Registration|false|
    |Programs|true|
    |Clinical|true|
    |ADT|false|
    |Radiology|false|
    |Patient.Document|false|
    |Admin|false|
    |Reports|false|
    |Orders|false|
    |Implementer|false|
    |AtomFeed|false|



