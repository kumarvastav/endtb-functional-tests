package org.bahmni.endtb.page;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class CreatePatientUsingUnirestSpec {

    @Step("Create API Patient")
    public void createPatient() throws UnirestException {

        HttpResponse<JsonNode> response = Unirest.post("https://endtb.twhosted.com/openmrs/ws/rest/v1/person")
                .basicAuth("superman", "Admin123")
                .header("content-type", "application/json")
                .body("{\"gender\": \"M\", \"names\": [{\"givenName\":\"Joe\", \"familyName\":\"Smith\"}]}")
                .asJson();
        Assert.assertEquals(201, response.getStatus());

        HttpResponse<JsonNode> createPatient = Unirest.post("https://endtb.twhosted.com/openmrs/ws/rest/v1/patient")
                .header("content-type", "application/json")
                .body("{\"person\": \"" + response.getBody().getObject().get("uuid") + "\", \"identifiers\": [{\"identifier\":\"1234\", \"identifierType\":\"8967f9d3-3a91-11e5-b380-0050568236ae\", \"location\":\"371df356-3f5a-11e5-b380-0050568236ae\", \"preferred\":true}]}\n")
                .asJson();

        Assert.assertEquals(201, createPatient.getStatus());
    }
}
