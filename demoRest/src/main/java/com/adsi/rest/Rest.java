/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.rest;


import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Ricardo
 */
@Path("/rest")
public class Rest {

    

    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/get")
    public String get() {
        //TODO return proper representation object
        return "Hola Rest GET";
    }

    
}
