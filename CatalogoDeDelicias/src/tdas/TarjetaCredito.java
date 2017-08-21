/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdas;

/**
 *
 * @author Ramirez D
 */
import java.util.Random;
import java.util.Scanner;

public class TarjetaCredito {
    private String numero;
    private String cvc;
    private String fechaExp;
    private double saldo;

    public TarjetaCredito(String numero, String cvc, String fechaExp, double saldo) {
        this.numero = numero;
        this.cvc = cvc;
        this.fechaExp = fechaExp;
        this.saldo = saldo;
    }

    public void deposito(double dinero){
        this.setSaldo(this.saldo + dinero);
    }
    

    public boolean validarCredenciales(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su número de tarjeta: ");
        String numero = sc.nextLine();
        System.out.println("Ingrese el número CVC de su tarjeta: ");
        String cvc = sc.nextLine();
        System.out.println("Ingrese la fecha de expiración de su tarjeta (YYYY/MM/DD) : ");
        String fechaExp = sc.nextLine();
        return this.numero.equals(numero) && this.cvc.equals(cvc) && this.fechaExp.equals(fechaExp);
    }
    
    public void pagar(double monto){
        if(this.validarCredenciales()){
            if(this.saldo >= monto){
                Random rd = new Random(1000000000);
                this.saldo -= monto;
                System.out.println("El numero de su orden es: " + rd.nextInt());
            }
        }
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
