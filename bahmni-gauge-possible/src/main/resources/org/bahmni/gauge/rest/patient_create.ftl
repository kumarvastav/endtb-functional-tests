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
                {
                    "address1": "${patient.ward}",
                    "cityVillage": "${patient.municipality}",
                    "countyDistrict": "${patient.district}",
                    "country": "${patient.country}"
                }
            ],
            "birthdate": "${patient.dateOfBirth}",
            "gender": "${patient.gender}",
            "birthtime": null,
            "attributes": [],
            "deathDate": null,
            "causeOfDeath": ""
        },
        "identifiers": [
            {
                "identifierSourceUuid": "0d52390d-6971-47e3-809c-c5496e08161d",
                "identifierPrefix": "SEC",
                "identifierType": "e85bd464-66c7-4666-aaf1-b7ae0e54ee76",
                "preferred": false,
                "voided": false
            },
            {
                "identifierSourceUuid": "7f74b759-9a45-11e4-9783-005056822b0b",
                "identifierPrefix": "${patient.prefix}",
                "identifierType": "24142e16-28f1-11e4-86a0-005056822b0b",
                "preferred": true,
                "voided": false
            }
        ]
    },
    "relationships": []
}