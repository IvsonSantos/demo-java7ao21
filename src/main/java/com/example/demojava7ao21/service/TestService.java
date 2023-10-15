package com.example.demojava7ao21.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    /*
    Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException:
No qualifying bean of type [com.autowire.sample.FooDAO] found for dependency:
expected at least 1 bean which qualifies as autowire candidate for this dependency.
Dependency annotations:
{@org.springframework.beans.factory.annotation.Autowired(required=true)}
     */

    public class FooService {
        @Autowired(required = false)
        private FooDAO dataAccessor;
    }

}
