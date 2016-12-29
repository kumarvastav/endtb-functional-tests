Scenarios for awaiting validation queues
==========================================
Created by swarup on 12/23/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

Create Patient Via Api
----------------------
* Create patient "Nasim" using API with "First Stage Validation" visit
* Enroll patient to reconstructive surgery program using API

Test for queue when Medical File is required
--------------------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_DATA_ADMIN_USER" and password "BAHMNI_GAUGE_DATA_ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA_ADMIN_LOCATION"
* Click on programs app
* Search and select patient "Nasim" from "Programs" queue
* Navigate to "Reconstructive Surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "First Stage Validation" from observation page and fill details
| FIELD                         | VALUE      |
| Date Received                 | 10/10/2016 |
| Is the medical file complete? | Yes        |
* Save the consultation
* Navigate to queues
* Verify patient "Nasim" is present only in "Awaiting Validation - 1st Stage " following queue

Test for queue when Date of presentation of First stage validation is captured
------------------------------------------------------------------------------
* On the login page
* Login with username "BAHMNI_GAUGE_DATA_ADMIN_USER" and password "BAHMNI_GAUGE_DATA_ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA_ADMIN_LOCATION"
* Click on programs app
* Search and select patient "Nasim" from "Programs" queue
* Navigate to "Reconstructive Surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "First Stage Validation" from observation page and fill details
| FIELD                                     | VALUE                   |
| Date of presentation                      | 10/10/2016              |
* Save the consultation
* Navigate to queues
* Verify patient "Nasim" is not present in any queue
* End visit for previously created patient using API
* Refresh the queues page
* Verify patient "Nasim" is not present in any queue

Test for queue when Date of presentatin of Final validation is captured
-----------------------------------------------------------------------
* Start "First Stage Validation" visit using API
* On the login page
* Login with username "BAHMNI_GAUGE_DATA_ADMIN_USER" and password "BAHMNI_GAUGE_DATA_ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA_ADMIN_LOCATION"
* Click on programs app
* Search and select patient "Nasim" from "Programs" queue
* Navigate to "Reconstructive Surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Final Validation" from observation page and fill details
| FIELD                                     | VALUE                   |
| Date of Presentation                      | 10/10/2016              |
* Save the consultation
* Navigate to queues
* Verify patient "Nasim" is not present in any queue
* End visit for previously created patient using API
* Refresh the queues page
* Verify patient "Nasim" is not present in any queue

Test for queue when Date of Presentation of Followup validation is captured
---------------------------------------------------------------------------
* Start "Follow-Up Validation" visit using API
* On the login page
* Login with username "BAHMNI_GAUGE_DATA_ADMIN_USER" and password "BAHMNI_GAUGE_DATA_ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA_ADMIN_LOCATION"
* Click on programs app
* Search and select patient "Nasim" from "Programs" queue
* Edit "Reconstructive Surgery" Program with following details
| programStatus     |
| Network Follow-up |
* Navigate to queues
* Verify patient "Nasim" is present only in "Awaiting Validation - Follow Up Stage " following queue
* Search and select patient "Nasim" from "Programs" queue
* Navigate to "Reconstructive Surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Final Validation" from observation page and fill details
| FIELD                                     | VALUE                   |
| Date of Presentation                      | 10/10/2016              |
* Save the consultation
* Navigate to queues
* Verify patient "Nasim" is not present in any queue
* End visit for previously created patient using API
* Refresh the queues page
* Verify patient "Nasim" is not present in any queue

Test for queue when Date of Presentation of Final validation is captured
---------------------------------------------------------------------------
* Start "Follow-Up Validation" visit using API
* On the login page
* Login with username "BAHMNI_GAUGE_DATA_ADMIN_USER" and password "BAHMNI_GAUGE_DATA_ADMIN_PASSWORD" with location "BAHMNI_GAUGE_DATA_ADMIN_LOCATION"
* Click on programs app
* Search and select patient "Nasim" from "Programs" queue
* Navigate to "Reconstructive Surgery" program dashboard
* Navigate to consultation
* Go to "Observations" tab
* Select template "Final Validation" from observation page and fill details
| FIELD                                     | VALUE                   |
| Date of Presentation                      | 10/10/2016              |
* Save the consultation
* Navigate to queues
* Verify patient "Nasim" is not present in any queue
* End visit for previously created patient using API
* Refresh the queues page
* Verify patient "Nasim" is not present in any queue



