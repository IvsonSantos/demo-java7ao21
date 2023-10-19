package com.example.demojava7ao21.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "intValue" })
public class PersonDto {

    private String stringValue;
    @JsonIgnore
    private int intValue;
    private boolean booleanValue;
    private String name;

    public PersonDto() {
    }

    //@JsonGetter("name")
    public String getTheName() { // vai retornar 'theName' no JSON
        return name;
    }

}
