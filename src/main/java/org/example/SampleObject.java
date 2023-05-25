package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

public class SampleObject {
    String name;
    Integer age;

    @JsonCreator
    public SampleObject(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "age", required = true) Integer age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SampleObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

