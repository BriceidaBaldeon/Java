package clasesAbstractas;

public class Circulo extends Figura {
    private float radio;

    public Circulo(String color, float radio) {
        super(color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * radio);
    }
}