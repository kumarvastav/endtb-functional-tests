package org.bahmni.gauge.rest;

import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONs {
    public static Object get(JsonNode root, Object... pathArgs) {
        if (null == root) {
            return null;
        }
        return get(root.getArray(),0, pathArgs);
    }
    public static Object get(JSONArray node, Object... pathArgs) {
        return getFromObject(node,pathArgs);
    }
    public static Object get(JSONObject node, Object... pathArgs) {
        return getFromObject(node,pathArgs);
    }

    private static Object getFromObject(Object object, Object... pathArgs) {
        for (Object pathArg : pathArgs) {
            if(null == object){
                return null;
            }
            object = getFromObject(object, pathArg);
        }
        return object;
    }
    private static Object getFromObject(Object object, Object field) {
        if (null == object) {
            return null;
        }
        if (object instanceof JSONArray && field instanceof Integer) {
            return getSafelyFromJsonArray((JSONArray) object, (Integer) field);
        }
        if (object instanceof JSONObject && field instanceof String) {
            return getSafelyFromJsonObject((JSONObject) object, (String) field);
        }
        throw new ClassCastException("Pair :{" + object + "," + field + "} cannot be cast to {JSONArray,Integer} or {JSONObject,String}");
    }
    private static Object getSafelyFromJsonArray(JSONArray array, Integer index) {
        try {
            return array.get(index);
        } catch (JSONException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    private static Object getSafelyFromJsonObject(JSONObject jsonObject, String key) {
        try {
            return jsonObject.get(key);
        } catch (JSONException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
