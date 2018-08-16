package com.example.jersey.resources;

import org.json.JSONObject;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/businessRule")
public class BusinessRuleResource {

    @Path("/generate")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response generate(String x){
        ResourceFacade facade = new ResourceFacade();
        facade.generate(new JSONObject(x));
        return null;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(String x){
        ResourceFacade facade = new ResourceFacade();
        facade.delete(new JSONObject(x));
        return null;
    }
}
