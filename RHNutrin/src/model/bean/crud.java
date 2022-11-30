
package model.bean;


public class crud {
    
    private int id;
    private int telefone;
    private String endereco;
    private String nome;
    private int idade;
    private String uf;
    private int carteiradetrabalho;
    private String nomedopai;
    private String nomedamae;
    private String cpf;
    private String experiencia;
    private String escolaridade;
    private String cargoesperado;
    private String identidadedegenero;
    private String ultimolocaltrabalhado;
    private int datadeaniversario;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    } 
    
     public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }
    public int gettelefone() {
        return telefone;
    }

    public void settelefone(int telefone) {
        this.telefone = telefone;
    }
     public int getcarteiradetrabalho() {
        return carteiradetrabalho;
    }

    public void setcarteiradetrabalho(int carteiradetrabalho) {
        this.carteiradetrabalho = carteiradetrabalho;
    }
    
     public String getcargoesperado() {
        return cargoesperado;
    }

    public void setcargoesperado(String cargoesperado) {
        this.cargoesperado = cargoesperado;
    }
 
    @Override
    public String toString() {
        return getNome(); 
    }

    public String getNomedopai() {
        return nomedopai;
    }

    public String getNomedamae() {
        return nomedamae;
    }

    public String getCpf() {
        return cpf;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public String getEscolaridade() {
        return escolaridade;
    }
    public String getIdentidadedegenero() {
        return identidadedegenero;
    }

    public void setIdentidadedegenero(String identidadedegenero) {
        this.identidadedegenero = identidadedegenero;
    }
    public String getUltimolocaltrabalhado() {
        return ultimolocaltrabalhado;
    }
    public void setUltimolocaltrabalhado(String ultimolocaltrabalhado) {
        this.ultimolocaltrabalhado = ultimolocaltrabalhado;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNomedopai(String nomedopai) {
        this.nomedopai = nomedopai;
    }
    public void setNomedamae(String nomedamae) {
        this.nomedamae = nomedamae;
    }
    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

  
    public int getDatadeaniversario() {
        return datadeaniversario;
    }

    public void setDatadeaniversario(int datadeaniversario) {
        this.datadeaniversario = datadeaniversario;
    }
    
}
