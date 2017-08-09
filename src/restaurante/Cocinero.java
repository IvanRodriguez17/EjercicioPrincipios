package restaurante;

/**
 *
 * @author ivanr
 */
public class Cocinero {
    
    private Comida alimento;
    
    private Bebida iBebida;

    
    public Comida getAlimento() {
        return alimento;
    }

    public void setAlimento(Comida alimento) {
        this.alimento = alimento;
    }

    public Bebida getiBebida() {
        return iBebida;
    }

    public void setiBebida(Bebida iBebida) {
        this.iBebida = iBebida;
    }

    
    public Comida crearComida(String tipo){
        
        switch(tipo){
            case "1":
                this.alimento = new Pizza();
                break;
            case "2":
                this.alimento = new Hamburguesa();
                break;
            case "3":
                this.alimento = new PerroCaliente();
                break;    
        }
        
        return alimento;
    }
    
    public Bebida crearBebida(String tipo){
        
        switch(tipo){
            case "1":
                this.iBebida = new Jugo();
                break;
            case "2":
                this.iBebida = new Gaseosa();
                break;
        }
        
        return iBebida;
    }
}
