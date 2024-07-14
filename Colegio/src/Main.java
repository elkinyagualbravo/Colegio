public class Main {
    public static void main(String []args){
        Profesor profesor = new Profesor(4, "Guitierrez", "Matematicas");
        profesor.mostrarInformacion();
        profesor.marcarAsistencia();

        Alumno alumno = new Alumno(9.50, "Mosquera","Matematicas");
        alumno.mostrarInformacion();
        alumno.promedioFinal();
        alumno.Castigo();
    }
}
