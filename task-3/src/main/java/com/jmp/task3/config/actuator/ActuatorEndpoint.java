package com.jmp.task3.config.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customEndpoint")
public class ActuatorEndpoint {

    @ReadOperation
    public String getCustomEndpointInfo() {
        return "This is custom actuator endpoint";
    }

}
