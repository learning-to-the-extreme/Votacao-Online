package voting.online.V1.resource;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import voting.online.V1.domain.Voting;
import voting.online.V1.service.VotingServiceV1;


/**
 *
 * @author Guilherme
 */

@Path("/votingonlineV1")
public class VotingResourceV1 {
    
    @Inject
    VotingServiceV1 serviceVoting;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voting> list(){
        return Voting.listAll();
    }
    
//    @POST
//    public void newVoting(InsertVotingOnline insertVoting) {
//        serviceVoting,newVoting(insertVoting);
//    }
    
}
