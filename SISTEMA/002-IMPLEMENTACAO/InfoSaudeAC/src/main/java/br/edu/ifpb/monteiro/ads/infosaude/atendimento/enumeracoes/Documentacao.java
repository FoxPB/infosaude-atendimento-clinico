package br.edu.ifpb.monteiro.ads.infosaude.atendimento.enumeracoes;

/**
 *
 * @author cassio
 */
public enum Documentacao {

    RG("Carteira de Identidade"),
    CARTAO_SUS("Cartão do SUS"),
    CPF("CPF"),
    COREN("COREN"),
    CRO("CRO"),
    CRM("CRM"),
    OUTRO("Outro");

     private String descricao;

    Documentacao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
