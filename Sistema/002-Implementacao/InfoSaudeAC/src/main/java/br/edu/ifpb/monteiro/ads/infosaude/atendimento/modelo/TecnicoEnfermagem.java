package br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author cassio
 */
@Entity
public class TecnicoEnfermagem extends Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Column(name = "tecnico_enfermagem_coren", length = 50)
    private String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

}
