package model.bo;

public class ProdutoCopa {
    private int id;
    private String descricao;
    private float valor;
    private String obs;
    private char status;

    public ProdutoCopa() {
    }

    public ProdutoCopa(int id, String descricao, float valor, String obs, char status) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.obs = obs;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if ((status == 'A') || (status == 'C') || (status == 'a') || (status == 'c')) {
                this.status = status;
            } else {
                this.status = 'A';
            }
    }

    @Override
    public String toString() {
        return "ID = " + this.id + 
               "\nDescricao = " + this.descricao + 
               "\nValor = " + this.valor + 
               "\nObs = " + this.obs + 
               "\nStatus = " + this.status;
    }
}
