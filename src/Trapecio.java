public class Trapecio implements Figuras{
    private double lado1;
    private double lado2;
    private double altura;

    public Trapecio (double lado1, double lado2, double altura){
        super (calculararea());

        this.lado1=lado2;
        this.lado2=lado2;
        this.altura=altura;
    }
    @Override
    public double calculararea(){
        return ((lado1+lado2)*altura)/2;
    }
    
}