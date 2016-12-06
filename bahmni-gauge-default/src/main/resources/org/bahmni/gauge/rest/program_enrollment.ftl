<#setting datetime_format="yyyy-MM-dd'T'HH:mm:ssZ">
<#setting locale="en_US">

{

   "patient":"${patient.uuid}",
   "program":"03705411-8da4-448a-90a5-bacad8f110e2",
   "dateEnrolled":"${program.dateOfRegistration?datetime("dd/MM/yyyy")?datetime}",
    "attributes": [{
    "attributeType": {
    "uuid": "46a47692-9aaa-11e6-ab0e-005056822ee5"
    },
    "value": "${program.treatmentDate?datetime("dd/MM/yyyy")?datetime}"
    }, {
    "attributeType": {
    "uuid": "46b9a027-9aaa-11e6-ab0e-005056822ee5"
    },
    "value": "4e08808d-cc73-45f7-9a5d-3d04e12eb64b"
    }],
    "states": [{
    "state": "c45365b0-27a0-4baa-912b-1aec34e9bb97",
    "startDate": "2016-09-21T00:00:00+0530"
    }]
}