/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobanco;

/**
 *
 * @author yamil
 */

    public class cuentaAhorro extends Cuentaherencia {
    private boolean activa;
    
    public cuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }
    
    
    public void consignar(float cantidad) {
        if (!activa) {
            System.out.println("Error: la cuenta de ahorros está inactiva.");
            return;
        }
        super.consignar(cantidad);
    }
    
    
    public void retirar(float cantidad) {
        if (!activa) {
            System.out.println("Error: la cuenta de ahorros está inactiva.");
            return;
        }
        super.retirar(cantidad);
    }
    
    
    public float calcularComisionMensual() {
    float comisionMensual = super.calcularComisionMensual();
    if (saldo < 10000) {
        activa = false;
        comisionMensual += 1000 * (numRetiros - 4);
        if (numRetiros > 4) {
            System.out.println("Se ha cobrado una comisión adicional de " + comisionMensual + " por retiros adicionales.");
        }
    } else {
        activa = true;
    }
    saldo -= comisionMensual;
    return comisionMensual;
}
    
    
     public void imprimir2() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("El interes mensual es: " + generarExtractoMensual());
        System.out.println("Numero de consignaciones: " + numConsignaciones);
        System.out.println("Numero de retiros: " + numRetiros);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("El numero de transacciones realizadas es: " + (numConsignaciones + numRetiros));
    }
    
}
