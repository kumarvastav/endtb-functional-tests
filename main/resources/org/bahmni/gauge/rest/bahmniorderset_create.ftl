{
  "name": "${object.name}",
  "description": "${object.description}",
  "operator": "${object.operator}",
  "orderSetMembers": [
    <#list object.orderSetMembers as member>
    {
      "orderType": {
        "uuid": "${member.orderTypeUuid}"
      },
      "orderTemplate": "{\"drug\":{\"name\":\"${member.drugName}\",\"uuid\":\"${member.drugUuid}\"},\"dosingInstructions\":{\"dose\":${member.dose},\"doseUnits\":\"${member.doseUnit}\",\"frequency\":\"${member.frequency}\",\"route\":\"${member.route}\"},\"administrationInstructions\":\"${member.instruction}\",\"duration\":${member.duration},\"durationUnits\":\"Day(s)\",\"additionalInstructions\":\"${member.additionalInstructions}\"}",
      "concept": {
        "display": "${member.conceptName}",
        "uuid": "${member.conceptUuid}"
      }
    }<#sep>,
    </#list>
  ]
}