package com.portfolio.CamelProjects;


import com.portfolio.CamelProjects.processor.JsonToXml;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.springframework.stereotype.Component;
import javax.inject.Inject;

@Component
public class EcommerceNetwork extends RouteBuilder {


    @Inject
    private JsonToXml jsonToXml;

    @Override
    public void configure() throws Exception {

        from("{{input.uri}}").routeId("input")
                .to("direct:processUri");

        from("direct:processUri").routeId("jsonToXml")
                .unmarshal(new JacksonDataFormat())
                .process(jsonToXml)
                .to("{{output.uri}}");
    }

}
