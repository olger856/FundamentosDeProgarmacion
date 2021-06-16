package ProyectSV.src.pe.edu.upeu.util;

import java.io.BufferedReader;

import java.io.*;

public class Teclado {
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    public int leer(int valor, String msg) {
        System.out.println(msg);
        try {
            valor=Integer.parseInt(teclado.readLine());
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public long leer(long valor, String msg) {
        System.out.println(msg);
        try {
            valor=Long.parseLong(teclado.readLine());
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public double leer(double valor, String msg) {
        System.out.println(msg);
        try {
            valor=Double.parseDouble(teclado.readLine());
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        
        return valor;
    }
    public char leer(char valor, String msg) {
        System.out.println(msg);
        try {
            valor=teclado.readLine().charAt(0);
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public String leer(String valor, String msg) {
        System.out.println(msg);
        try {
            valor=String.valueOf(teclado.readLine());
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }
    public boolean leer(boolean valor, String msg) {
        System.out.println(msg);
        try {
            valor=Boolean.parseBoolean(teclado.readLine());
        } catch (Exception e) {
            valor=leer(valor, msg);
        }
        return valor;
    }

}
