package com.rca.immatriculation.model;
import org.json.JSONObject;  
import org.json.JSONArray;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class JsonStringToJsonObject implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    public JsonStringToJsonObject() {
    }


    public JSONObject  convert(String jsonString) throws Exception{  
        
    //String jsonString = "[{\"No\":\"17\",\"Name\":\"Andrew\"},{\"No\":\"18\",\"Name\":\"Peter\"}, {\"No\":\"19\",\"Name\":\"Tom\"}]";  
    JSONArray array = new JSONArray(jsonString); 
    JSONObject object = new JSONObject();
    for(int i=0; i < array.length(); i++) {  
         object = array.getJSONObject(i);  
        //System.out.println(object.getString("No"));  
        //System.out.println(object.getString("Name"));  
        }  
        
    return  object;
    } 


}