{
"patient": {
"person": {
"names": [
{
"givenName": "${patient.firstName}",
"familyName": "${patient.lastName}",
"preferred": false
}
],
"addresses": [
{}
],
"birthdate": "2000-12-30T00:00:00.000+0530",
"gender": "${patient.gender}",
"birthtime": null,
"attributes": [
{
"attributeType": {
"uuid": "d3c72af1-1f7f-4710-a672-a3251fad2bf2"
},
"value": "${patient.nationalIdentificationNumber}"
},
{
"attributeType": {
"uuid": "f84d7c88-13eb-462c-b057-05d5aca098e8"
},
"value": "23234"
},
{
"attributeType": {
"uuid": "e5bf7205-a029-41e2-a2ac-523833889217"
},
"value": "234324"
},
{
"attributeType": {
"uuid": "6c20c4f5-3c73-464f-8b13-fba31db48fe0"
},
"value": "2323"
},
{
"attributeType": {
"uuid": "ec1c747d-0a81-4f6f-9997-7d6001b7428e"
},
"value": "India"
},
{
"attributeType": {
"uuid": "197ae0a6-3a92-11e5-b380-0050568236ae"
},
"value": "9999999"
}
],
"deathDate": null,
"causeOfDeath": ""
},
"identifiers": [
{
"identifierPrefix": "",
"identifier": "${patient.idNumber}",
"identifierType": {
"name": "Bahmni Id"
},
"preferred": true,
"voided": false
}
]
},
"relationships": []
}
