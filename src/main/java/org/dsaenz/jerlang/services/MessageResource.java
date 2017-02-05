package org.dsaenz.jerlang.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/messages")
public class MessageResource {
        @GET
        @Path("/{name}")
        public String sayHello(@PathParam("name") String name) {
                String output = "Hi from Jersey REST Service: " + name;
                return output;
        }
}
