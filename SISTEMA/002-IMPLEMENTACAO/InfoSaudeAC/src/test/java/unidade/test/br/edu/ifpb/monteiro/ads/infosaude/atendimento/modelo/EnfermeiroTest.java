package unidade.test.br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo.Enfermeiro;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author elisangela
 */
public class EnfermeiroTest {
    
    private Enfermeiro enfermeiro;
    
    @Before
    public void setUp() {
        enfermeiro = new Enfermeiro();
        enfermeiro.setNome("Manoel das couves");
        enfermeiro.setCoren("3465434");
        enfermeiro.setCpf("985.237.031-60");
        enfermeiro.setRg("2854067");
        enfermeiro.setCartaoSus("700201907406630");
        enfermeiro.setCorOuRaca("Negro");
        enfermeiro.setTelefone1("(83)33333333");
        enfermeiro.setTelefone2("(83)99999999");
        enfermeiro.setEmail("enfermeiro@ubs.gov.br");
        enfermeiro.setEnderecoRua("Central park");
        enfermeiro.setEnderecoNumero("10");
        enfermeiro.setEnderecoBairro("Centro");
        enfermeiro.setEnderecoCep("58540-000");
        enfermeiro.setEnderecoCidade("Monteiro");
        
    }
    
    @Test
    public void testCreateObjetc() {
        System.out.println(enfermeiro.getNome());
        System.out.println(enfermeiro.getCoren());
        System.out.println(enfermeiro.getCpf());
        System.out.println(enfermeiro.getRg());
        System.out.println(enfermeiro.getCartaoSus());
        System.out.println(enfermeiro.getCorOuRaca());
        System.out.println(enfermeiro.getTelefone1());
        System.out.println(enfermeiro.getTelefone2());
        System.out.println(enfermeiro.getEmail());
        System.out.println(enfermeiro.getEnderecoRua());
        System.out.println(enfermeiro.getEnderecoNumero());
        System.out.println(enfermeiro.getEnderecoBairro());
        System.out.println(enfermeiro.getEnderecoCep());
        System.out.println(enfermeiro.getEnderecoCidade());
        
        assertEquals("O nome esperado deve ser Manoel das couves", "Manoel das couves", enfermeiro.getNome());
        assertEquals("O crm esperado deve ser 3465434", "3465434", enfermeiro.getCoren());
        assertEquals("O cpf esperado deve ser 985.237.031-60", "985.237.031-60", enfermeiro.getCpf());
        assertEquals("O rg esperado deve ser 2854067", "2854067", enfermeiro.getRg());
        assertEquals("O cartão sus deve ser 700201907406630", "700201907406630", enfermeiro.getCartaoSus());
        assertEquals("A cor ou raça deve ser Negro", "Negro", enfermeiro.getCorOuRaca());
        assertEquals("O telefone deve ser (83)33333333", "(83)33333333", enfermeiro.getTelefone1());
        assertEquals("O telefone deve ser (83)99999999", "(83)99999999", enfermeiro.getTelefone2());
        assertEquals("O email deve ser enfermeiro@ubs.gov.br", "enfermeiro@ubs.gov.br", enfermeiro.getEmail());
        assertEquals("A rua deve ser Central park", "Central park", enfermeiro.getEnderecoRua());
        assertEquals("O número deve ser 10", "10", enfermeiro.getEnderecoNumero());
        assertEquals("O bairro deve ser Centro", "Centro", enfermeiro.getEnderecoBairro());
        assertEquals("O cep esperado deve ser 58540-000", "58540-000", enfermeiro.getEnderecoCep());
        assertEquals("A cidade esperada deve ser Monteiro", "Monteiro", enfermeiro.getEnderecoCidade());
    }
}
