/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.infosaude.atendimento.validadores;

import javax.faces.validator.ValidatorException;
import org.junit.Test;

/**
 *
 * @author wilde
 */
public class CPFValidatorTest {

    /**
     * Test of validate method, of class CPFValidator.
     */
    //Este teste passa um cpf inválido e espera uma exceção
    @Test(expected = ValidatorException.class)
    public void testValidate() {
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.validate(null, null, "00011122233");
    }

    //Este teste passa um cpf inválido e espera uma exceção
    @Test(expected = ValidatorException.class)
    public void testOneValidate() {
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.validate(null, null, "00000000000");
    }

    //Este teste passa um cpf em braco e espera uma exceção
    @Test(expected = ValidatorException.class)
    public void testTwoValidate() {
        CPFValidator cpfValidator = new CPFValidator();
        cpfValidator.validate(null, null, "");
    }

}
