
package interfaces;


public class CBox implements IBox {
    private Object objeto;
    
    public CBox (){
        this.objeto=null;
    }
    
    @Override
    public void put (Object objeto){
        this.objeto = objeto;
    }
    
    @Override 
    public Object get() {
        return this.objeto;
    }

    @Override
    public void ObtenerClase(CBox cbox) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
