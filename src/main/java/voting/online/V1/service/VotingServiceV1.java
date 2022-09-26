package voting.online.V1.service;

import io.quarkus.arc.Lock;
import io.quarkus.arc.Lock.Type;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import voting.online.V1.domain.IdentificadorTransacaoProdV1;
/**
 *
 * @author Guilherme
 */

@Lock
@ApplicationScoped
public class VotingServiceV1 {
    
    @Inject
    IdentificadorTransacaoProdV1 domainIdentificaTransacao;
    
//    @Lock(value = Type.READ, time = 50, unit = TimeUnit.SECONDS)
//    public void List<Voting> list(){
//    }
//    
//    @Transactional
//    public void novaFruta(domainIdentificaTransacao insertTeste){
//
//    }
    
}
