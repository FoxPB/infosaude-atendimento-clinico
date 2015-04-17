package br.edu.ifpb.monteiro.ads.infosaude.atendimento.servicos;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.dao.EnfermeiroDao;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.excecoes.UBSException;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Enfermeiro;
import br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jpa.Transactional;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author elisangela
 */
public class EnfermeiroService {
    
    @Inject
    private EnfermeiroDao enfermeiroDAO;

    @Transactional
    public void save(Enfermeiro enfermeiro)  throws UBSException{
        enfermeiroDAO.salvar(enfermeiro);
    }

    @Transactional
    public void delete(Enfermeiro enfermeiro)  throws UBSException{
        enfermeiro = findById(enfermeiro.getId());
        enfermeiroDAO.delete(enfermeiro);
    }

    public List<Enfermeiro> findAll() {
        return enfermeiroDAO.findAll();
    }

    public Enfermeiro findById(Long id)  throws UBSException{
        return enfermeiroDAO.findById(id);
    }
    
}
