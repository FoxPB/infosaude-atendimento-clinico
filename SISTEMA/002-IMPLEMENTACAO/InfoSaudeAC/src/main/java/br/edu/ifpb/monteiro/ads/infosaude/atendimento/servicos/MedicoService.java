package br.edu.ifpb.monteiro.ads.infosaude.atendimento.servicos;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.dao.MedicoDAO;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.excecoes.UBSException;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Medico;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jpa.Transactional;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 * Classe de serviço que faz chamadas aos métodos de persistência e pode conter
 * lógica de negócio e pode fazer chamadas a outras partes do sistema, caso
 * necessite.
 *
 * @author Cássio Oliveira
 */
public class MedicoService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private MedicoDAO medicoDao;

    @Transactional
    public void save(Medico medico) {
        this.medicoDao.salvar(medico);
    }

    @Transactional
    public void delete(Medico medico) throws UBSException {
        medico = findById(medico.getId());
        medicoDao.delete(medico);
    }

    public Medico findById(Long id) {
        return medicoDao.findById(id);
    }

    public List<Medico> findAll() {
        return medicoDao.findAll();
    }

}
