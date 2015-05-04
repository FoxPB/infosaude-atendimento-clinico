package br.edu.ifpb.monteiro.ads.infosaude.atendimento.controladores;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.enumeracoes.Estados;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 * 
 * @author cassio
 */
@Model
public class PessoaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    FacesUtil facesUtil;

    private final List<Estados> estados;

    public PessoaBean() {
        estados = Arrays.asList(Estados.values());
    }

    public List<Estados> getEstados() {
        return estados;
    }
    
    public void verificaSeEmailValido(String email){
        if(!email.matches("[A-Za-z0-9\\._-]+@[A-Za-z]+\\.[A-Za-z]+")){
            facesUtil.mensagemErro("E-mail inválido. Digite um e-mail on formato: usuario@dominio");
        } else{
            facesUtil.mensagemSucesso("Sucesso!");
        }
    }

}
