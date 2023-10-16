package com.example.demojava7ao21.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


//@Configuration
// adding property sources to the environment.
//@PropertySource("classpath:foo.properties")
// allows us to dynamically select the right file at runtime:
//@PropertySource({
//    "classpath:persistence-${envTarget:mysql}.properties"
//})
/* multiple properties
@PropertySources({
        @PropertySource("classpath:foo.properties"),
        @PropertySource("classpath:bar.properties")
}) */

public class PropertiesWithJavaConfig {

    // inject propertie
    @Value( "${jdbc.url}" )
    private String jdbcUrl;

    // inject propertie com valor default
    @Value( "${jdbc.url:aDefaultUrl}" )
    private String jdbcUrlDefault;


    // pegando pelo Environment API
    @Autowired
    private Environment env;

    public void test() {
        env.getProperty("jdbc.url");
    }
}
