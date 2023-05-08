/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajobanco;

/**
 *
 * @author yamil
 */
public class TrabajoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una cuenta bancaria con saldo inicial de 5000 y tasa anual del 2%
        Cuentaherencia cuenta1 = new Cuentaherencia(5000, 2);
        
        // Realizar una deposito de 2000
        cuenta1.consignar(2000);
        
        // Realizar un retiro de 3000
        cuenta1.retirar(3000);
        
        // Calcular el interés mensual 
        cuenta1.calcularInteresMensual();
        
        // Generar el extracto mensual y mostrar en pantalla el saldo actual
        cuenta1.imprimir();
        
        
        
        
        System.out.println("---------------------------------------");
        
        
        // Crear una cuenta de ahorros con saldo inicial de 8000 y tasa anual del 3%
        cuentaAhorro cuenta2 = new cuentaAhorro(80000, 3);
        
        // Realizar un deposito de 5000
        cuenta2.consignar(5000);
        
        // Realizar un retiro de 1000
        cuenta2.retirar(1000);
        
        // Realizar otro retiro de 2000
        cuenta2.retirar(2000);
        
        // Realizar otro retiro de 3000
        cuenta2.retirar(3000);
        
        // Realizar otro retiro de 4000
        cuenta2.retirar(4000);
        // Realizar otro retiro de 5 xd
        cuenta2.retirar(5);
        
        
        cuenta2.imprimir2();
        System.out.println("---------------------------------------");
        CuentaCorriente cuenta3 =  new CuentaCorriente(10000, 5);
        cuenta3.consignar(500);
        cuenta3.retirar(2000);
        cuenta3.retirar(2000);
        cuenta3.retirar(2000);
        cuenta3.retirar(2000);
        cuenta3.retirar(2000);
        cuenta3.retirar(2000);
        cuenta3.imprimir3();
        
        
        
    }

}
