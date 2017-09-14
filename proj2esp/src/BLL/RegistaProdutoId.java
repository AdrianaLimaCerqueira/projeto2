package BLL;
// Generated 14/set/2017 0:29:34 by Hibernate Tools 4.3.1



/**
 * RegistaProdutoId generated by hbm2java
 */
public class RegistaProdutoId  implements java.io.Serializable {


     private int registaId;
     private int produtoId;

    public RegistaProdutoId() {
    }

    public RegistaProdutoId(int registaId, int produtoId) {
       this.registaId = registaId;
       this.produtoId = produtoId;
    }
   
    public int getRegistaId() {
        return this.registaId;
    }
    
    public void setRegistaId(int registaId) {
        this.registaId = registaId;
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
		 if ( !(other instanceof RegistaProdutoId) ) return false;
		 RegistaProdutoId castOther = ( RegistaProdutoId ) other; 
         
		 return (this.getRegistaId()==castOther.getRegistaId())
 && (this.getProdutoId()==castOther.getProdutoId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getRegistaId();
         result = 37 * result + this.getProdutoId();
         return result;
   }   


}


