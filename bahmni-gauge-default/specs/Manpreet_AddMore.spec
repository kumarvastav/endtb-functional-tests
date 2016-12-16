Observation
=====================
Created by manpreetrajpal on 12/15/16

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.


Consultation - Add More Complaints
----------------
Tags: regression, sanity

* Create patient and open visit with details through API with details
   |height|weight|registrationFee|
   |172|67|200|
* Login to app and navigate to "Clinical" app
* Select existing patient from patient listing page under tab "Active"
* Navigate to consultation
* Fill "History and Examination" template with following observation details
    |Chief Complaint|for|Chief Complaint Notes|History Notes|Examination Notes|Smoking History|
    |Headache: :Accept|0|Pain|repeat|repeat|No|
* Add more observation
* Fill "History and Examination" template with following observation details
      |Chief Complaint|for|Chief Complaint Notes|History Notes|Examination Notes|Smoking History|
      |HeartBurn: :Accept|0|Pain|repeat|repeat|No|
* Add more observation
* Fill "History and Examination" template with following observation details
            |Chief Complaint|for|Chief Complaint Notes|History Notes|Examination Notes|Smoking History|
      |Injury: :Accept|0|Pain|repeat|repeat|No|

