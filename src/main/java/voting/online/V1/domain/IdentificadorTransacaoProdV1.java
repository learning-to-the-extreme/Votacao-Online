package voting.online.V1.domain;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.profile.IfBuildProfile;

/**
 *
 * @author Guilherme
 */
public class IdentificadorTransacaoProdV1 {
    
    @Produces
    @DefaultBean
    @RequestScoped
    public IdentificadorTransacao produceTeste() {
        return new IdentificadorTransacao("Tester-");
    }
    
    @Produces
    @IfBuildProfile("prod")
    @RequestScoped
    public IdentificadorTransacao produceProd(){
        return new IdentificadorTransacao("Prod-");
    }
    
}
