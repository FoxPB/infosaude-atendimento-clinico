/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.monteiro.ads.infosaude.atendimento.conversores;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wilde
 */
public class CPFConverterTest {

    /**
     * Test of getAsObject method, of class CPFConverter.
     */
    //Este teste é aplicado passando-se a condição de "" para testar o retorno do método getAsObject 
    @Test
    public void testGetAsObject() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("", cpfConverter.getAsObject(null, null, ""));
    }

    //Este teste é aplicado passando-se a condição de null para testar o retorno do método getAsObject 
    @Test
    public void testOneGetAsObject() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals(null, cpfConverter.getAsObject(null, null, null));
    }

    //Este teste espera um retorno válido sem pontos (.) e traços(-) vindo do método getAsObject
    @Test
    public void testTwoGetAsObject() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("20784551561", cpfConverter.getAsObject(null, null, "207.845.515-61"));
    }

    /**
     * Test of getAsString method, of class CPFConverter.
     */
    //Este teste espera um retorno "" vindo do método getAsString
    @Test
    public void testGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("", cpfConverter.getAsString(null, null, ""));
    }

    //Este teste espera um retorno null vindo do método getAsString
    @Test
    public void testOneGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals(null, cpfConverter.getAsString(null, null, null));
    }

    //Este teste espera um retorno "1111" vindo do método getAsString sem efetuar nenhuma alteração na entrada
    @Test
    public void testTwoGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("1111", cpfConverter.getAsString(null, null, "1111"));
    }

    //Este teste espera um retorno "1234567890" vindo do método getAsString sem efetuar nenhuma alteração na entrada
    @Test
    public void testThreeGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("1234567890", cpfConverter.getAsString(null, null, "1234567890"));
    }

    //Este teste espera um retorno "12345678901234567890" vindo do método getAsString sem efetuar nenhuma alteração na entrada
    @Test
    public void testFourGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("12345678901234567890", cpfConverter.getAsString(null, null, "12345678901234567890"));
    }

    //Este teste espera um retorno "123.456.789-01" vindo do método getAsString efetuando alteração na entrada
    @Test
    public void testFiveGetAsString() {
        CPFConverter cpfConverter = new CPFConverter();
        assertEquals("123.456.789-01", cpfConverter.getAsString(null, null, "12345678901"));
    }

}
