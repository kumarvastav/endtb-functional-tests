Patient Registration Scenarios
==============================

Create Patient Under Age 18 and Fill Legal Rep
----------------------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
| firstName | lastName | givenNameArabic | familyNameArabic | gender | age | governorate | country | phoneNumber1 | spokenLanguages | nationality1 |
| Al adasd       | Hassan   | أل              | حسن              | Male   | 12  | Amman       | Jordan  | +9898989898  | English         | Egyptian     |
* Enter Legal Rep Details
    |legalRepFullNameEnglish|legalRepFullNameArabic|legalRepRelationWithPatient|legalRepGender|legalRepDob|legalRepNationality|
    |Al Bangalore|حسن |Brother|Male|
* Save Patient

Create Patient And Fill Caretaker
---------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
| firstName | lastName | givenNameArabic | familyNameArabic | gender | age | governorate | country | phoneNumber1 | spokenLanguages | nationality1 | isCareTakerRequiredCheckBox |
| Kamal     | Hassan   | أل              | حسن              | Male   | 12  | Amman       | Jordan  | +9898989898  | English         | Egyptian     | True                        |
* Enter Caretaker Details
| caretakerNameEnglish | caretakerDocumentType | caretakerPhoneNumber1 |
| Shruthi Hassan       | Passport              | +987653234567         |
* Save Patient

Create Patient And Verify Legal Rep Same As Caretaker
-----------------------------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
| firstName | lastName | givenNameArabic | familyNameArabic | gender | age | governorate | country | phoneNumber1 | spokenLanguages | nationality1 | isCareTakerRequiredCheckBox |
| Amitab    | Bachan   | أل              | حسن              | Male   | 12  | Amman       | Jordan  | +9898989898  | English         | Egyptian     | True                        |
* Enter Caretaker Details
| caretakerNameEnglish | caretakerNameArabic | caretakerGender | caretakerDob | caretakerNationality | legalRepalsoCaretaker |
| Shruthi Hassan       | سن                  | Female          | 28-01-1986   | Iraqi                | Yes                   |
* Verify Legal Rep Values
* Save Patient
