package com.dataManager.ReadData;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJSONFile {

    public static void main(String[] args) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader(System.getProperty("user.dir")+"/TestData/usersDetails.json"));

        JSONObject jsonObject = (JSONObject) obj;
        String userName = jsonObject.get("College").toString();
        System.out.println(userName);

    }
}
