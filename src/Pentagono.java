public class Pentagono implements Figuras{
    private double perimetro;
    private double apotema;

    public Pentagono (double perimetro, double apotema){
        super (calculararea());

        this.perimetro=perimetro;
        this.apotema=apotema;
    }
    @Override
    public double calculararea(){
        return (perimetro*apotema)/2;
    }
    
}