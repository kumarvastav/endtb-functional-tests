Specification Heading
=====================
Created by swarup on 9/22/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
Patient Create and Store Medical File information
-------------------------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_DATA-ADMIN_USER" and password "BAHMNI_GAUGE_DATA-ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA-ADMIN_LOCATION"
* Click on registration app
* Click on create new patient link
* Enter Patient Details
| firstName | lastName | givenNameArabic | familyNameArabic | gender | age | governorate | country | phoneNumber1 | spokenLanguages | nationality1 |
| Iaman     | Sayed    | أل              | حسن              | Male   | 12  | Amman       | Jordan  | +9898989898  | English         | Egyptian     |
* Enter Clinical Details
* Register the patient to following program
| programName            | dateOfRegistration |
| Reconstructive surgery | 01/01/2016         |
* Navigate to "Reconstructive surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Medical History" from observation page and fill details
| FIELD                        | VALUE          |
| Name of MLO                  | Dr. Feras Nasr |
| Referred by                  | adsadasdsad    |
| Network Area                 | Sanaa Network  |
| Date of injury               | 01/01/2016     |
| Cause of injury              | Burns          |
| If caretaker is needed, why? | Under 18 years |
* Save the consultation
* On the login page
* Login with username "BAHMNI_GAUGE_VC-MEMBER_USER" and password "BAHMNI_GAUGE_VC-MEMBER_PASSWORD" with location "BAHMNI_GAUGE_VC-MEMBER_LOCATION"
* Click on programs app
* Select patient "Iaman Sayed" in tab "Programs"
* Navigate to "Reconstructive surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "First Stage Validation" from observation page and fill details
| FIELD                                      | VALUE      |
| Is the medical file complete?              | Yes        |
| Specialty                                  | Orthopedic |
| Outcomes for 1st stage surgical validation | Valid      |
| Priority                                   | Low        |
* Save the consultation

Followup Validation
-------------------
* On the login page
* Login with username "BAHMNI_GAUGE_APP_USER" and password "BAHMNI_GAUGE_APP_PASSWORD" with location "BAHMNI_GAUGE_APP_LOCATION"
* Click on registration app
* Search patient with name "Gaman Sayed"
* Select the patient from the search results
* Enter Clinical Details
* Navigate to "Reconstructive surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Follow-up Validation" from observation page and fill details
| FIELD                                      | VALUE      |
| Date of presentation                       | 07/07/2016 |
| Stage                                      | 2          |
| Outcomes for follow-up surgical validation | MBA        |
| Priority                                   | Low        |
* Save the consultation
