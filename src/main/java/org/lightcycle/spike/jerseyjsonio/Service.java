package org.lightcycle.spike.jerseyjsonio;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("home")
public class Service {
    @POST
    @Path("service")
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleResponseObject service(ExampleRequestObject param) {
        return new ExampleResponseObject(param, "so metal", 666);
    }
}
