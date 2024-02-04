package com.example.demojava7ao21.lombok.delegate;

import lombok.ToString;
import lombok.experimental.Delegate;

@ToString
public class User implements HasContactInformation {

    // Whichever other User-specific attributes

    @Delegate(types = {HasContactInformation.class})
    private final ContactInformationSupport contactInformation = new ContactInformationSupport();

    // User itself will implement all contact information by delegation

}
