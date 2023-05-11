package com.portfolio.CamelProjects.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


import java.util.Map;

@Component
public class JsonToXml implements Processor {

    @Override
    public void process(Exchange exchange) {
        Map<String, Object> body  = exchange.getIn().getBody(Map.class);
        String csvString = String.join(",",body.keySet());
        for(Object value : body.values()) {
            csvString = ","+value;
        }

        exchange.getIn().setBody(csvString);

    }
}
