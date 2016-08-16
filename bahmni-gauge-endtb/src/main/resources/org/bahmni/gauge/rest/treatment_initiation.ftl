{
	"locationUuid": "371df356-3f5a-11e5-b380-0050568236ae",
	"patientUuid": "${patientUuid}",
	"encounterUuid": null,
	"visitUuid": null,
	"providers": [{
		"uuid": "36b6ea1f-3f5a-11e5-b380-0050568236ae"
	}],
	"encounterDateTime": null,
	"extensions": {},
	"context": {
		"patientProgramUuid": "${patientProgramUuid}"
	},
	"visitType": "General",
	"bahmniDiagnoses": [],
	"orders": [],
	"drugOrders": [],
	"disposition": null,
	"observations": [{
		"concept": {
			"uuid": "dc4178cf-7f96-4378-b1fc-e39f31d80811",
			"name": "Treatment Initiation Template",
			"dataType": "N/A"
		},
		"units": null,
		"label": "Treatment Initiation",
		"possibleAnswers": [],
		"groupMembers": [{
			"concept": {
				"uuid": "b47e7487-de8c-4bdd-a3b6-0612f8c25c4a",
				"name": "TI, New treatment eligibility",
				"dataType": "N/A"
			},
			"units": null,
			"label": "New Treatment Eligibility",
			"possibleAnswers": [],
			"groupMembers": [{
				"concept": {
					"uuid": "e5eb9144-c3dc-4c15-bb5e-28dbe3f6ccfa",
					"name": "TI, Eligible for new drugs",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Eligible for new drugs?",
				"possibleAnswers": [{
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				}, {
					"uuid": "06046205-bccd-4ea8-ad75-aeac53f2660b",
					"name": {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "No",
						"uuid": "85996449-e217-47a7-9374-ab0aedd2e3e9",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "No",
						"uuid": "cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "False",
					"resourceVersion": "1.9"
				}, {
					"uuid": "ca286b31-d129-4a6d-ae82-e6878b15ede9",
					"name": {
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Unknown",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_1",
				"erroneousValue": null,
				"value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "True",
					"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
					"name": "True",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"_value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"error": false,
				"voided": false
			}, {
				"concept": {
					"uuid": "262a0265-e48a-4f45-881b-f750ed6f4ebf",
					"name": "TI, Date of eligibility for new drugs",
					"dataType": "Date"
				},
				"units": null,
				"label": "Date eligible new drugs",
				"possibleAnswers": [],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_2",
				"erroneousValue": null,
				"value": "2016-08-01",
				"autocompleteValue": "2016-08-01",
				"disabled": false,
				"_value": "2016-08-01",
				"voided": false
			}, {
				"concept": {
					"uuid": "ccf94ca2-84ca-47e3-b17b-00adc1408428",
					"name": "TI, Indication for new TB drugs",
					"dataType": "N/A"
				},
				"units": null,
				"label": "Indication For New Drugs",
				"possibleAnswers": [],
				"groupMembers": [{
					"concept": {
						"uuid": "0dee3c22-aaa6-462d-88d2-3872d57c1f36",
						"name": "ti_patients_const_four_drug_regimen_not_possible",
						"dataType": "Coded"
					},
					"units": null,
					"label": "Indication for new drugs: 4 effective drugs not possible",
					"possibleAnswers": [{
						"uuid": "3402fffa-3c24-433b-bac4-5af994b83c4a",
						"name": {
							"display": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"uuid": "94d57dbb-9b31-41a2-b338-48ccaa474f67",
							"name": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "1 = XDR",
							"uuid": "4d5db1d6-7c60-4394-9f16-99bbf851468d",
							"name": "1 = XDR",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/4d5db1d6-7c60-4394-9f16-99bbf851468d"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/4d5db1d6-7c60-4394-9f16-99bbf851468d?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"uuid": "94d57dbb-9b31-41a2-b338-48ccaa474f67",
							"name": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
						"resourceVersion": "1.9"
					}, {
						"uuid": "07ec3203-8ae2-4aa4-b5b3-0723fb17254c",
						"name": {
							"display": "2 = Pre-XDR - fluoroquinolone (resistance to a fluoroquinolone, but susceptible to second-line injectables)",
							"uuid": "92c59b88-002b-4389-abe5-b7d4e77702e1",
							"name": "2 = Pre-XDR - fluoroquinolone (resistance to a fluoroquinolone, but susceptible to second-line injectables)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/92c59b88-002b-4389-abe5-b7d4e77702e1"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/92c59b88-002b-4389-abe5-b7d4e77702e1?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "2 = Pre-XDR - fluoroquinolone",
							"uuid": "7bacb36c-1c29-4b0d-9324-e9684a870242",
							"name": "2 = Pre-XDR - fluoroquinolone",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/7bacb36c-1c29-4b0d-9324-e9684a870242"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/7bacb36c-1c29-4b0d-9324-e9684a870242?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "2 = Pre-XDR - fluoroquinolone (resistance to a fluoroquinolone, but susceptible to second-line injectables)",
							"uuid": "92c59b88-002b-4389-abe5-b7d4e77702e1",
							"name": "2 = Pre-XDR - fluoroquinolone (resistance to a fluoroquinolone, but susceptible to second-line injectables)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/92c59b88-002b-4389-abe5-b7d4e77702e1"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/07ec3203-8ae2-4aa4-b5b3-0723fb17254c/name/92c59b88-002b-4389-abe5-b7d4e77702e1?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "2 = Pre-XDR - fluoroquinolone (resistance to a fluoroquinolone, but susceptible to second-line injectables)",
						"resourceVersion": "1.9"
					}, {
						"uuid": "031e5064-eb58-4e48-8870-1d69f7c6d1f3",
						"name": {
							"display": "3 = Pre-XDR - injectable (resistance to at least one second-line injectable, but susceptible to a fluoroquinolone)",
							"uuid": "47f54ade-ef30-4978-adaf-8d20172d4514",
							"name": "3 = Pre-XDR - injectable (resistance to at least one second-line injectable, but susceptible to a fluoroquinolone)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/47f54ade-ef30-4978-adaf-8d20172d4514"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/47f54ade-ef30-4978-adaf-8d20172d4514?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "3 = Pre-XDR - injectable (resistance to at least one second-line injectable, but susceptible to a fluoroquinolone)",
							"uuid": "47f54ade-ef30-4978-adaf-8d20172d4514",
							"name": "3 = Pre-XDR - injectable (resistance to at least one second-line injectable, but susceptible to a fluoroquinolone)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/47f54ade-ef30-4978-adaf-8d20172d4514"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/47f54ade-ef30-4978-adaf-8d20172d4514?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "3 = Pre-XDR - injectable",
							"uuid": "756cf71f-d6c6-4191-a642-7548f093ebac",
							"name": "3 = Pre-XDR - injectable",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/756cf71f-d6c6-4191-a642-7548f093ebac"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/031e5064-eb58-4e48-8870-1d69f7c6d1f3/name/756cf71f-d6c6-4191-a642-7548f093ebac?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "3 = Pre-XDR - injectable (resistance to at least one second-line injectable, but susceptible to a fluoroquinolone)",
						"resourceVersion": "1.9"
					}, {
						"uuid": "df579289-4e00-4aa8-925b-faad4489735c",
						"name": {
							"display": "4 = Other patterns of resistance that are not XDR or pre-XDR (two or more Group 4 drugs)",
							"uuid": "52ee4c90-f8db-4995-b5d4-9ad7890c33af",
							"name": "4 = Other patterns of resistance that are not XDR or pre-XDR (two or more Group 4 drugs)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/52ee4c90-f8db-4995-b5d4-9ad7890c33af"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/52ee4c90-f8db-4995-b5d4-9ad7890c33af?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "4 = Other patterns of resistance that are not XDR or pre-XDR",
							"uuid": "a5a30a2f-9428-4149-8d0b-28c07f430ad5",
							"name": "4 = Other patterns of resistance that are not XDR or pre-XDR",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/a5a30a2f-9428-4149-8d0b-28c07f430ad5"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/a5a30a2f-9428-4149-8d0b-28c07f430ad5?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "4 = Other patterns of resistance that are not XDR or pre-XDR (two or more Group 4 drugs)",
							"uuid": "52ee4c90-f8db-4995-b5d4-9ad7890c33af",
							"name": "4 = Other patterns of resistance that are not XDR or pre-XDR (two or more Group 4 drugs)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/52ee4c90-f8db-4995-b5d4-9ad7890c33af"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/df579289-4e00-4aa8-925b-faad4489735c/name/52ee4c90-f8db-4995-b5d4-9ad7890c33af?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "4 = Other patterns of resistance that are not XDR or pre-XDR (two or more Group 4 drugs)",
						"resourceVersion": "1.9"
					}, {
						"uuid": "97a64982-c4fa-4e84-be2f-fb0de018ad71",
						"name": {
							"display": "5 = Contact with a patient infected with a strain with one of the above resistance patterns",
							"uuid": "7cfe33d7-d256-4a8c-9fce-78fd8ba65fde",
							"name": "5 = Contact with a patient infected with a strain with one of the above resistance patterns",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/7cfe33d7-d256-4a8c-9fce-78fd8ba65fde"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/7cfe33d7-d256-4a8c-9fce-78fd8ba65fde?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "5 = Contact with a patient infected with a strain with one of the above resistance patterns",
							"uuid": "7cfe33d7-d256-4a8c-9fce-78fd8ba65fde",
							"name": "5 = Contact with a patient infected with a strain with one of the above resistance patterns",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/7cfe33d7-d256-4a8c-9fce-78fd8ba65fde"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/7cfe33d7-d256-4a8c-9fce-78fd8ba65fde?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "5 = Contact with a patient with above strain",
							"uuid": "18584613-9fc7-4159-9d34-664aa3e9442a",
							"name": "5 = Contact with a patient with above strain",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/18584613-9fc7-4159-9d34-664aa3e9442a"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/97a64982-c4fa-4e84-be2f-fb0de018ad71/name/18584613-9fc7-4159-9d34-664aa3e9442a?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "5 = Contact with a patient infected with a strain with one of the above resistance patterns",
						"resourceVersion": "1.9"
					}, {
						"uuid": "74fdc344-110a-46bc-b94b-0632ce0ab22d",
						"name": {
							"display": "6 = Unable to tolerate MDR drugs necessary for construction of the regimen",
							"uuid": "df39b727-643c-4dce-943a-54642f5d58b2",
							"name": "6 = Unable to tolerate MDR drugs necessary for construction of the regimen",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/df39b727-643c-4dce-943a-54642f5d58b2"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/df39b727-643c-4dce-943a-54642f5d58b2?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "6 = Unable to tolerate MDR drugs",
							"uuid": "3a64119c-e773-4709-949d-1c6f68a61892",
							"name": "6 = Unable to tolerate MDR drugs",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/3a64119c-e773-4709-949d-1c6f68a61892"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/3a64119c-e773-4709-949d-1c6f68a61892?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "6 = Unable to tolerate MDR drugs necessary for construction of the regimen",
							"uuid": "df39b727-643c-4dce-943a-54642f5d58b2",
							"name": "6 = Unable to tolerate MDR drugs necessary for construction of the regimen",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/df39b727-643c-4dce-943a-54642f5d58b2"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/74fdc344-110a-46bc-b94b-0632ce0ab22d/name/df39b727-643c-4dce-943a-54642f5d58b2?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "6 = Unable to tolerate MDR drugs necessary for construction of the regimen",
						"resourceVersion": "1.9"
					}, {
						"uuid": "d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9",
						"name": {
							"display": "7 = Patients who have FAILED an MDR regimen",
							"uuid": "ab387099-6bab-473d-ac89-dbc0ccac91a9",
							"name": "7 = Patients who have FAILED an MDR regimen",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/ab387099-6bab-473d-ac89-dbc0ccac91a9"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/ab387099-6bab-473d-ac89-dbc0ccac91a9?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "7 = \"failed\" MDR regimen",
							"uuid": "70b971ea-f71d-4b2c-a8c1-681fa64c1f0b",
							"name": "7 = \"failed\" MDR regimen",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/70b971ea-f71d-4b2c-a8c1-681fa64c1f0b"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/70b971ea-f71d-4b2c-a8c1-681fa64c1f0b?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "7 = Patients who have FAILED an MDR regimen",
							"uuid": "ab387099-6bab-473d-ac89-dbc0ccac91a9",
							"name": "7 = Patients who have FAILED an MDR regimen",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/ab387099-6bab-473d-ac89-dbc0ccac91a9"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d7cd60c2-cd5a-4a2c-aaef-fec5e7069aa9/name/ab387099-6bab-473d-ac89-dbc0ccac91a9?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "7 = Patients who have FAILED an MDR regimen",
						"resourceVersion": "1.9"
					}],
					"groupMembers": [],
					"comment": null,
					"isObservation": true,
					"conceptUIConfig": {
						"multiSelect": true
					},
					"uniqueId": "observation_27",
					"erroneousValue": null,
					"value": {
						"uuid": "3402fffa-3c24-433b-bac4-5af994b83c4a",
						"name": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
						"names": [{
							"display": "1 = XDR",
							"uuid": "4d5db1d6-7c60-4394-9f16-99bbf851468d",
							"name": "1 = XDR",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/4d5db1d6-7c60-4394-9f16-99bbf851468d"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/4d5db1d6-7c60-4394-9f16-99bbf851468d?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"uuid": "94d57dbb-9b31-41a2-b338-48ccaa474f67",
							"name": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3402fffa-3c24-433b-bac4-5af994b83c4a/name/94d57dbb-9b31-41a2-b338-48ccaa474f67?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
						"resourceVersion": "1.9"
					},
					"autocompleteValue": "1 = XDR (resistance to a fluoroquinolone and at least one injectable)",
					"hidden": true,
					"voided": false
				}, {
					"concept": {
						"uuid": "dfa1d7b1-7855-41ca-8644-871278ea82bd",
						"name": "ti_oth_patient_high_risk_unfavourable",
						"dataType": "Coded"
					},
					"units": null,
					"label": "Indication for new drugs: high risk of unfavourable outcome",
					"possibleAnswers": [{
						"uuid": "a86c0c33-ef55-4eb7-a0d2-83b1077cadd3",
						"name": {
							"display": "8 = Extensive or advanced disease",
							"uuid": "af314e8e-710f-44b7-af4b-61aec67fd38a",
							"name": "8 = Extensive or advanced disease",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "8 = Extensive or advanced disease",
							"uuid": "e3d6dfa1-340e-404f-b8df-9ad29532da49",
							"name": "8 = Extensive or advanced disease",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/e3d6dfa1-340e-404f-b8df-9ad29532da49"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/e3d6dfa1-340e-404f-b8df-9ad29532da49?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "8 = Extensive or advanced disease",
							"uuid": "af314e8e-710f-44b7-af4b-61aec67fd38a",
							"name": "8 = Extensive or advanced disease",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "8 = Extensive or advanced disease",
						"resourceVersion": "1.9"
					}, {
						"uuid": "65677c92-ac93-4a00-b845-bc43f05ae63c",
						"name": {
							"display": "9 = Drug intolerance or contraindication, patients with low body mass index (BMI), HIV, diabetes",
							"uuid": "ce193fac-f87a-40ca-83ff-2f87c41740d8",
							"name": "9 = Drug intolerance or contraindication, patients with low body mass index (BMI), HIV, diabetes",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/ce193fac-f87a-40ca-83ff-2f87c41740d8"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/ce193fac-f87a-40ca-83ff-2f87c41740d8?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "9 = Drug intolerance/contraindication/low BMI/HIV/ diabetes",
							"uuid": "2dce9ba9-2fd9-4329-b6e1-9ca7dac77ef7",
							"name": "9 = Drug intolerance/contraindication/low BMI/HIV/ diabetes",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/2dce9ba9-2fd9-4329-b6e1-9ca7dac77ef7"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/2dce9ba9-2fd9-4329-b6e1-9ca7dac77ef7?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "9 = Drug intolerance or contraindication, patients with low body mass index (BMI), HIV, diabetes",
							"uuid": "ce193fac-f87a-40ca-83ff-2f87c41740d8",
							"name": "9 = Drug intolerance or contraindication, patients with low body mass index (BMI), HIV, diabetes",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/ce193fac-f87a-40ca-83ff-2f87c41740d8"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/65677c92-ac93-4a00-b845-bc43f05ae63c/name/ce193fac-f87a-40ca-83ff-2f87c41740d8?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "9 = Drug intolerance or contraindication, patients with low body mass index (BMI), HIV, diabetes",
						"resourceVersion": "1.9"
					}, {
						"uuid": "e081a67c-b413-43f2-b6a2-7884602d43a5",
						"name": {
							"display": "10 = Patients from catchment areas that have poor MDR-TB treatment outcomes despite good programmatic conditions",
							"uuid": "91775ea2-5461-4608-98db-4116e9c874d3",
							"name": "10 = Patients from catchment areas that have poor MDR-TB treatment outcomes despite good programmatic conditions",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/91775ea2-5461-4608-98db-4116e9c874d3"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/91775ea2-5461-4608-98db-4116e9c874d3?v=full"
							}],
							"resourceVersion": "1.9"
						},
						"names": [{
							"display": "10 = From areas with poor MDR-TB outcomes",
							"uuid": "bb20867f-720f-4ee8-9dbd-c32c74c78e5c",
							"name": "10 = From areas with poor MDR-TB outcomes",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/bb20867f-720f-4ee8-9dbd-c32c74c78e5c"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/bb20867f-720f-4ee8-9dbd-c32c74c78e5c?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "10 = Patients from catchment areas that have poor MDR-TB treatment outcomes despite good programmatic conditions",
							"uuid": "91775ea2-5461-4608-98db-4116e9c874d3",
							"name": "10 = Patients from catchment areas that have poor MDR-TB treatment outcomes despite good programmatic conditions",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/91775ea2-5461-4608-98db-4116e9c874d3"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/e081a67c-b413-43f2-b6a2-7884602d43a5/name/91775ea2-5461-4608-98db-4116e9c874d3?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "10 = Patients from catchment areas that have poor MDR-TB treatment outcomes despite good programmatic conditions",
						"resourceVersion": "1.9"
					}],
					"groupMembers": [],
					"comment": null,
					"isObservation": true,
					"conceptUIConfig": {
						"multiSelect": true
					},
					"uniqueId": "observation_28",
					"erroneousValue": null,
					"value": {
						"uuid": "a86c0c33-ef55-4eb7-a0d2-83b1077cadd3",
						"name": "8 = Extensive or advanced disease",
						"names": [{
							"display": "8 = Extensive or advanced disease",
							"uuid": "e3d6dfa1-340e-404f-b8df-9ad29532da49",
							"name": "8 = Extensive or advanced disease",
							"locale": "en",
							"localePreferred": false,
							"conceptNameType": "SHORT",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/e3d6dfa1-340e-404f-b8df-9ad29532da49"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/e3d6dfa1-340e-404f-b8df-9ad29532da49?v=full"
							}],
							"resourceVersion": "1.9"
						}, {
							"display": "8 = Extensive or advanced disease",
							"uuid": "af314e8e-710f-44b7-af4b-61aec67fd38a",
							"name": "8 = Extensive or advanced disease",
							"locale": "en",
							"localePreferred": true,
							"conceptNameType": "FULLY_SPECIFIED",
							"links": [{
								"rel": "self",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a"
							}, {
								"rel": "full",
								"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a86c0c33-ef55-4eb7-a0d2-83b1077cadd3/name/af314e8e-710f-44b7-af4b-61aec67fd38a?v=full"
							}],
							"resourceVersion": "1.9"
						}],
						"displayString": "8 = Extensive or advanced disease",
						"resourceVersion": "1.9"
					},
					"autocompleteValue": "8 = Extensive or advanced disease",
					"hidden": true,
					"voided": false
				}],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_5",
				"erroneousValue": null,
				"voided": false
			}, {
				"concept": {
					"uuid": "a90d738e-8e55-4580-bfcb-fc6039a4b9be",
					"name": "TI, Has the Treatment with New Drugs Consent Form been explained and signed",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Consent for New Drugs Signed?",
				"possibleAnswers": [{
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				}, {
					"uuid": "06046205-bccd-4ea8-ad75-aeac53f2660b",
					"name": {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "No",
						"uuid": "85996449-e217-47a7-9374-ab0aedd2e3e9",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "No",
						"uuid": "cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "False",
					"resourceVersion": "1.9"
				}, {
					"uuid": "ca286b31-d129-4a6d-ae82-e6878b15ede9",
					"name": {
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Unknown",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_6",
				"erroneousValue": null,
				"value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "True",
					"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
					"name": "True",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"_value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"voided": false
			}, {
				"concept": {
					"uuid": "6b806f15-031c-4efb-8362-cbe9c4a0b003",
					"name": "TI, Has the endTB Observational Study Consent Form been explained and signed",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Consent for endTB Obs Study signed?",
				"possibleAnswers": [{
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				}, {
					"uuid": "06046205-bccd-4ea8-ad75-aeac53f2660b",
					"name": {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "No",
						"uuid": "85996449-e217-47a7-9374-ab0aedd2e3e9",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/85996449-e217-47a7-9374-ab0aedd2e3e9?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "False",
						"uuid": "d4919f52-316b-4586-ae90-8dfba289943c",
						"name": "False",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/d4919f52-316b-4586-ae90-8dfba289943c?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "No",
						"uuid": "cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0",
						"name": "No",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/06046205-bccd-4ea8-ad75-aeac53f2660b/name/cf36bd8b-2fca-4bd3-9cbb-7ee4b9b91ce0?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "False",
					"resourceVersion": "1.9"
				}, {
					"uuid": "ca286b31-d129-4a6d-ae82-e6878b15ede9",
					"name": {
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Unknown",
						"uuid": "8d4ff50f-b7b9-4bfa-a135-35104f7e15f4",
						"name": "Unknown",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/ca286b31-d129-4a6d-ae82-e6878b15ede9/name/8d4ff50f-b7b9-4bfa-a135-35104f7e15f4?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Unknown",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_7",
				"erroneousValue": null,
				"value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "True",
					"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
					"name": "True",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"_value": {
					"uuid": "3dc73b47-05f0-4351-8162-6e8c51b5dc74",
					"name": {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Yes",
						"uuid": "69610b81-01aa-4bc5-8f41-a3883f2b7052",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": "SHORT",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/69610b81-01aa-4bc5-8f41-a3883f2b7052?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "Yes",
						"uuid": "0015f58e-cbae-49e2-a1da-588aa8155101",
						"name": "Yes",
						"locale": "en",
						"localePreferred": false,
						"conceptNameType": null,
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/0015f58e-cbae-49e2-a1da-588aa8155101?v=full"
						}],
						"resourceVersion": "1.9"
					}, {
						"display": "True",
						"uuid": "9769e4e2-b8c7-40e9-8ec7-f8904ef25d88",
						"name": "True",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/3dc73b47-05f0-4351-8162-6e8c51b5dc74/name/9769e4e2-b8c7-40e9-8ec7-f8904ef25d88?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "True",
					"resourceVersion": "1.9"
				},
				"voided": false
			}],
			"comment": null,
			"isObservation": true,
			"conceptUIConfig": [],
			"uniqueId": "observation_8",
			"erroneousValue": null,
			"voided": false
		}, {
			"concept": {
				"uuid": "d670fc9b-83cd-4e7f-ad41-0b5656c0f870",
				"name": "TI, Treatment initiation details",
				"dataType": "N/A"
			},
			"units": null,
			"label": "Treatment Initiation",
			"possibleAnswers": [],
			"groupMembers": [{
				"concept": {
					"uuid": "6ed59490-264a-447c-acf7-e06db4129c3c",
					"name": "TI, Did the patient start treatment",
					"dataType": "Boolean"
				},
				"units": null,
				"label": "Start treatment?",
				"possibleAnswers": [],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": {
					"Baseline, Date of baseline": {
						"required": true
					},
					"Baseline, Other Marital Status": {
						"conciseText": true
					},
					"Baseline, Last DSTB Registration ID": {
						"conciseText": true
					},
					"Baseline, Last DRTB Registration ID": {
						"conciseText": true
					},
					"TI, Did the patient start treatment": {
						"required": true
					},
					"TUBERCULOSIS DRUG TREATMENT START DATE": {
						"required": true
					},
					"Consent scan copy": {
						"allowAddMore": true
					},
					"Baseline, Past TB treatment table": {
						"allowAddMore": true
					},
					"Baseline, List of drugs taken for more than a month": {
						"multiSelect": true
					},
					"Baseline, Disease site": {
						"multiSelect": true
					},
					"ti_patients_const_four_drug_regimen_not_possible": {
						"multiSelect": true
					},
					"ti_oth_patient_high_risk_unfavourable": {
						"multiSelect": true
					},
					"Estimated date of confinement": {
						"allowFutureDates": true
					},
					"PRF, Estimated date of delivery": {
						"allowFutureDates": true
					},
					"Baseline, Method of MDR-TB confirmation": {
						"multiSelect": true
					},
					"Baseline, Past TB treatment drug regimen": {
						"multiSelect": true
					},
					"Baseline, Most recent previous TB treatment org.bahmi.gauge.possible.registration number": {
						"conciseText": true
					},
					"Baseline, Cancer type": {
						"conciseText": true
					},
					"Baseline, Psychiatric illness type": {
						"conciseText": true
					},
					"Baseline, Smear result": {
						"conciseText": true
					},
					"Baseline, Culture result": {
						"conciseText": true
					},
					"Baseline, Xpert MTB RIF result": {
						"conciseText": true
					},
					"Baseline, DST results": {
						"conciseText": true
					},
					"Baseline, Exact extrapulmonary site": {
						"conciseText": true
					},
					"Baseline, Other drug taken for more than a month": {
						"conciseText": true,
						"allowAddMore": true
					},
					"Baseline, HIV program org.bahmi.gauge.possible.registration number": {
						"conciseText": true
					},
					"Baseline, Drugs used in ARV treatment": {
						"multiSelect": true
					},
					"Baseline, Other employment": {
						"conciseText": true
					},
					"Baseline, Registration number of past TB treatment": {
						"conciseText": true
					},
					"Baseline, Place treatment started": {
						"conciseText": true
					},
					"Baseline, Type of heart disease": {
						"conciseText": true
					},
					"Baseline, Other pre-existing disease": {
						"allowAddMore": true
					},
					"Baseline, Other method of MDR-TB confirmation": {
						"conciseText": true
					},
					"Followup Template": {
						"allowAddMore": true
					},
					"Followup, Visit Date": {
						"required": true
					},
					"Followup, Pregnancy form case ID number": {
						"conciseText": true
					},
					"Followup, New serious AE reference number": {
						"conciseText": true
					},
					"Followup, New AE reference number": {
						"conciseText": true
					},
					"Followup, Brief Peripheral Neuropathy Screen": {
						"isTabular": true
					},
					"Followup, Vibration Perception in Left": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Ankle reflexes in left": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Vibration Perception in Right": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Ankle reflexes in right": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Visual Acuity": {
						"isTabular": true
					},
					"Followup, Pain Aching or Buring in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Pins and Needles in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Numbness in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Pain Aching or Buring in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Pins and Needles in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Followup, Numbness in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Visual acuity, left eye": {
						"disableAddNotes": true
					},
					"Visual acuity, right eye": {
						"disableAddNotes": true
					},
					"EOT, Outcome": {
						"required": true
					},
					"EOT, Reasons for treatment interrruption": {
						"multiSelect": true
					},
					"EOT, Reasons for failure definition": {
						"multiSelect": true
					},
					"EOT, Type of surgery related to death": {
						"conciseText": true
					},
					"EOT, Non TB cause of death": {
						"conciseText": true
					},
					"EOT, Transferred to where": {
						"conciseText": true
					},
					"6m PTO, Reasons for no post treatment followup": {
						"multiSelect": true
					},
					"6m PTO, Type of surgery related to post treatment death": {
						"conciseText": true
					},
					"6m PTO, Non TB cause of post treatment death": {
						"conciseText": true
					},
					"6m PTO, Other reasons for no post treatment followup": {
						"conciseText": true
					},
					"6m PTO, Transferred to where post treatment": {
						"conciseText": true
					},
					"6m PTO, Other reasons for no post treatment outcome": {
						"conciseText": true
					},
					"AE Form, Date of AE report": {
						"required": true
					},
					"Adverse Events Template": {
						"allowAddMore": true
					},
					"AE Form, AE term comprehensive list": {
						"autocomplete": true,
						"required": true
					},
					"AE Form, Other AE term": {
						"conciseText": true
					},
					"AE Form, Related Test Result": {
						"allowAddMore": true
					},
					"AE Form, AE related test": {
						"autocomplete": true
					},
					"AE Form, AE related test ID": {
						"conciseText": true
					},
					"AE Form, AE severity review": {
						"allowAddMore": true
					},
					"AE Form, TB drug treatment": {
						"allowAddMore": true
					},
					"AE Form, Other causal factors related to AE": {
						"multiSelect": true
					},
					"AE Form, Non TB drug of other causal factor": {
						"allowAddMore": true,
						"conciseText": true
					},
					"AE Form, Comorbidity of other causal factor": {
						"allowAddMore": true,
						"conciseText": true
					},
					"AE Form, Other causal factor": {
						"allowAddMore": true,
						"conciseText": true
					},
					"AE Form, TB drug name": {
						"dropdown": true
					},
					"Serious Adverse Events Template": {
						"allowAddMore": true
					},
					"SAE Form, Date of SAE report": {
						"required": true
					},
					"SAE Form, TB drug treatment": {
						"allowAddMore": true
					},
					"SAE Form, Other causal factors related to SAE": {
						"multiSelect": true
					},
					"SAE Form, TB drug name": {
						"dropdown": true
					},
					"SAE Form, Related tests (data from PV unit summary)": {
						"allowAddMore": true
					},
					"SAE Form, Related test": {
						"autocomplete": true
					},
					"SAE Form, SAE term comprehensive AE list": {
						"autocomplete": true,
						"required": true
					},
					"SAE Form, SAE severity review": {
						"allowAddMore": true
					},
					"SAE Form, Non TB drug of other causal factors": {
						"allowAddMore": true,
						"conciseText": true
					},
					"SAE Form, Comorbidity of other causal factors": {
						"allowAddMore": true,
						"conciseText": true
					},
					"SAE Form, Other causal factor": {
						"allowAddMore": true,
						"conciseText": true
					},
					"PRF, Partners initials": {
						"conciseText": true
					},
					"PRF, Pregnancy report case ID": {
						"required": false,
						"conciseText": true
					},
					"PRF, TB drug name": {
						"dropdown": true
					},
					"PRF, Non-TB drug name": {
						"conciseText": true
					},
					"PRF, TB drug exposure": {
						"allowAddMore": true
					},
					"PRF, Non-TB drug exposure": {
						"allowAddMore": true
					},
					"PRF, Infant details": {
						"allowAddMore": true
					},
					"HAN, Hospital admission date": {
						"required": true
					},
					"HDS, Hospital admission date": {
						"required": true
					},
					"HDS, Hospital discharge date": {
						"required": true
					},
					"HDS, Principal AE/SAE ID number": {
						"conciseText": true
					},
					"HDS, New AE/SAE ID number": {
						"conciseText": true
					},
					"HDS, Other type of TB related surgery": {
						"conciseText": true
					},
					"HDS, Type of TB related surgery": {
						"multiSelect": true
					},
					"Lab, Month of scheduled visit": {
						"conciseText": true
					},
					"Lab, Lab ID": {
						"conciseText": true
					},
					"Lab, Sample ID": {
						"conciseText": true
					},
					"Lab, Other test name": {
						"conciseText": true
					},
					"Lab, Other test result": {
						"conciseText": true
					},
					"Lab, Other test unit": {
						"conciseText": true
					},
					"Specimen Collection Date": {
						"required": true
					},
					"Xray Template": {
						"allowAddMore": true
					},
					"Xray, Chest Xray Date": {
						"required": true
					},
					"Xray, Other Radiological Tests": {
						"allowAddMore": true
					},
					"Xray, Additional details": {
						"isTabular": true
					},
					"Xray, Cavity left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Maximum cavity size left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Fibrosis left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Infiltrate left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Tuberculoma left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Disseminated left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Nodule left side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Pleural effusion left side": {
						"disableAddNotes": true
					},
					"Xray, Lymphadenopathy left side": {
						"disableAddNotes": true
					},
					"Xray, Pneumothorax left side": {
						"disableAddNotes": true
					},
					"Xray, Cavity right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Maximum cavity size right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Fibrosis right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Infiltrate right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Tuberculoma right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Disseminated right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Nodule right side": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Xray, Pleural effusion right side": {
						"disableAddNotes": true
					},
					"Xray, Lymphadenopathy right side": {
						"disableAddNotes": true
					},
					"Xray, Pneumothorax right side": {
						"disableAddNotes": true
					},
					"Audiometry, Audiometry template details": {
						"allowAddMore": true
					},
					"Audiometry Template": {
						"allowAddMore": true
					},
					"Audiometry, Month of scheduled visit": {
						"conciseText": true
					},
					"Audiometry, Audiometry date": {
						"required": true
					},
					"Audiometry, Audiometry details": {
						"isTabular": true
					},
					"Audiometry, Left ear at 250Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 500Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 1000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 2000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 4000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 6000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Left ear at 8000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 250Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 500Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 1000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 2000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 4000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 6000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Audiometry, Right ear at 8000Hz": {
						"disableAddNotes": true,
						"dropdown": true
					},
					"Electrocardiogram Template": {
						"allowAddMore": true
					},
					"EKG, Date of EKG": {
						"required": true
					},
					"EKG, Other Rhythm": {
						"conciseText": true
					},
					"Monthly Treatment Completeness Template": {
						"allowAddMore": true
					},
					"MTC, Month and year of treatment period": {
						"required": true,
						"minYear": 2000,
						"maxYear": 2020,
						"allowFutureDates": true,
						"displayMonthAndYear": true
					},
					"MTC, Other treatment delivery method": {
						"conciseText": true
					},
					"MTC, Additional contributing reasons for less than 100% completeness": {
						"multiSelect": true
					},
					"MTC, Additional contributing program related reasons": {
						"multiSelect": true
					},
					"MTC, Additional contributing medical or treatment related reasons": {
						"multiSelect": true
					},
					"MTC, Additional contributing patient related reasons": {
						"multiSelect": true
					},
					"MTC, DOT rate details": {
						"allowAddMore": true
					},
					"Performance Status Template": {
						"allowAddMore": true
					},
					"Performance Status, Assessment date": {
						"required": true
					},
					"6m PTO, 6 month post treatment outcome": {
						"required": true
					},
					"ECOG Performance Status": {
						"dropdown": true
					},
					"BACTERIOLOGY_SAMPLE_ID": {
						"conciseText": true
					},
					"BACTERIOLOGY_SAMPLE_TYPE": {
						"conciseText": true
					},
					"BACTERIOLOGY_SAMPLE_APPEARANCE": {
						"conciseText": true
					},
					"Bacteriology, Sequencing": {
						"allowAddMore": true
					},
					"Bacteriology, Other drug name": {
						"conciseText": true
					},
					"Bacteriology, Other culture medium": {
						"conciseText": true
					},
					"Bacteriology, DST with MIC drug name": {
						"conciseText": true
					},
					"Bacteriology, MIC technique/medium": {
						"conciseText": true
					},
					"Bacteriology, Minimum inhibitory concentration": {
						"conciseText": true
					},
					"Bacteriology, Rifampicin result details": {
						"isTabular": true
					},
					"Bacteriology, Other drug details": {
						"isTabular": true,
						"allowAddMore": true
					},
					"Baseline, Visual Acuity": {
						"isTabular": true
					},
					"Bacteriology, DST with MIC": {
						"isTabular": false,
						"allowAddMore": true
					},
					"Baseline, Brief Peripheral Neuropathy Screen": {
						"isTabular": true
					},
					"Baseline, Pain Aching or Buring in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Pins and Needles in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Numbness in Left Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Pain Aching or Buring in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Pins and Needles in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Numbness in Right Feet and Leg": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Vibration Perception in Left": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Ankle reflexes in left": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Vibration Perception in Right": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Baseline, Ankle reflexes in right": {
						"dropdown": true,
						"disableAddNotes": true
					},
					"Lab, Hemoglobin": {
						"isTabular": true
					},
					"RETURN VISIT DATE": {
						"allowFutureDates": true
					},
					"Lab, Hematocrit": {
						"isTabular": true
					},
					"Lab, Platelet count": {
						"isTabular": true
					},
					"Lab, RBC count": {
						"isTabular": true
					},
					"Lab, WBC": {
						"isTabular": true
					},
					"Lab, Absolute neutrophil count": {
						"isTabular": true
					},
					"Lab, Neutrophils": {
						"isTabular": true
					},
					"Lab, Potassium": {
						"isTabular": true
					},
					"Lab, Magnesium": {
						"isTabular": true
					},
					"Lab, Ionized Calcium": {
						"isTabular": true
					},
					"Lab, Urea": {
						"isTabular": true
					},
					"Lab, Creatinine": {
						"isTabular": true
					},
					"Lab, Glucose": {
						"isTabular": true
					},
					"Lab, Glucose (Fasting)": {
						"isTabular": true
					},
					"Lab, HbA1c": {
						"isTabular": true
					},
					"Lab, TSH": {
						"isTabular": true
					},
					"Lab, Lipase": {
						"isTabular": true
					},
					"Lab, AST (SGOT)": {
						"isTabular": true
					},
					"Lab, ALT (SGPT)": {
						"isTabular": true
					},
					"Lab, Total Bilirubin": {
						"isTabular": true
					},
					"Lab, CD4 count": {
						"isTabular": true
					},
					"Lab, Serum Albumin": {
						"isTabular": true
					},
					"HEMATOCRIT": {
						"disableAddNotes": true
					},
					"Platelets": {
						"disableAddNotes": true
					},
					"RED BLOOD CELLS": {
						"disableAddNotes": true
					},
					"WHITE BLOOD CELLS": {
						"disableAddNotes": true
					},
					"ABSOLUTE NEUTROPHIL COUNT": {
						"disableAddNotes": true
					},
					"Lab, Absolute neutrophil count other test result": {
						"disableAddNotes": true
					},
					"Lab, Neutrophils test result": {
						"disableAddNotes": true
					},
					"SERUM POTASSIUM": {
						"disableAddNotes": true
					},
					"Lab, Magnesium test result": {
						"disableAddNotes": true
					},
					"Lab, Ionized Calcium test result": {
						"disableAddNotes": true
					},
					"BLOOD UREA NITROGEN": {
						"disableAddNotes": true
					},
					"Serum creatinine (umol/L)": {
						"disableAddNotes": true
					},
					"SERUM GLUCOSE": {
						"disableAddNotes": true
					},
					"Fasting blood glucose measurement (mg/dL)": {
						"disableAddNotes": true
					},
					"glycosylated hemoglobin A measurement": {
						"disableAddNotes": true
					},
					"Thyroid stimulating hormone test": {
						"disableAddNotes": true
					},
					"Lab, Lipase test result": {
						"disableAddNotes": true
					},
					"SERUM GLUTAMIC-OXALOACETIC TRANSAMINASE": {
						"disableAddNotes": true
					},
					"TOTAL BILIRUBIN": {
						"disableAddNotes": true
					},
					"SERUM GLUTAMIC-PYRUVIC TRANSAMINASE": {
						"disableAddNotes": true
					},
					"CD4 COUNT": {
						"disableAddNotes": true
					},
					"Lab, CD4 count other result": {
						"disableAddNotes": true
					},
					"HIV VIRAL LOAD": {
						"disableAddNotes": true
					},
					"SERUM ALBUMIN": {
						"disableAddNotes": true
					},
					"Lab, Serum Albumin other": {
						"disableAddNotes": true
					},
					"Lab, Other test": {
						"allowAddMore": true
					},
					"Hemoglobin": {
						"disableAddNotes": true
					},
					"Lab, Hemoglobin g/dl": {
						"disableAddNotes": true
					},
					"Lab, RBC with other unit": {
						"disableAddNotes": true
					},
					"Lab, WBC other unit": {
						"disableAddNotes": true
					},
					"Lab, Neutrophils other test result": {
						"disableAddNotes": true
					},
					"Lab, Potassium other": {
						"disableAddNotes": true
					},
					"Lab, Magnesium other": {
						"disableAddNotes": true
					},
					"Lab, Ionized Calcium other": {
						"disableAddNotes": true
					},
					"Lab, Urea other": {
						"disableAddNotes": true
					},
					"Lab, Creatinine other": {
						"disableAddNotes": true
					},
					"Lab, Glucose other": {
						"disableAddNotes": true
					},
					"Lab, Glucose (Fasting) other": {
						"disableAddNotes": true
					},
					"Lab, Total Bilirubin other": {
						"disableAddNotes": true
					},
					"Lab Results Hemotology Template": {
						"allowAddMore": true,
						"hideAbnormalButton": true
					},
					"Lab Results Biochemistry Template": {
						"allowAddMore": true,
						"hideAbnormalButton": true
					},
					"Lab Results Serology Template": {
						"allowAddMore": true,
						"hideAbnormalButton": true
					},
					"Lab Results Pregnancy Template": {
						"allowAddMore": true
					},
					"Lab Results Other Tests Template": {
						"allowAddMore": true
					},
					"Bacteriology, Smear microscopy test results": {
						"allowAddMore": true
					},
					"Bacteriology, Culture results details": {
						"allowAddMore": true
					},
					"Bacteriology, DST result details": {
						"allowAddMore": true
					},
					"Bacteriology, Xpert test results": {
						"allowAddMore": true
					},
					"Bacteriology, Hain test/PCR results": {
						"allowAddMore": true
					},
					"Baseline, Known Drug Allergies": {
						"allowAddMore": true
					}
				},
				"uniqueId": "observation_13",
				"erroneousValue": null,
				"value": true,
				"isBoolean": true,
				"disabled": false,
				"error": false,
				"voided": false
			}, {
				"concept": {
					"uuid": "1113AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
					"name": "TUBERCULOSIS DRUG TREATMENT START DATE",
					"dataType": "Date"
				},
				"units": null,
				"label": "Treatment start date",
				"possibleAnswers": [],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": {
					"required": true
				},
				"uniqueId": "observation_14",
				"erroneousValue": null,
				"value": "${treatmentStartDate}",
				"autocompleteValue": "${treatmentStartDate}",
				"disabled": false,
				"__prevValue": "2016-08-01",
				"_value": "${treatmentStartDate}",
				"voided": false
			}, {
				"concept": {
					"uuid": "c35e626a-f9eb-401c-a7a6-e8a74bbb8837",
					"name": "TI, Treatment facility at start",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Treatment facility at start",
				"possibleAnswers": [{
					"uuid": "b31c6dab-b80f-413c-946d-29fa3f79fa3d",
					"name": {
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Other",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_15",
				"erroneousValue": null,
				"value": {
					"uuid": "b31c6dab-b80f-413c-946d-29fa3f79fa3d",
					"name": {
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Other",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "Other",
					"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
					"name": "Other",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"_value": {
					"uuid": "b31c6dab-b80f-413c-946d-29fa3f79fa3d",
					"name": {
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Other",
						"uuid": "143bcaa3-ea44-4baf-9a5d-336b95d50c1b",
						"name": "Other",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/b31c6dab-b80f-413c-946d-29fa3f79fa3d/name/143bcaa3-ea44-4baf-9a5d-336b95d50c1b?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Other",
					"resourceVersion": "1.9"
				},
				"voided": false
			}, {
				"concept": {
					"uuid": "1fd668d4-a9ed-44df-ae9a-0bbe04516aef",
					"name": "TI, Type of treatment regimen",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Type of regimen",
				"possibleAnswers": [{
					"uuid": "504e1a94-e371-4656-af71-0747fc6f1f35",
					"name": {
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Not defined",
					"resourceVersion": "1.9"
				}, {
					"uuid": "5cc18104-2dcf-4923-9170-81a6f47d0820",
					"name": {
						"display": "Only 1st line drugs",
						"uuid": "d3d9ad80-f538-4f56-957c-a5d475c7d538",
						"name": "Only 1st line drugs",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/5cc18104-2dcf-4923-9170-81a6f47d0820/name/d3d9ad80-f538-4f56-957c-a5d475c7d538"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/5cc18104-2dcf-4923-9170-81a6f47d0820/name/d3d9ad80-f538-4f56-957c-a5d475c7d538?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Only 1st line drugs",
						"uuid": "d3d9ad80-f538-4f56-957c-a5d475c7d538",
						"name": "Only 1st line drugs",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/5cc18104-2dcf-4923-9170-81a6f47d0820/name/d3d9ad80-f538-4f56-957c-a5d475c7d538"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/5cc18104-2dcf-4923-9170-81a6f47d0820/name/d3d9ad80-f538-4f56-957c-a5d475c7d538?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Only 1st line drugs",
					"resourceVersion": "1.9"
				}, {
					"uuid": "881d083f-c30e-418c-b451-a59e12715898",
					"name": {
						"display": "Regimen including 2nd line drugs",
						"uuid": "b8c597a5-4d34-42f0-9006-12944e6856d9",
						"name": "Regimen including 2nd line drugs",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/881d083f-c30e-418c-b451-a59e12715898/name/b8c597a5-4d34-42f0-9006-12944e6856d9"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/881d083f-c30e-418c-b451-a59e12715898/name/b8c597a5-4d34-42f0-9006-12944e6856d9?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Regimen including 2nd line drugs",
						"uuid": "b8c597a5-4d34-42f0-9006-12944e6856d9",
						"name": "Regimen including 2nd line drugs",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/881d083f-c30e-418c-b451-a59e12715898/name/b8c597a5-4d34-42f0-9006-12944e6856d9"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/881d083f-c30e-418c-b451-a59e12715898/name/b8c597a5-4d34-42f0-9006-12944e6856d9?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Regimen including 2nd line drugs",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_17",
				"erroneousValue": null,
				"value": {
					"uuid": "504e1a94-e371-4656-af71-0747fc6f1f35",
					"name": {
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Not defined",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "Not defined",
					"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
					"name": "Not defined",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"error": false,
				"_value": {
					"uuid": "504e1a94-e371-4656-af71-0747fc6f1f35",
					"name": {
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Not defined",
						"uuid": "ef48d116-0f15-4924-98d7-dc2fd5e04e3c",
						"name": "Not defined",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/504e1a94-e371-4656-af71-0747fc6f1f35/name/ef48d116-0f15-4924-98d7-dc2fd5e04e3c?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Not defined",
					"resourceVersion": "1.9"
				},
				"voided": false
			}, {
				"concept": {
					"uuid": "5096AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
					"name": "RETURN VISIT DATE",
					"dataType": "Date"
				},
				"units": null,
				"label": "Next visit",
				"possibleAnswers": [],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": {
					"allowFutureDates": true
				},
				"uniqueId": "observation_22",
				"erroneousValue": null,
				"value": "${treatmentNextVisitDate}",
				"autocompleteValue": "${treatmentNextVisitDate}",
				"disabled": false,
				"__prevValue": "2016-08-06",
				"_value": "${treatmentNextVisitDate}",
				"voided": false
			}, {
				"concept": {
					"uuid": "9408be14-a7af-42cd-b241-61f0bf66657f",
					"name": "TI, Reason for next assessment",
					"dataType": "Coded"
				},
				"units": null,
				"label": "Reason for next visit",
				"possibleAnswers": [{
					"uuid": "f3cacc75-c393-4ca3-97e8-1f972dc34946",
					"name": {
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Baseline",
					"resourceVersion": "1.9"
				}, {
					"uuid": "a169d2db-f8f1-4fa8-a415-593a443b53bf",
					"name": {
						"display": "2 week assessment",
						"uuid": "cd68ac2b-403b-4dfd-8eff-4707cb52d3bc",
						"name": "2 week assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a169d2db-f8f1-4fa8-a415-593a443b53bf/name/cd68ac2b-403b-4dfd-8eff-4707cb52d3bc"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a169d2db-f8f1-4fa8-a415-593a443b53bf/name/cd68ac2b-403b-4dfd-8eff-4707cb52d3bc?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "2 week assessment",
						"uuid": "cd68ac2b-403b-4dfd-8eff-4707cb52d3bc",
						"name": "2 week assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a169d2db-f8f1-4fa8-a415-593a443b53bf/name/cd68ac2b-403b-4dfd-8eff-4707cb52d3bc"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/a169d2db-f8f1-4fa8-a415-593a443b53bf/name/cd68ac2b-403b-4dfd-8eff-4707cb52d3bc?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "2 week assessment",
					"resourceVersion": "1.9"
				}, {
					"uuid": "af95de08-c15a-45ca-be33-581065103f3d",
					"name": {
						"display": "Planned monthly assessment",
						"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
						"name": "Planned monthly assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Planned monthly assessment",
						"uuid": "43b471cd-af01-459b-8d15-940e88b2c776",
						"name": "Planned monthly assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/af95de08-c15a-45ca-be33-581065103f3d/name/43b471cd-af01-459b-8d15-940e88b2c776?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Planned monthly assessment",
					"resourceVersion": "1.9"
				}, {
					"uuid": "d8f48e06-25b8-4029-bb94-65c720090cb5",
					"name": {
						"display": "Other assessment",
						"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
						"name": "Other assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Other assessment",
						"uuid": "d52426cf-57af-44ae-a023-547df87cfedb",
						"name": "Other assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/d8f48e06-25b8-4029-bb94-65c720090cb5/name/d52426cf-57af-44ae-a023-547df87cfedb?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Other assessment",
					"resourceVersion": "1.9"
				}, {
					"uuid": "41fc3e2f-bf0b-4d33-a740-bc202465ed6a",
					"name": {
						"display": "End of treatment assessment",
						"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
						"name": "End of treatment assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "End of treatment assessment",
						"uuid": "4ebcd8f0-a539-406d-b5ae-d071bbc6d541",
						"name": "End of treatment assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/41fc3e2f-bf0b-4d33-a740-bc202465ed6a/name/4ebcd8f0-a539-406d-b5ae-d071bbc6d541?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "End of treatment assessment",
					"resourceVersion": "1.9"
				}, {
					"uuid": "1b034feb-d22a-4b74-b7c8-f028aabedc28",
					"name": {
						"display": "6-month post-treatment assessment",
						"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
						"name": "6-month post-treatment assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "6-month post-treatment assessment",
						"uuid": "c37178ca-ee13-4cc8-8af6-9ada37b2c813",
						"name": "6-month post-treatment assessment",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/1b034feb-d22a-4b74-b7c8-f028aabedc28/name/c37178ca-ee13-4cc8-8af6-9ada37b2c813?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "6-month post-treatment assessment",
					"resourceVersion": "1.9"
				}],
				"groupMembers": [],
				"comment": null,
				"isObservation": true,
				"conceptUIConfig": [],
				"uniqueId": "observation_23",
				"erroneousValue": null,
				"value": {
					"uuid": "f3cacc75-c393-4ca3-97e8-1f972dc34946",
					"name": {
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Baseline",
					"resourceVersion": "1.9"
				},
				"autocompleteValue": {
					"display": "Baseline",
					"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
					"name": "Baseline",
					"locale": "en",
					"localePreferred": true,
					"conceptNameType": "FULLY_SPECIFIED",
					"links": [{
						"rel": "self",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
					}, {
						"rel": "full",
						"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
					}],
					"resourceVersion": "1.9"
				},
				"disabled": false,
				"_value": {
					"uuid": "f3cacc75-c393-4ca3-97e8-1f972dc34946",
					"name": {
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					},
					"names": [{
						"display": "Baseline",
						"uuid": "0e99da1d-15f3-4f9b-aac8-033b0a7e5405",
						"name": "Baseline",
						"locale": "en",
						"localePreferred": true,
						"conceptNameType": "FULLY_SPECIFIED",
						"links": [{
							"rel": "self",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405"
						}, {
							"rel": "full",
							"uri": "http://endtb-qa.mybahmni.org/openmrs/ws/rest/v1/concept/f3cacc75-c393-4ca3-97e8-1f972dc34946/name/0e99da1d-15f3-4f9b-aac8-033b0a7e5405?v=full"
						}],
						"resourceVersion": "1.9"
					}],
					"displayString": "Baseline",
					"resourceVersion": "1.9"
				},
				"error": false,
				"voided": false
			}],
			"comment": null,
			"isObservation": true,
			"conceptUIConfig": [],
			"uniqueId": "observation_25",
			"erroneousValue": null,
			"voided": false
		}],
		"comment": null,
		"isObservation": true,
		"conceptUIConfig": [],
		"uniqueId": "observation_26",
		"erroneousValue": null,
		"conceptSetName": "Treatment Initiation Template",
		"voided": false
	}],
	"encounterTypeUuid": "22dffad3-1a3c-4fc2-8207-a48086675e02"
}