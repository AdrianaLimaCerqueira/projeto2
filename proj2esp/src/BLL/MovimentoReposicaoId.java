package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1



/**
 * MovimentoReposicaoId generated by hbm2java
 */
public class MovimentoReposicaoId  implements java.io.Serializable {


     private int reposicaoId;
     private int produtoId;

    public MovimentoReposicaoId() {
    }

    public MovimentoReposicaoId(int reposicaoId, int produtoId) {
       this.reposicaoId = reposicaoId;
       this.produtoId = produtoId;
    }
   
    public int getReposicaoId() {
        return this.reposicaoId;
    }
    
    public void setReposicaoId(int reposicaoId) {
        this.reposicaoId = reposicaoId;
    }
    public int getProdutoId() {
        return this.produtoId;
    }
    
    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MovimentoReposicaoId) ) return false;
		 MovimentoReposicaoId castOther = ( MovimentoReposicaoId ) other; 
         
		 return (this.getReposicaoId()==castOther.getReposicaoId())
 && (this.getProdutoId()==castOther.getProdutoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getReposicaoId();
         result = 37 * result + this.getProdutoId();
         return result;
   }   


}


