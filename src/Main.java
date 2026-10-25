
void main() {

    Empleado Empleado1 = new EmpleadoAsalariado("Mateo", 713563, 12345, 10000);
    Empleado Empleado2 = new EmpleadoPorHora("Juanjo", 44587,67890, 200,48);

    System.out.print("===== Sueldo Empleado asalariado =====\n");
    System.out.println("Sueldo: " + Empleado1.calcularSalario());

    System.out.println("===== Empleado por hora =====\n");
    System.out.println("Sueldo:" + Empleado2.calcularSalario());

}
