Patient Registration Scenarios
==============================

* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
| firstName | lastName | givenNameArabic | familyNameArabic | gender | age | governorate | country | phoneNumber1 | spokenLanguages | nationality1 |
| Al adasd  | Hassan   | أل              | حسن              | Male   | 12  | Amman       | Jordan  | +9898989898  | English         | Egyptian     |


Create Patient Under Age 18 and Fill Legal Rep
----------------------------------------------
* Enter Legal Rep Details
| legalRepFullNameEnglish | legalRepFullNameArabic | legalRepRelationWithPatient | legalRepGender | legalRepDob  | legalRepNationality |
| Al Bangalore            | حسن                    | Brother                     | Male           |  10-10-1980 | Egyptian            |
* Save Patient and refresh page
* Verify Legal Rep Details after Save

Create Patient And Fill Caretaker
---------------------------------
* Enter Caretaker Details
| caretakerNameEnglish | caretakerDocumentType | caretakerPhoneNumber1 |
| Shruthi Hassan       | Passport              | +987653234567         |
* Save Patient and refresh page
* Verify caretaker details after save

Create Patient And Verify Legal Rep Same As Caretaker
-----------------------------------------------------
* Enter Caretaker Details
| caretakerNameEnglish | caretakerNameArabic | caretakerGender | caretakerDob | caretakerNationality | legalRepalsoCaretaker |
| Shruthi Hassan       | سن                  | Female          |  01-01-1986 | Iraqi                | Yes                   |
* Verify Legal Rep Values for autocomplete
* Save Patient and refresh page
* Verify caretaker details after save
* Verify Legal Rep Details after Save

Create Patient and Fill ID Documents
------------------------------------
* Enter ID Document Details
| id1DocumentType | id1DocNumber | id1FullNameEnglish |
| Passport        | 1828DE0S     | Amitb Bachan       |
* Save Patient and refresh page
* Verify patient id documents after save
