{
"locationUuid": "371df356-3f5a-11e5-b380-0050568236ae",
"patientUuid": "${patientProgram.patient.uuid}",
"encounterUuid": null,
"visitUuid": null,
"providers": [
{
"uuid": "36b6ea1f-3f5a-11e5-b380-0050568236ae",
"name": "Super Man",
"encounterRoleUuid": "a0b03050-c99b-11e0-9572-0800200c9a66"
}
],
"encounterDateTime": "2016-09-04T15:10:27.000+0530",
"extensions": {
"mdrtbSpecimen": [
{
"dateCollected": "${specimen.dateOfSampleCollection}",
"existingObs": null,
"identifier": "${specimen.identifier}",
"sample": {
"additionalAttributes": {
"concept": {
"uuid": "7d34a176-7234-11e5-af64-0050568236ae",
"name": "Bacteriology Additional Attributes",
"shortName": "Additional Attributes",
"description": null,
"set": true,
"dataType": "N/A",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Bacteriology Attributes",
"answers": [],
"units": null,
"displayString": "Additional Attributes",
"names": [
{
"display": "Bacteriology Additional Attributes",
"uuid": "7d34aadc-7234-11e5-af64-0050568236ae",
"name": "Bacteriology Additional Attributes",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34a176-7234-11e5-af64-0050568236ae/name/7d34aadc-7234-11e5-af64-0050568236ae"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34a176-7234-11e5-af64-0050568236ae/name/7d34aadc-7234-11e5-af64-0050568236ae?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Additional Attributes",
"uuid": "7d34a612-7234-11e5-af64-0050568236ae",
"name": "Additional Attributes",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34a176-7234-11e5-af64-0050568236ae/name/7d34a612-7234-11e5-af64-0050568236ae"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34a176-7234-11e5-af64-0050568236ae/name/7d34a612-7234-11e5-af64-0050568236ae?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Additional Attributes",
"possibleAnswers": [],
"groupMembers": [
{
"concept": {
"uuid": "7ee8906f-6211-40de-b50c-6f333b4e5963",
"name": "Bacteriology, Type of Visit",
"shortName": "Type of visit",
"description": null,
"set": false,
"dataType": "Coded",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [
{
"uuid": "f3cacc75-c393-4ca3-97e8-1f972dc34946",
"name": {
"display": "Baseline",
"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
"name": "Baseline",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Baseline",
"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
"name": "Baseline",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Baseline",
"resourceVersion": "1.9"
},
{
"uuid": "af95de08-c15a-45ca-be33-581065103f3d",
"name": {
"display": "Planned monthly assessment",
"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
"name": "Planned monthly assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Planned monthly assessment",
"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
"name": "Planned monthly assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Planned monthly assessment",
"resourceVersion": "1.9"
},
{
"uuid": "d8f48e06-25b8-4029-bb94-65c720090cb5",
"name": {
"display": "Other assessment",
"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
"name": "Other assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Other assessment",
"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
"name": "Other assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Other assessment",
"resourceVersion": "1.9"
},
{
"uuid": "41fc3e2f-bf0b-4d33-a740-bc202465ed6a",
"name": {
"display": "End of treatment assessment",
"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
"name": "End of treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "End of treatment assessment",
"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
"name": "End of treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "End of treatment assessment",
"resourceVersion": "1.9"
},
{
"uuid": "1b034feb-d22a-4b74-b7c8-f028aabedc28",
"name": {
"display": "6-month post-treatment assessment",
"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
"name": "6-month post-treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "6-month post-treatment assessment",
"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
"name": "6-month post-treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "6-month post-treatment assessment",
"resourceVersion": "1.9"
}
],
"units": null,
"displayString": "Type of visit",
"names": [
{
"display": "Type of visit",
"uuid": "b410bd0d-a1fa-4859-9a87-89285054e23f",
"name": "Type of visit",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7ee8906f-6211-40de-b50c-6f333b4e5963/name/b410bd0d-a1fa-4859-9a87-89285054e23f"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7ee8906f-6211-40de-b50c-6f333b4e5963/name/b410bd0d-a1fa-4859-9a87-89285054e23f?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Bacteriology, Type of Visit",
"uuid": "7ae07a50-1aee-412a-90a8-bddd31fc7858",
"name": "Bacteriology, Type of Visit",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7ee8906f-6211-40de-b50c-6f333b4e5963/name/7ae07a50-1aee-412a-90a8-bddd31fc7858"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7ee8906f-6211-40de-b50c-6f333b4e5963/name/7ae07a50-1aee-412a-90a8-bddd31fc7858?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Type of visit",
"possibleAnswers": [
{
"uuid": "f3cacc75-c393-4ca3-97e8-1f972dc34946",
"name": {
"display": "Baseline",
"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
"name": "Baseline",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Baseline",
"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
"name": "Baseline",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Baseline",
"resourceVersion": "1.9"
},
{
"uuid": "af95de08-c15a-45ca-be33-581065103f3d",
"name": {
"display": "Planned monthly assessment",
"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
"name": "Planned monthly assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Planned monthly assessment",
"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
"name": "Planned monthly assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Planned monthly assessment",
"resourceVersion": "1.9"
},
{
"uuid": "d8f48e06-25b8-4029-bb94-65c720090cb5",
"name": {
"display": "Other assessment",
"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
"name": "Other assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Other assessment",
"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
"name": "Other assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Other assessment",
"resourceVersion": "1.9"
},
{
"uuid": "41fc3e2f-bf0b-4d33-a740-bc202465ed6a",
"name": {
"display": "End of treatment assessment",
"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
"name": "End of treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "End of treatment assessment",
"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
"name": "End of treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "End of treatment assessment",
"resourceVersion": "1.9"
},
{
"uuid": "1b034feb-d22a-4b74-b7c8-f028aabedc28",
"name": {
"display": "6-month post-treatment assessment",
"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
"name": "6-month post-treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "6-month post-treatment assessment",
"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
"name": "6-month post-treatment assessment",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "6-month post-treatment assessment",
"resourceVersion": "1.9"
}
],
"groupMembers": [],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_140",
"erroneousValue": null,
"value": {
"uuid": "${specimen.typeOfVisitUuid}"
},
"autocompleteValue": {
"display": "Baseline",
"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
"name": "Baseline",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
}
],
"resourceVersion": "1.9"
},
"showComment": false,
"_value": {
"uuid": "${specimen.typeOfVisitUuid}"
},
"disabled": false,
"voided": false
},
{
"concept": {
"uuid": "8f0af6c9-8959-4fa2-a5f0-cbdc1c8a999c",
"name": "Bacteriology, Laboratory Name",
"shortName": "Laboratory Name",
"description": null,
"set": false,
"dataType": "Coded",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [
{
"uuid": "b31c6dab-b80f-413c-946d-29fa3f79fa3d",
"name": {
"display": "Other",
"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
"name": "Other",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Other",
"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
"name": "Other",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Other",
"resourceVersion": "1.9"
}
],
"units": null,
"displayString": "Laboratory Name",
"names": [
{
"display": "Bacteriology, Laboratory Name",
"uuid": "f3423cfe-299b-4c95-bea3-9351206177f2",
"name": "Bacteriology, Laboratory Name",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/8f0af6c9-8959-4fa2-a5f0-cbdc1c8a999c/name/f3423cfe-299b-4c95-bea3-9351206177f2"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/8f0af6c9-8959-4fa2-a5f0-cbdc1c8a999c/name/f3423cfe-299b-4c95-bea3-9351206177f2?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Laboratory Name",
"uuid": "d508235b-3773-4946-a7c8-26e23b7b1922",
"name": "Laboratory Name",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/8f0af6c9-8959-4fa2-a5f0-cbdc1c8a999c/name/d508235b-3773-4946-a7c8-26e23b7b1922"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/8f0af6c9-8959-4fa2-a5f0-cbdc1c8a999c/name/d508235b-3773-4946-a7c8-26e23b7b1922?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Laboratory Name",
"possibleAnswers": [
{
"uuid": "b31c6dab-b80f-413c-946d-29fa3f79fa3d",
"name": {
"display": "Other",
"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
"name": "Other",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Other",
"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
"name": "Other",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Other",
"resourceVersion": "1.9"
}
],
"groupMembers": [],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_141",
"erroneousValue": null,
"value": {
"uuid": "${specimen.laboratoryNameUuid}"
},
"autocompleteValue": {
"display": "Other",
"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
"name": "Other",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
}
],
"resourceVersion": "1.9"
},
"showComment": false,
"_value": {
"uuid": "${specimen.laboratoryNameUuid}"
},
"disabled": false,
"voided": false
}
],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_142",
"erroneousValue": null,
"conceptSetName": "Bacteriology Additional Attributes",
"voided": false
}
},
"report": {
"results": {
"concept": {
"uuid": "7d34ec7d-7234-11e5-af64-0050568236ae",
"name": "Bacteriology Results",
"shortName": "Results",
"description": null,
"set": true,
"dataType": "N/A",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Bacteriology Results",
"answers": [],
"units": null,
"displayString": "Results",
"names": [
{
"display": "Results",
"uuid": "7d34f0f8-7234-11e5-af64-0050568236ae",
"name": "Results",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34ec7d-7234-11e5-af64-0050568236ae/name/7d34f0f8-7234-11e5-af64-0050568236ae"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34ec7d-7234-11e5-af64-0050568236ae/name/7d34f0f8-7234-11e5-af64-0050568236ae?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Bacteriology Results",
"uuid": "7d34f4c6-7234-11e5-af64-0050568236ae",
"name": "Bacteriology Results",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34ec7d-7234-11e5-af64-0050568236ae/name/7d34f4c6-7234-11e5-af64-0050568236ae"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/7d34ec7d-7234-11e5-af64-0050568236ae/name/7d34f4c6-7234-11e5-af64-0050568236ae?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Results",
"possibleAnswers": [],
"groupMembers": [
{
"concept": {
"uuid": "ef0b7642-a852-433f-922f-585fdb57b304",
"name": "Bacteriology, Smear microscopy test results",
"shortName": "Smear Microscopy Test Results",
"description": null,
"set": true,
"dataType": "N/A",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [],
"units": null,
"displayString": "Smear Microscopy Test Results",
"names": [
{
"display": "Bacteriology, Smear microscopy test results",
"uuid": "a5c66674-7ff9-4f2b-8f90-d9141a238d35",
"name": "Bacteriology, Smear microscopy test results",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ef0b7642-a852-433f-922f-585fdb57b304/name/a5c66674-7ff9-4f2b-8f90-d9141a238d35"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ef0b7642-a852-433f-922f-585fdb57b304/name/a5c66674-7ff9-4f2b-8f90-d9141a238d35?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Smear Microscopy Test Results",
"uuid": "ac7532c4-d5f3-497b-8a50-dc993dc5673a",
"name": "Smear Microscopy Test Results",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ef0b7642-a852-433f-922f-585fdb57b304/name/ac7532c4-d5f3-497b-8a50-dc993dc5673a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ef0b7642-a852-433f-922f-585fdb57b304/name/ac7532c4-d5f3-497b-8a50-dc993dc5673a?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Smear Microscopy Test Results",
"possibleAnswers": [],
"groupMembers": [
{
"concept": {
"uuid": "cdd85aab-7feb-4f85-939b-7affca2e232d",
"name": "Bacteriology, Date of AFB smear",
"shortName": "Date Of AFB Smear Done",
"description": null,
"set": false,
"dataType": "Date",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [],
"units": null,
"displayString": "Date Of AFB Smear Done",
"names": [
{
"display": "Date Of AFB Smear Done",
"uuid": "598c8b24-759e-4310-9213-cd87fcda51c4",
"name": "Date Of AFB Smear Done",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cdd85aab-7feb-4f85-939b-7affca2e232d/name/598c8b24-759e-4310-9213-cd87fcda51c4"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cdd85aab-7feb-4f85-939b-7affca2e232d/name/598c8b24-759e-4310-9213-cd87fcda51c4?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Bacteriology, Date of AFB smear",
"uuid": "b1f75d7e-9416-40b1-b35d-2a4cb58db8ab",
"name": "Bacteriology, Date of AFB smear",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cdd85aab-7feb-4f85-939b-7affca2e232d/name/b1f75d7e-9416-40b1-b35d-2a4cb58db8ab"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cdd85aab-7feb-4f85-939b-7affca2e232d/name/b1f75d7e-9416-40b1-b35d-2a4cb58db8ab?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Date Of AFB Smear Done",
"possibleAnswers": [],
"groupMembers": [],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_143",
"erroneousValue": null,
"value": "${specimen.smearDateOfTest}",
"autocompleteValue": "${specimen.smearDateOfTest}",
"showComment": false,
"__prevValue": "${specimen.smearDateOfTest}",
"_value": "${specimen.smearDateOfTest}",
"disabled": false,
"voided": false
},
{
"concept": {
"uuid": "c5d787c2-3476-4ac2-bd7e-a47d06ded247",
"name": "Bacteriology, Smear test lab ID number",
"shortName": "Smear test ID number",
"description": null,
"set": false,
"dataType": "Text",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [],
"units": null,
"displayString": "Smear test ID number",
"names": [
{
"display": "Bacteriology, Smear test lab ID number",
"uuid": "16d50a55-2a60-4d44-9769-6e0894283827",
"name": "Bacteriology, Smear test lab ID number",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/c5d787c2-3476-4ac2-bd7e-a47d06ded247/name/16d50a55-2a60-4d44-9769-6e0894283827"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/c5d787c2-3476-4ac2-bd7e-a47d06ded247/name/16d50a55-2a60-4d44-9769-6e0894283827?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Smear test ID number",
"uuid": "22fc5232-cb11-41e6-9c21-2c88e777243a",
"name": "Smear test ID number",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/c5d787c2-3476-4ac2-bd7e-a47d06ded247/name/22fc5232-cb11-41e6-9c21-2c88e777243a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/c5d787c2-3476-4ac2-bd7e-a47d06ded247/name/22fc5232-cb11-41e6-9c21-2c88e777243a?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Smear test ID number",
"possibleAnswers": [],
"groupMembers": [],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_144",
"erroneousValue": null,
"value": "${specimen.smearTestId}",
"autocompleteValue": "${specimen.smearTestId}",
"__prevValue": "${specimen.smearTestId}",
"_value": "${specimen.smearTestId}",
"disabled": false,
"voided": false
},
{
"concept": {
"uuid": "99a45ed4-01d8-4203-8132-b9d26063e138",
"name": "Bacteriology, Smear result",
"shortName": "Smear result",
"description": "\"Not read\" includes samples with insufficient sample, saliva or other",
"set": false,
"dataType": "Coded",
"hiAbsolute": null,
"lowAbsolute": null,
"hiNormal": null,
"handler": null,
"allowDecimal": null,
"lowNormal": null,
"conceptClass": "Misc",
"answers": [
{
"uuid": "cc458510-fb8c-494e-a853-6c5912a5e1e4",
"name": {
"display": "Negative",
"uuid": "b460d532-1c1d-41dc-b46e-aeca052bfc43",
"name": "Negative",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Negative",
"uuid": "b460d532-1c1d-41dc-b46e-aeca052bfc43",
"name": "Negative",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Negative",
"resourceVersion": "1.9"
},
{
"uuid": "757012d7-bd29-4c56-b25e-67e1b5a8ddd2",
"name": {
"display": "Scanty 1-3",
"uuid": "aa932e90-feb0-4386-968a-97b8ad47801a",
"name": "Scanty 1-3",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Scanty 1-3",
"uuid": "aa932e90-feb0-4386-968a-97b8ad47801a",
"name": "Scanty 1-3",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Scanty 1-3",
"resourceVersion": "1.9"
},
{
"uuid": "0b5cdc44-f073-4ec8-a0a2-0a992dc72456",
"name": {
"display": "Scanty 4-9",
"uuid": "324c5c44-7f91-4463-b298-7d1c79d75004",
"name": "Scanty 4-9",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Scanty 4-9",
"uuid": "324c5c44-7f91-4463-b298-7d1c79d75004",
"name": "Scanty 4-9",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Scanty 4-9",
"resourceVersion": "1.9"
},
{
"uuid": "48e4d05e-d31d-4b24-b7da-bfa377e124b9",
"name": {
"display": "One plus",
"uuid": "a8c79a51-ec18-4528-84a1-11d84cbdde87",
"name": "One plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "One plus",
"uuid": "a8c79a51-ec18-4528-84a1-11d84cbdde87",
"name": "One plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "1+",
"uuid": "5987b41c-5588-4342-8ea1-9ef5318914b4",
"name": "1+",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/5987b41c-5588-4342-8ea1-9ef5318914b4"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/5987b41c-5588-4342-8ea1-9ef5318914b4?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "One plus",
"resourceVersion": "1.9"
},
{
"uuid": "44f37543-c5f4-4a16-a369-a43eea647133",
"name": {
"display": "Two plus",
"uuid": "c1f3e269-cc2a-418e-8dc5-ba8df8948030",
"name": "Two plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Two plus",
"uuid": "c1f3e269-cc2a-418e-8dc5-ba8df8948030",
"name": "Two plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "2+",
"uuid": "843d7659-0fd3-4f20-b3e3-be23926f6326",
"name": "2+",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/843d7659-0fd3-4f20-b3e3-be23926f6326"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/843d7659-0fd3-4f20-b3e3-be23926f6326?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Two plus",
"resourceVersion": "1.9"
},
{
"uuid": "3cd6ca33-de53-45c3-bfc3-d922ad72f768",
"name": {
"display": "Three plus",
"uuid": "1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca",
"name": "Three plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Three plus",
"uuid": "1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca",
"name": "Three plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "3+ or more",
"uuid": "9bde7eb7-6908-4589-aee6-60c96cf58377",
"name": "3+ or more",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/9bde7eb7-6908-4589-aee6-60c96cf58377"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/9bde7eb7-6908-4589-aee6-60c96cf58377?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Three plus",
"resourceVersion": "1.9"
},
{
"uuid": "069d9c00-6133-426b-b7bd-e1296af7ef2f",
"name": {
"display": "Not read",
"uuid": "adadbe3b-2a36-4f99-b1b8-37c64323fbda",
"name": "Not read",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Not read",
"uuid": "adadbe3b-2a36-4f99-b1b8-37c64323fbda",
"name": "Not read",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Not read",
"resourceVersion": "1.9"
}
],
"units": null,
"displayString": "Smear result",
"names": [
{
"display": "Bacteriology, Smear result",
"uuid": "5a6fb8a8-9371-46ef-9b5a-340d2ff30b29",
"name": "Bacteriology, Smear result",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/99a45ed4-01d8-4203-8132-b9d26063e138/name/5a6fb8a8-9371-46ef-9b5a-340d2ff30b29"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/99a45ed4-01d8-4203-8132-b9d26063e138/name/5a6fb8a8-9371-46ef-9b5a-340d2ff30b29?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Smear result",
"uuid": "acef29d0-4537-4c82-b224-8a37a70076c2",
"name": "Smear result",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/99a45ed4-01d8-4203-8132-b9d26063e138/name/acef29d0-4537-4c82-b224-8a37a70076c2"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/99a45ed4-01d8-4203-8132-b9d26063e138/name/acef29d0-4537-4c82-b224-8a37a70076c2?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"units": null,
"label": "Smear result",
"possibleAnswers": [
{
"uuid": "cc458510-fb8c-494e-a853-6c5912a5e1e4",
"name": {
"display": "Negative",
"uuid": "b460d532-1c1d-41dc-b46e-aeca052bfc43",
"name": "Negative",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Negative",
"uuid": "b460d532-1c1d-41dc-b46e-aeca052bfc43",
"name": "Negative",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Negative",
"resourceVersion": "1.9"
},
{
"uuid": "757012d7-bd29-4c56-b25e-67e1b5a8ddd2",
"name": {
"display": "Scanty 1-3",
"uuid": "aa932e90-feb0-4386-968a-97b8ad47801a",
"name": "Scanty 1-3",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Scanty 1-3",
"uuid": "aa932e90-feb0-4386-968a-97b8ad47801a",
"name": "Scanty 1-3",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/757012d7-bd29-4c56-b25e-67e1b5a8ddd2/name/aa932e90-feb0-4386-968a-97b8ad47801a?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Scanty 1-3",
"resourceVersion": "1.9"
},
{
"uuid": "0b5cdc44-f073-4ec8-a0a2-0a992dc72456",
"name": {
"display": "Scanty 4-9",
"uuid": "324c5c44-7f91-4463-b298-7d1c79d75004",
"name": "Scanty 4-9",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Scanty 4-9",
"uuid": "324c5c44-7f91-4463-b298-7d1c79d75004",
"name": "Scanty 4-9",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/0b5cdc44-f073-4ec8-a0a2-0a992dc72456/name/324c5c44-7f91-4463-b298-7d1c79d75004?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Scanty 4-9",
"resourceVersion": "1.9"
},
{
"uuid": "48e4d05e-d31d-4b24-b7da-bfa377e124b9",
"name": {
"display": "One plus",
"uuid": "a8c79a51-ec18-4528-84a1-11d84cbdde87",
"name": "One plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "One plus",
"uuid": "a8c79a51-ec18-4528-84a1-11d84cbdde87",
"name": "One plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/a8c79a51-ec18-4528-84a1-11d84cbdde87?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "1+",
"uuid": "5987b41c-5588-4342-8ea1-9ef5318914b4",
"name": "1+",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/5987b41c-5588-4342-8ea1-9ef5318914b4"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/48e4d05e-d31d-4b24-b7da-bfa377e124b9/name/5987b41c-5588-4342-8ea1-9ef5318914b4?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "One plus",
"resourceVersion": "1.9"
},
{
"uuid": "44f37543-c5f4-4a16-a369-a43eea647133",
"name": {
"display": "Two plus",
"uuid": "c1f3e269-cc2a-418e-8dc5-ba8df8948030",
"name": "Two plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Two plus",
"uuid": "c1f3e269-cc2a-418e-8dc5-ba8df8948030",
"name": "Two plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/c1f3e269-cc2a-418e-8dc5-ba8df8948030?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "2+",
"uuid": "843d7659-0fd3-4f20-b3e3-be23926f6326",
"name": "2+",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/843d7659-0fd3-4f20-b3e3-be23926f6326"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/44f37543-c5f4-4a16-a369-a43eea647133/name/843d7659-0fd3-4f20-b3e3-be23926f6326?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Two plus",
"resourceVersion": "1.9"
},
{
"uuid": "3cd6ca33-de53-45c3-bfc3-d922ad72f768",
"name": {
"display": "Three plus",
"uuid": "1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca",
"name": "Three plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Three plus",
"uuid": "1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca",
"name": "Three plus",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/1ab0c9a4-2ec9-4e69-bafb-4ad5be78ceca?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "3+ or more",
"uuid": "9bde7eb7-6908-4589-aee6-60c96cf58377",
"name": "3+ or more",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/9bde7eb7-6908-4589-aee6-60c96cf58377"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3cd6ca33-de53-45c3-bfc3-d922ad72f768/name/9bde7eb7-6908-4589-aee6-60c96cf58377?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Three plus",
"resourceVersion": "1.9"
},
{
"uuid": "069d9c00-6133-426b-b7bd-e1296af7ef2f",
"name": {
"display": "Not read",
"uuid": "adadbe3b-2a36-4f99-b1b8-37c64323fbda",
"name": "Not read",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda?v=full"
}
],
"resourceVersion": "1.9"
},
"names": [
{
"display": "Not read",
"uuid": "adadbe3b-2a36-4f99-b1b8-37c64323fbda",
"name": "Not read",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/069d9c00-6133-426b-b7bd-e1296af7ef2f/name/adadbe3b-2a36-4f99-b1b8-37c64323fbda?v=full"
}
],
"resourceVersion": "1.9"
}
],
"displayString": "Not read",
"resourceVersion": "1.9"
}
],
"groupMembers": [],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_145",
"erroneousValue": null,
"value": {
"uuid": "${specimen.smearResultUuid}"
},
"autocompleteValue": {
"display": "Negative",
"uuid": "b460d532-1c1d-41dc-b46e-aeca052bfc43",
"name": "Negative",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/cc458510-fb8c-494e-a853-6c5912a5e1e4/name/b460d532-1c1d-41dc-b46e-aeca052bfc43?v=full"
}
],
"resourceVersion": "1.9"
},
"showComment": false,
"_value": {
"uuid": "${specimen.smearResultUuid}"
},
"disabled": false,
"voided": false
}
],
"comment": null,
"isObservation": true,
"conceptUIConfig": {
"allowAddMore": true
},
"uniqueId": "observation_146",
"erroneousValue": null,
"voided": false
}
],
"comment": null,
"isObservation": true,
"conceptUIConfig": [],
"uniqueId": "observation_207",
"erroneousValue": null,
"conceptSetName": "Bacteriology Results",
"voided": false
}
},
"type": {
"uuid": "20ea0455-4d2e-484c-a314-210dc6bd517b",
"name": "Sample, Sputum",
"shortName": "Sputum",
"description": null,
"dataType": null,
"conceptClass": null,
"displayString": "Sputum",
"names": [
{
"display": "Sample, Sputum",
"uuid": "7840549a-1530-4ea3-80a7-e89a4fd8a8ea",
"name": "Sample, Sputum",
"locale": "en",
"localePreferred": true,
"conceptNameType": "FULLY_SPECIFIED",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/20ea0455-4d2e-484c-a314-210dc6bd517b/name/7840549a-1530-4ea3-80a7-e89a4fd8a8ea"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/20ea0455-4d2e-484c-a314-210dc6bd517b/name/7840549a-1530-4ea3-80a7-e89a4fd8a8ea?v=full"
}
],
"resourceVersion": "1.9"
},
{
"display": "Sputum",
"uuid": "abe687f0-5d90-4c63-9960-e88ce35d2116",
"name": "Sputum",
"locale": "en",
"localePreferred": false,
"conceptNameType": "SHORT",
"links": [
{
"rel": "self",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/20ea0455-4d2e-484c-a314-210dc6bd517b/name/abe687f0-5d90-4c63-9960-e88ce35d2116"
},
{
"rel": "full",
"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/20ea0455-4d2e-484c-a314-210dc6bd517b/name/abe687f0-5d90-4c63-9960-e88ce35d2116?v=full"
}
],
"resourceVersion": "1.9"
}
]
},
"typeFreeText": null,
"uuid": null
}
]
},
"context": {
"patientProgramUuid": "${patientProgram.patientProgramUuid}"
},
"visitType": "General",
"bahmniDiagnoses": [],
"orders": [],
"drugOrders": [],
"disposition": null,
"observations": [],
"encounterTypeUuid": "22dffad3-1a3c-4fc2-8207-a48086675e02"
}