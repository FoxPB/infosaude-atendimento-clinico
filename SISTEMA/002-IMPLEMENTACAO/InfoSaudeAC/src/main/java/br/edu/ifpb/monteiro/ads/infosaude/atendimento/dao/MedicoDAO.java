package br.edu.ifpb.monteiro.ads.infosaude.atendimento.dao;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Medico;
import java.io.Serializable;

/**
 *
 * @author elisangela
 */
public class MedicoDAO extends DaoAbstrato<Medico> implements Serializable {

    private static final long serialVersionUID = 1L;

    public MedicoDAO() {
        super(Medico.class);
    }
}
