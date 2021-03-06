package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1



/**
 * ProdInventId generated by hbm2java
 */
public class ProdInventId  implements java.io.Serializable {


     private int inventarioId;
     private int produtoId;

    public ProdInventId() {
    }

    public ProdInventId(int inventarioId, int produtoId) {
       this.inventarioId = inventarioId;
       this.produtoId = produtoId;
    }
   
    public int getInventarioId() {
        return this.inventarioId;
    }
    
    public void setInventarioId(int inventarioId) {
        this.inventarioId = inventarioId;
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
		 if ( !(other instanceof ProdInventId) ) return false;
		 ProdInventId castOther = ( ProdInventId ) other; 
         
		 return (this.getInventarioId()==castOther.getInventarioId())
 && (this.getProdutoId()==castOther.getProdutoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getInventarioId();
         result = 37 * result + this.getProdutoId();
         return result;
   }   


}


