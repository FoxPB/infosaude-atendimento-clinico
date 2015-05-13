package br.edu.ifpb.monteiro.ads.infosaude.atendimento.dao;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Pessoa;
import java.io.Serializable;

/**
 *
 * @author Cássio Oliveira <cassio@cassioliveira.com.br>
 */
public class PessoaDao extends DaoAbstrato<Pessoa> implements Serializable{
    
    private static final long serialVersionUID = 1L;

    public PessoaDao() {
        super(Pessoa.class);
    }

}
