package br.edu.ifpb.monteiro.ads.infosaude.atendimento.controladores;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.excecoes.UBSException;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Medico;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.servicos.MedicoService;
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
public class MedicoBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    FacesUtil facesUtil;

    @Inject
    private Medico medico;

    @Inject
    private MedicoService medicoService;

    @Inject
    private Medico medicoSelecionado;
    
    private List<Medico> medicosFiltrados;

    private List<Medico> medicos;

    public List<Medico> getMedicos() {
        this.medicos = medicoService.findAll();
        return medicos;
    }

    public void salvar() {
        try {
            this.medicoService.save(medico);
            medico = new Medico();
            facesUtil.mensagemSucesso("Cadastro efetuado com sucesso!");
        } catch (RollbackException ex) {
            facesUtil.mensagemErro("O CPF informado já está cadastrado. Informe outro CPF.");
        }
    }

    public void excluir() throws UBSException {
        this.medicoService.delete(medicoSelecionado);
        facesUtil.mensagemSucesso("Exclusão efetuada com sucesso!");
    }

    /*
     * Metodo que verifica se o objeto esta nulo quando for recuperado.
     * Se sim, refere-se a um novo cadastro, senao refere-se a um produto a ser editado
     */
    public boolean getEditando() {
        return this.medico.getId() != null;
    }

    public Medico getMedicoSelecionado() {
        return medicoSelecionado;
    }

    public void setMedicoSelecionado(Medico medicoSelecionado) {
        this.medicoSelecionado = medicoSelecionado;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public MedicoService getMedicoService() {
        return medicoService;
    }

    public void setMedicoService(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    public List<Medico> getMedicosFiltrados() {
        return medicosFiltrados;
    }

    public void setMedicosFiltrados(List<Medico> medicosFiltrados) {
        this.medicosFiltrados = medicosFiltrados;
    }

}
