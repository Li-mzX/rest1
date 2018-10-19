package com.limz.rest.rest1;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("portfolios")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(PortfolioImpl.class);
    }


}
