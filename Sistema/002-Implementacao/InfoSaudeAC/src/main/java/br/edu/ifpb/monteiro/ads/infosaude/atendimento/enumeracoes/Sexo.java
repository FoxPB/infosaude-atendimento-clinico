package br.edu.ifpb.monteiro.ads.infosaude.atendimento.enumeracoes;

/**
 * Contains a list with Gender, represented by a letter.
 *
 * @author cassio
 */
public enum Sexo {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}
