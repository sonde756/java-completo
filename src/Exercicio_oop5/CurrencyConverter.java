package Exercicio_oop5;

public class CurrencyConverter {

    public static double tax = 0.06;


    public static double converte(double dolarPrice, double dolarQuantity){
        return (dolarPrice * dolarQuantity) + ((dolarPrice * dolarQuantity)*tax);
    }











}
