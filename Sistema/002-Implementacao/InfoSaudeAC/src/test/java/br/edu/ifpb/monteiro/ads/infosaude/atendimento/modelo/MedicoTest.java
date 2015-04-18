package br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author elisangela
 */
public class MedicoTest {
    
    private Medico medico;
    
    @Before
    public void setUp() {
        medico = new Medico();
        medico.setNome("João");
        medico.setCrm("4654543568");
        medico.setRg("26475828");
    }
    
    @Test
    public void testCreateObjetc() {
        System.out.println(medico.getNome());
        System.out.println(medico.getCrm());
        System.out.println(medico.getRg());
        
        assertEquals("O nome esperado deve ser João", "João", medico.getNome());
        assertEquals("O crm esperado deve ser 4654543568", "4654543568", medico.getCrm());
        assertEquals("O rg esperado deve ser 26475828", "26475828", medico.getRg());
    }
}
