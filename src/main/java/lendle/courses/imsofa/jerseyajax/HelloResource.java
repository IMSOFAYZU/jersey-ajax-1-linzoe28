/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.imsofa.jerseyajax;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author lendle
 */
@Path("/hello/{username}")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String sayHello(@PathParam("username") String name){
        return "Hello, "+name;
    }
}
