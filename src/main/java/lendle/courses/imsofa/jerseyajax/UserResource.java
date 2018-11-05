/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.imsofa.jerseyajax;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lendle
 */
@Path("/user/{id}")
public class UserResource {
    private static Map<String, User> db=new HashMap<String, User>();
    static{
        db.put("lendle", new User("lendle", "I don't know"));
        db.put("user1", new User("user1", "password1"));
        db.put("user2", new User("user2", "password2"));
    }
    //add getUser with:
    //1. produces MediaType.APPLICATION_JSON
    //2. PathParam("id")
    //3. return db.get(id)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") String id){
        return db.get(id);
    }
}
