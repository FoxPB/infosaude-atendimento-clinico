package br.edu.ifpb.monteiro.ads.infosaude.atendimento.modelo;

import br.edu.ifpb.monteiro.ads.infosaude.atendimento.enumeracoes.Estados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-23T21:47:23")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> enderecoNumero;
    public static volatile SingularAttribute<Pessoa, String> telefone1;
    public static volatile SingularAttribute<Pessoa, String> enderecoCep;
    public static volatile SingularAttribute<Pessoa, String> nome;
    public static volatile SingularAttribute<Pessoa, String> telefone2;
    public static volatile SingularAttribute<Pessoa, String> nomeDaMae;
    public static volatile SingularAttribute<Pessoa, String> cartaoSus;
    public static volatile SingularAttribute<Pessoa, String> enderecoRua;
    public static volatile SingularAttribute<Pessoa, String> rg;
    public static volatile SingularAttribute<Pessoa, String> cpf;
    public static volatile SingularAttribute<Pessoa, Long> id;
    public static volatile SingularAttribute<Pessoa, Date> dataNascimento;
    public static volatile SingularAttribute<Pessoa, String> enderecoBairro;
    public static volatile SingularAttribute<Pessoa, Estados> enderecoEstado;
    public static volatile SingularAttribute<Pessoa, String> enderecoCidade;
    public static volatile SingularAttribute<Pessoa, String> email;
    public static volatile SingularAttribute<Pessoa, String> corOuRaca;

}