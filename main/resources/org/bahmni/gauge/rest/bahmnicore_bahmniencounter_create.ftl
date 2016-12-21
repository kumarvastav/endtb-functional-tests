{
    "locationUuid": "${object.locationUuid}",
    "patientUuid": "${object.uuid}",
    "encounterUuid": null,
    "visitUuid": null,
    "providers": [{
        "uuid": "c1c26908-3f10-11e4-adec-0800271c1b75"
        }],
    "encounterDateTime": null,
    "extensions": {
    "mdrtbSpecimen": []
    },
    "context": {},
    "visitType": "${object.visitType}",
    "bahmniDiagnoses": [
    <#list object.diagnoses as diagnosis>
        <#if diagnosis.type == "coded">
            {
                "codedAnswer": {
                    "uuid": "${diagnosis.uuid}"
                    },
                "order": "${diagnosis.order?upper_case}",
                "certainty": "${diagnosis.certainty?upper_case}",
                "existingObs": null,
                "diagnosisDateTime": null,
            <#if diagnosis.status == "Inactive">
                "diagnosisStatusConcept": {
                "name": "Ruled Out Diagnosis"
            }
        <#else>
            "diagnosisStatusConcept": null
        </#if>
        ,
        "comments": ""
            }

        <#else>
            {
                "codedAnswer": {},
                "freeTextAnswer": "${diagnosis.diagnosis}",
                "order": "${diagnosis.order?upper_case}",
                "certainty": "${diagnosis.certainty?upper_case}",
                "existingObs": null,
                "diagnosisDateTime": null,

                <#if diagnosis.status == "Inactive">
                    "diagnosisStatusConcept": {
                    "name": "Ruled Out Diagnosis"
            }
        <#else>
            "diagnosisStatusConcept": null
        </#if>
        ,
            "comments": ""
            }
        </#if>
        <#sep>,
    </#list>
    ],
    "orders": [],
    "drugOrders": [],
    "disposition": null,
    "observations": [],
    "encounterTypeUuid": "81852aee-3f10-11e4-adec-0800271c1b75"
}