package contocorrente_saggese;

import java.util.Date;

public class Contocorrente_saggese {
    public static void main(String[] args) {
        Date data1 = new Date(120, 9, 21);
        Date data2 = new Date(120, 9, 15);

        Contocorrente saldo1 = new Contocorrente(2839, 2000, data1);
        Contocorrente saldo2 = new Contocorrente(6936, 1000, data2);
        
        saldo1.deposita(500);
        System.out.println("Saldo: " + saldo1.getSaldo());
        
        saldo1. preleva(1500);
        System.out.println("Saldo: " + saldo1.getSaldo());
        
        System.out.println("Differenza: " + saldo1.differenza(saldo2));
        
        System.out.println("Somma: " + saldo1.somma(saldo2));
        
        if(saldo1.isZero() == true)
            System.out.println("Il saldo è 0");
        else
            System.out.println("Il saldo non è 0");
        
        if(saldo1.isNegative() == true)
            System.out.println("Il saldo è negativo");
        else
            System.out.println("Il saldo non è negativo");
        
        if(saldo1.confronto(saldo2) == 0)
            System.out.println("I saldi sono uguali");
        else if(saldo1.confronto(saldo2) > 0)
            System.out.println("Il primo saldo è maggiore del secondo");
        else
            System.out.println("Il primo saldo è minore del secondo");
        
        System.out.println(saldo1.toString());
        
        System.out.println("Interessi: " + saldo1.interessi(5.0));
    }
}
