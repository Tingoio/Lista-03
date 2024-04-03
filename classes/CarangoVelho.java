package classes;

public class CarangoVelho {
    
    public int anoCarro;

    public CarangoVelho(int anoCarro){
        this.anoCarro = anoCarro;
    }

    public double calcDesconto() {
        if (anoCarro <= 2000) {
            return 0.12; 
        } else {
            return 0.07; 
        }
    }
}
