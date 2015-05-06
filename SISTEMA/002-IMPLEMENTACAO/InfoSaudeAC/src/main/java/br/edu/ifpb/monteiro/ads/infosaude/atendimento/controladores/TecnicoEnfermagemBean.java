package br.edu.ifpb.monteiro.ads.infosaude.atendimento.controladores;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.excecoes.UBSException;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.TecnicoEnfermagem;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.servicos.TecnicoEnfermagemService;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jsf.FacesUtil;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.persistence.RollbackException;

/**
 *
 * @author elisangela
 */
@Model
public class TecnicoEnfermagemBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    FacesUtil facesUtil;

    @Inject
    private TecnicoEnfermagem tecnicoEnfermagem;

    @Inject
    private TecnicoEnfermagemService tecnicoEnfermagemService;

    @Inject
    private TecnicoEnfermagem tecnicoEnfermagemSelecionado;

    private List<TecnicoEnfermagem> tecnicos;

    public List<TecnicoEnfermagem> getTecnicos() {
        this.tecnicos = tecnicoEnfermagemService.findAll();
        return tecnicos;
    }

    public void salvar(){
        try {
            this.tecnicoEnfermagemService.save(tecnicoEnfermagem);
            tecnicoEnfermagem = new TecnicoEnfermagem();
            facesUtil.mensagemSucesso("Técnico em Enfermagem cadastrado com sucesso!");
        } catch (RollbackException ex) {
            facesUtil.mensagemErro("O CPF informado já está cadastrado. Informe outro CPF.");
        }
    }

    public void excluir() throws UBSException {
        this.tecnicoEnfermagemService.delete(tecnicoEnfermagemSelecionado);
        facesUtil.mensagemSucesso("Exclusão efetuada com sucesso!");
    }

    /*
     * Metodo que verifica se o objeto esta nulo quando for recuperado.
     * Se sim, refere-se a um novo cadastro, senao refere-se a um produto a ser editado
     */
    public boolean getEditando() {
        return this.tecnicoEnfermagem.getId() != null;
    }

    public TecnicoEnfermagem getTecnicoEnfermagemSelecionado() {
        return tecnicoEnfermagemSelecionado;
    }

    public void setTecnicoEnfermagemSelecionado(TecnicoEnfermagem tecnicoEnfermagemSelecionado) {
        this.tecnicoEnfermagemSelecionado = tecnicoEnfermagemSelecionado;
    }

    public TecnicoEnfermagem getTecnicoEnfermagem() {
        return tecnicoEnfermagem;
    }

    public void setTecnicoEnfermagem(TecnicoEnfermagem tecnicoEnfermagem) {
        this.tecnicoEnfermagem = tecnicoEnfermagem;
    }

    public TecnicoEnfermagemService getTecnicoEnfermagemService() {
        return tecnicoEnfermagemService;
    }

    public void setTecnicoEnfermagemService(TecnicoEnfermagemService tecnicoEnfermagemService) {
        this.tecnicoEnfermagemService = tecnicoEnfermagemService;
    }

}
