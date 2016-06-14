package org.glassfish.jersey.examples.helloworld;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by russb_000 on 6/13/2016.
 */
@ApplicationPath("resources")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("org.glassfish.jersery.examples.helloworld");
    }
}
