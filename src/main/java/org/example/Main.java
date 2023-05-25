package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

/*    String sampleJson = "{\"name\":\"abc\", \"age\":32}";
    SampleObject user = objectMapper.readValue(sampleJson, SampleObject.class);*/

    /*    String sampleJson = "{\"name\":\"abc\", \"age\":32, \"address\":\"test address\"}";
        SampleObject user = objectMapper.readValue(sampleJson, SampleObject.class);*/

        String sampleJson = "{\"name\":\"abc\"}";
        SampleObject user = objectMapper.readValue(sampleJson, SampleObject.class);

        System.out.println(user);

    }
}
