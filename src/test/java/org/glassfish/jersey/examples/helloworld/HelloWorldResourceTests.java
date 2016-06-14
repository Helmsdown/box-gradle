package org.glassfish.jersey.examples.helloworld;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.junit.Assert.assertEquals;

/**
 * Created by russb_000 on 6/13/2016.
 */
public class HelloWorldResourceTests extends JerseyTest {
    @Override
    protected Application configure() {
        return new ResourceConfig(HelloWorldResource.class);
    }

    @Test
    public void test() {
        final String hello = target("helloworld").request().get(String.class);
        assertEquals("Hello World!", hello);
    }
}
