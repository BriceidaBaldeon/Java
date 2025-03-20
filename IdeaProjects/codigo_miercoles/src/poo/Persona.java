package poo;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    void saludo(){
        System.out.println("Buenos dpias");
    }

    void saludo2(String nombrePersona){
        System.out.println("Buenos dias"+nombrePersona);
    }

    //recibe argumentos
    //recibe una saliad
    float sumar(float a,float b){
        return a+b;
    }

    protected static String descripcionPersona(Persona persona) {
        return "El nombre de la persona es : " + persona.getNombre() + "\n" +
                "Apellido: " + persona.getApellido() + "\n" +
                "Edad: " + persona.getEdad() + " años";
    }

}
