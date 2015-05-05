package br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Classe que representa um modelo de uma entidade a ser persistida no banco,
 * com todos os atributos relacionados.
 *
 * @author cassio
 */
@Entity
public class Enfermeiro extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "enfermeiro_coren", length = 30)
    private String coren;

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

}
