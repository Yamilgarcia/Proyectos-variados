/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajobanco;

/**
 *
 * @author yamil
 */
public class Cuentaherencia {

    protected float saldo;
    protected int numConsignaciones = 0;
    protected int numRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuentaherencia(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo += cantidad;
        numConsignaciones++;
    }

    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            System.out.println("Error: no hay suficiente saldo para retirar esa cantidad.");
            return;
        }
        saldo -= cantidad;
        numRetiros++;
    }

    public float calcularInteresMensual() {
        float interesMensual = saldo * tasaAnual / 1200; // 1200 = 12 meses * 100%
        saldo += interesMensual;
        return interesMensual;
    }

    public float calcularComisionMensual() {
        if (numRetiros > 4) {
            comisionMensual = (numRetiros - 4) * 1000;
        }
        saldo = saldo - comisionMensual;
        return comisionMensual;
    }

    float generarExtractoMensual() {
        float interesMensual = calcularInteresMensual();
        comisionMensual = calcularComisionMensual();
        float ExtractoTotal = interesMensual + comisionMensual;
        return ExtractoTotal;

    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("El interes mensual es: " + generarExtractoMensual());
        System.out.println("Numero de consignaciones: " + numConsignaciones);
        System.out.println("Numero de retiros: " + numRetiros);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("El numero de transacciones realizadas es: " + (numConsignaciones + numRetiros));
    }

}
