package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        // Llamada a operativa_cuenta con el parámetro cantidad
        operativa_cuenta(cuenta1, 2300);

        // Llamada a operativa_cuenta con el parámetro cantidad para ingresar
        operativa_cuenta(cuenta1, 695);
    }

    // Método operativa_cuenta que incluye el parámetro cantidad
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            if (cantidad < 0) {
                cuenta.retirar(Math.abs(cantidad));  // Retirar si la cantidad es negativa
            } else {
                cuenta.ingresar(cantidad);  // Ingresar si la cantidad es positiva
            }
        } catch (Exception e) {
            System.out.println("Error en operativa: " + e.getMessage());
        }
    }
}
