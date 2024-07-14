public class Alumno extends Usuario{
    private double promedioFinal;
    public Alumno(double promedioFinal, String nombre, String materia){
        super(nombre,materia);
        this.promedioFinal= promedioFinal;
    }
    //METODOS
    public void promedioFinal(){
        if(promedioFinal>=7){
            System.out.println("EL ESTUDIANTE APROBO");
        }else{
            System.out.println("EL ESTUDIANTE REPROBO");
        }
    }

   public void Castigo(){
        if(promedioFinal >= 7){
            System.out.println("Un dia a la playa");
        }else{
            System.out.println("limpiar la casa");
        }
    }
    //METODOS GETTER Y SETTER


    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
}