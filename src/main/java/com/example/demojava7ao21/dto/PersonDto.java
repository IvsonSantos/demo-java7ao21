package com.example.demojava7ao21.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = { "intValue" })
public class PersonDto {

    private String stringValue;
    private int intValue;
    private boolean booleanValue;

    public PersonDto() {
    }

}
