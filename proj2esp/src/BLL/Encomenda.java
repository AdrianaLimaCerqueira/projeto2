package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Encomenda generated by hbm2java
 */
public class Encomenda  implements java.io.Serializable {


     private Integer encomendaId;
     private Fornecedor fornecedor;
     private Funcionario funcionario;
     private Date data;
     private Set produtoEncomendas = new HashSet(0);

    public Encomenda() {
    }

    public Encomenda(Fornecedor fornecedor, Funcionario funcionario, Date data, Set produtoEncomendas) {
       this.fornecedor = fornecedor;
       this.funcionario = funcionario;
       this.data = data;
       this.produtoEncomendas = produtoEncomendas;
    }
   
    public Integer getEncomendaId() {
        return this.encomendaId;
    }
    
    public void setEncomendaId(Integer encomendaId) {
        this.encomendaId = encomendaId;
    }
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public Set getProdutoEncomendas() {
        return this.produtoEncomendas;
    }
    
    public void setProdutoEncomendas(Set produtoEncomendas) {
        this.produtoEncomendas = produtoEncomendas;
    }




}


