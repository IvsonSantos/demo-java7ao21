package com.example.demojava7ao21.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SetterInjection {

    private CircularDependencyA circA;

    private String message = "Hi!";

    /*
        to use setter injection (or field injection) instead of constructor injection.
        This way, Spring creates the beans, but the dependencies are not injected until they are needed.
        To solve the circular dependency
     */
    @Autowired
    public void setCircA(CircularDependencyA circA) {
        this.circA = circA;
    }

    public String getMessage() {
        return message;
    }

}
