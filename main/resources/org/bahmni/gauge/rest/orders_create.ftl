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
    "visitType": "OPD",
    "bahmniDiagnoses": [],
    "orders": [
        <#list object.orders as order>
        {
            "concept": {
                "uuid": "${order.uuid}"
            }
        }
        <#sep>,
        </#list>
    ],
    "drugOrders": [],
    "disposition": null,
    "observations": [],
    "encounterTypeUuid": "81852aee-3f10-11e4-adec-0800271c1b75"
}