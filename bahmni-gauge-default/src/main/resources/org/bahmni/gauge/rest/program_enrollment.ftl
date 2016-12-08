<#setting datetime_format="yyyy-MM-dd'T'HH:mm:ssZ">
<#setting locale="en_US">

{

   "patient":"${patient.uuid}",
   "program":"b968ecad-8451-4193-af0c-dd0072c911a9",
   "dateEnrolled":"${program.dateOfRegistration?datetime("dd/MM/yyyy")?datetime}",
    "attributes": [{
    "attributeType": {
    "uuid": "2dc1aafd-a708-11e6-91e9-0800270d80ce"
    },
    "value": "${program.treatmentDate?datetime("dd/MM/yyyy")?datetime}"
    }, {
    "attributeType": {
    "uuid": "39202f47-a709-11e6-91e9-0800270d80ce"
    },
    "value": "88f2a6ea-367d-45dc-942a-b809b0d17275"
    }],
    "states": [{
    "state": "9f5fb4d9-76ee-49ed-8739-cd5acb10e600",
    "startDate": "2016-09-21T00:00:00+0530"
    }]
}