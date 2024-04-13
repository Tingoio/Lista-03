package classes;

public class CarroCarango {
    
    private int anoCarro;

    public CarroCarango(){
    }

    public double calcDesconto() {
        if (anoCarro <= 2000) {
            return 0.12; 
        } else {
            return 0.07; 
        }
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public void setAnoCarro(int anoCarro) {
        this.anoCarro = anoCarro;
    }
}
