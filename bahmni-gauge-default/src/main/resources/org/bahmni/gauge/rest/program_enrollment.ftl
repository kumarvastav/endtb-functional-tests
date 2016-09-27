<#setting date_format="yyyy-MM-dd">
<#setting locale="en_US">

{

   "patient":"${patient.uuid}",
   "program":"7841b9d6-1e5a-4f71-ba83-6c074d015657",
   "dateEnrolled":"${program.dateOfRegistration?datetime("dd/MM/yyyy")?date}",
   "attributes":[{
                "attributeType": {
                "uuid": "ecd4abf2-bdbd-11e5-87d4-005056822ee5"
                },
                "value": "${program.treatmentDate?datetime("dd/MM/yyyy")?date}"
                }, {
                "attributeType": {
                "uuid": "51b8be10-cb1a-11e5-87d4-005056822ee5"
                },
                "value": "cbf4892e-f700-4dd8-b880-f60ef913cdb5"
                }],
                "states": [{
                "state": "dc189ad7-49ae-4fd8-99da-9e89d543ddd1",
                "startDate": "2016-09-23T00:00:00+0530"
                }]
}