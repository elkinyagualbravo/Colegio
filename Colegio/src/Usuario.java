public class Usuario {
    private String nombre;
    private String materia;

    public Usuario(String nombre, String materia){
        this.nombre= nombre;
        this.materia= materia;
    }
    //metodos
    public void mostrarInformacion(){
        System.out.println("nombre: "+ this.nombre + " materia: "+ this.materia );
    }
//getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
