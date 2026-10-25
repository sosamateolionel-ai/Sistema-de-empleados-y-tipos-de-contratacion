public class EmpleadoPorHora extends Empleado{

    private double tarifaPorHora;
    private double horaTrabajadas;

    public EmpleadoPorHora(String Nombre,int Dni, int Legajo, double tarifaPorHora, double horaTrabajadas ){

        super(Nombre, Dni, Legajo);

        this.tarifaPorHora = tarifaPorHora;
        this.horaTrabajadas = horaTrabajadas;

    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horaTrabajadas;
    }
}
