<#setting datetime_format="yyyy-MM-dd'T'HH:mm:ssZ">
<#setting locale="en_US">
{
    "patient":"${patient.uuid}",
    <#if "${program.name}" == "Second-line TB treatment register">
    "program":"3ad05b62-40fa-4d2f-8e8f-4377c0e146f5",
    <#else>
    "program":"2cc0a68b-266c-47cf-8e2a-7e18c65e47f0",
    </#if>
    "dateEnrolled":"${program.dateOfRegistration?datetime("dd/MM/yyyy")?datetime}",
    "attributes":[
    {
        "attributeType":{
            "uuid":"15799645-c5ae-11e5-905b-005056826881"
        },
        "value":"${program.registrationNumber}"
    },
    {
        "attributeType":{
            "uuid":"a801946a-c693-11e5-b949-005056826881"
        },
        <#if "${program.registrationFacility}" == "Facility1, City1, Country1">
        "value":"4194807c-e628-45d9-89e0-12f8e6e44bd9"
        <#else>
        "value":"846f3073-b480-4a55-a7e0-5594ea55dc06"
        </#if>
    }
    ]
}