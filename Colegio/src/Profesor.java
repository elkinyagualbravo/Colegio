public class Profesor extends Usuario {
    private int faltas;

    public Profesor(int faltas, String nombre, String materia){
        super(nombre,materia);
        this.faltas= faltas;
    }
    //metodos
    public void marcarAsistencia(){
        if(this.faltas>=3){
        System.out.println("Se le envio un correo");
    }else{
        System.out.println("no hay penalizacion");
    }
    }
//metodos getter y setter
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}