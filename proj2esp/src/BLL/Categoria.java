package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Integer categoriaId;
     private String nome;
     private String descricao;
     private Set produtos = new HashSet(0);

    public Categoria() {
    }

    public Categoria(String nome, String descricao, Set produtos) {
       this.nome = nome;
       this.descricao = descricao;
       this.produtos = produtos;
    }
   
    public Integer getCategoriaId() {
        return this.categoriaId;
    }
    
    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }




}


