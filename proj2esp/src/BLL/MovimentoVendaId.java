package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1



/**
 * MovimentoVendaId generated by hbm2java
 */
public class MovimentoVendaId  implements java.io.Serializable {


     private int vendaId;
     private int produtoId;

    public MovimentoVendaId() {
    }

    public MovimentoVendaId(int vendaId, int produtoId) {
       this.vendaId = vendaId;
       this.produtoId = produtoId;
    }
   
    public int getVendaId() {
        return this.vendaId;
    }
    
    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
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
		 if ( !(other instanceof MovimentoVendaId) ) return false;
		 MovimentoVendaId castOther = ( MovimentoVendaId ) other; 
         
		 return (this.getVendaId()==castOther.getVendaId())
 && (this.getProdutoId()==castOther.getProdutoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getVendaId();
         result = 37 * result + this.getProdutoId();
         return result;
   }   


}


