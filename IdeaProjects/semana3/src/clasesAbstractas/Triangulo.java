package clasesAbstractas;

public class Triangulo extends Figura{
    private float altura;
    private float base;

    public Triangulo(String color, float altura, float base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public float area(){
        return (base*altura)/2;
    }

    @Override
    public float perimetro()
    {
        return 3*altura;//si es equilatero
    }

    @Override
    public void printColor()
    {
        System.out.println("El color del triangulo es: " + color);
    }
}
