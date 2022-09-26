package voting.online.V1.domain;

import java.time.Instant;
import java.util.Random;

/**
 *
 * @author Guilherme
 */
class IdentificadorTransacao {
    
    private String prefixo;
    private int idTransacao;
    private Instant inicio;
    
    public IdentificadorTransacao(String prefixo) {
        super();
        this.prefixo = prefixo;
        this.idTransacao = new Random().nextInt();
        this.inicio = Instant.now();
    }

    public String getIdentificacaoTransacao() {
        return prefixo + idTransacao + " - " + inicio;
    }
}
