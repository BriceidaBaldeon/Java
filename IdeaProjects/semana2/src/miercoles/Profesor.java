package miercoles;

public class Profesor extends Persona {
    private int categoria;
    private int numCursos;
    private float salario;



    public Profesor(String nombre, String apellido, int edad, int categoria, int numCursos,float salario) {
        super(nombre, apellido, edad);
        this.categoria = categoria;
        this.numCursos = numCursos;
        this.salario = salario;
    }

    @Override//el metodo heredado lo modificamosbv
    public void saludar(String nombre) {
        System.out.println(" ° Bienvenido/a");
        System.out.println("° Hola amigo/a " + nombre);
    }

    public void descripcionProfesor() {
        System.out.println("El profesor: " + getNombre() +" "+getApellido()
                + "\n°  De edad : " + getEdad() + " años "
                + "\n° Tiene a su cargo: " + numCursos + " cursos "
                + "\n° Categoría: " + categoria);
    }

}

