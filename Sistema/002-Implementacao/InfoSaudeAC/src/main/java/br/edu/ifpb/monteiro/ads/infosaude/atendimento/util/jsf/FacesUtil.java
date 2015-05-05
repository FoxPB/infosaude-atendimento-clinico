package br.edu.ifpb.monteiro.ads.infosaude.atendimento.util.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * Classe com métodos utilitários para adicionar mensagens às telas, geralmente,
 * através dos ManagedBeans.
 *
 * @author cassio
 */
public class FacesUtil {

    FacesContext facesContext = FacesContext.getCurrentInstance();

    /**
     * Método que adiciona uma mensagem com nível de severidade de
     * <b>INFORMAÇÃO/SUCESSO</b>
     *
     * @param mensagem
     */
    public void mensagemSucesso(String mensagem) {
        facesContext.addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO,
                        mensagem, mensagem));
    }

    /**
     * Método que adiciona uma mensagem com nível de severidade de <b>AVISO</b>
     *
     * @param mensagem
     */
    public void mensagemAviso(String mensagem) {
        facesContext.addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        mensagem, mensagem));
    }

    /**
     * Método que adiciona uma mensagem com nível de severidade de <b>ERRO</b>
     *
     * @param mensagem
     */
    public void mensagemErro(String mensagem) {
        facesContext.addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        mensagem, mensagem));
    }
}
