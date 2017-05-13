package org.fastdev.rest;

import org.fastdev.domain.Customer;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by alberto on 5/12/17.
 */
@Path("/customer/")
public interface CustomerResource {
    @POST
    @Path("/add/")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    Customer addCustomer(Customer customer);
}
