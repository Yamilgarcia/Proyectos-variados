/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobanco;

/**
 *
 * @author yamil
 */
public class CuentaCorriente extends Cuentaherencia {

    protected float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);

    }

    public void retirar(float cantidad) {
        saldo -= cantidad;
        if (saldo < 0) {
            sobregiro += Math.abs(saldo);
            saldo = 0;
        }
        numRetiros++;
    }

    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            sobregiro -= cantidad;
            if (sobregiro < 0) {
                saldo -= Math.abs(sobregiro);
                sobregiro = 0;
            }
        }
    }
    
    public void Extracto(){
        super.generarExtractoMensual();
        float comisionMensual = calcularComisionMensual();
    System.out.println("Comisión mensual: " + comisionMensual);
    }

    public void imprimir3() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comision mensual: " + calcularComisionMensual());
        System.out.println("Número de transacciones realizadas: " + (numConsignaciones + numRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}
