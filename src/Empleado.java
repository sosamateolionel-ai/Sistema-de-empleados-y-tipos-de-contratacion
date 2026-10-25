public abstract class Empleado {

    private String Nombre;
    private int Dni;
    private int Legajo;

    public Empleado(String Nombre,int Dni ,int Legajo ){

       this.Nombre = Nombre;
       this.Dni = Dni;
       this.Legajo = Legajo;

    }

    public abstract double calcularSalario();

}
