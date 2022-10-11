package voting.online.V2.resource;

import javax.enterprise.inject.Produces;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import voting.online.V2.service.CreateUser;

/**
 *
 * @author Guilherme
 */

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
    
    @POST
    @Transactional
    public Response createUser(CreateUser userRequeste){
        return Response.ok().build();
    }
    
}
