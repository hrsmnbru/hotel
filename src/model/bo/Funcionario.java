package model.bo;

import java.util.Date;

public class Funcionario extends Pessoa {
    private String usuario;
    private String senha;
    private String funcao;
    private String setor;

    public Funcionario() {
    }
    
    public Funcionario(int id, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String dataCadastro, String cpf, String rg, String usuario, String senha, String obs, char status, String funcao, String setor) {
        super(id, nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, dataCadastro, cpf, rg, obs, status);
        this.usuario = usuario;
        this.senha = senha;
        this.funcao = funcao;
        this.setor = setor;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public String toString() {
        return  "ID   = " + super.toString() + 
                "\nNome = " + this.getNome()+
                "\nUsuário = " + this.getUsuario()+
                "\nSenha   = " + this.getSenha();
    }
}
