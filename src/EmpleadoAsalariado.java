public class EmpleadoAsalariado extends Empleado {

    private double sueldoMensual;

    public EmpleadoAsalariado(String Nombre,int Dni, int Legajo, double sueldoMensual ){

        super(Nombre, Dni, Legajo);

        this.sueldoMensual = sueldoMensual;

    }

    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }
}
