Admin Activities
=====================
     
Order Set - Add
---------------
Tags: regression, sanity
* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* Click on create new button on orderset dashboard
* Create orderset and enter following orderset details
    |name|description|operator|
    |Orderset #####|Test orderset|ALL|
* Enter following orderset members
    |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
    |Drug Order|Paracetamol|Paracetamol 60ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
    |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
    |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
* Save the orderset
* Click on back button on orderset page
* Verify orderset created
* Click on previous orderset
* Verify previous orderset
* Navigate to dashboard
* Logout the user

Order Set - Edit
----------------
Tags: regression, sanity
* Create orderset "Orderset ######", description "Test Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Paracetamol|Paracetamol 60ml|3|Tablet(s)|Twice a day|After meals|1|Day(s)|Oral|Dont skip this medicine|
        |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
        |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|

* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* Click on previous orderset
* Edit previous orderset as "Edited #####", description "Edited test orderset", operator "ANY" with following details
      |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
      |Drug Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
      |Drug Order|Tetanus Antitoxin|Tetanus Antitoxin 0.5ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
      |Drug Order|Paracetamol|Paracetamol 60ml|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|
* Save the orderset
* Click on back button on orderset page
* Verify orderset created
* Click on previous orderset
* Verify previous orderset
* Navigate to dashboard
* Logout the user

Order Set - Delete
------------------
Tags: regression, sanity

* Create orderset "Orderset #####", description "Test Orderset", operator "ALL" with following members using api
        |orderType|conceptName|drugName|dose|doseUnit|frequency|instruction|duration|durationUnit|route|additionalInstructions|
        |Drug Order|Paracetamol|Paracetamol 60ml|3|Tablet(s)|Twice a day|After meals|1|Day(s)|Oral|Dont skip this medicine|
        |Lab Order|Aspirin|Aspirin 75mg|2|Tablet(s)|Twice a day|After meals|3|Day(s)|Oral|Dont skip this medicine|

* On the login page
* Login to the application
* Click on admin app
* Click on order set app
* delete previous orderset
* verify previous orderset deleted
* Navigate to dashboard
* Logout the user