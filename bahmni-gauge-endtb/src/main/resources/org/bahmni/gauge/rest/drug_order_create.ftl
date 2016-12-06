{
	"locationUuid": "371df356-3f5a-11e5-b380-0050568236ae",
	"patientUuid": "${drugOrders?first.patientUuid}",
	"encounterUuid": null,
	"visitUuid": null,
	"providers": [{
		"uuid": "36b6ea1f-3f5a-11e5-b380-0050568236ae"
	}],
	"encounterDateTime": null,
	"extensions": {},
	"context": {
	    "patientProgramUuid" : "${drugOrders?first.programUuid}"
	},
	"visitType": "General",
	"bahmniDiagnoses": [],
	"orders": [],
	"drugOrders": [
	<#list drugOrders as drugOrder>
	{
		"careSetting": "OUTPATIENT",
		"drug": {
			"name": "${drugOrder.drugName}",
			"uuid": "${drugOrder.drugUuid}"
		},
		"orderType": "Drug Order",
		"dosingInstructionType": "org.openmrs.module.bahmniemrapi.drugorder.dosinginstructions.FlexibleDosingInstructions",
		"dosingInstructions": {
			"dose": "${drugOrder.dose}",
			"doseUnits": "${drugOrder.doseUnit}",
			"route": "${drugOrder.route}",
			"frequency": "${drugOrder.frequency}",
			"asNeeded": "${drugOrder.sos}",
			"administrationInstructions": "{\"instructions\":\"${drugOrder.instructions}\",\"additionalInstructions\":\"${drugOrder.additionalInstructions}\"}",
			"quantity": "${drugOrder.quantity}",
			"quantityUnits": "${drugOrder.quantityUnit}",
			"numberOfRefills": 0
		},
		"duration": "${drugOrder.duration}",
		"durationUnits": "${drugOrder.durationUnit}",
		"scheduledDate": "${drugOrder.startDate}",
		"autoExpireDate": null,
		"dateStopped": null,
		"orderGroup": {
			"orderSet": {}
		}
	}<#if drugOrder?has_next>,</#if>
	</#list>
	],
	"disposition": null,
	"observations": [],
    "encounterTypeUuid": "22dffad3-1a3c-4fc2-8207-a48086675e02"
}