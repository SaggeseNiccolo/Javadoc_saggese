package contocorrente_saggese;

import java.time.Instant;
import java.util.Date;

public class Contocorrente {
    
    //attributi
    private int numero_conto;
    private int saldo;
    private Date data_apertura;
    
    //costruttori
    public Contocorrente(int saldo){
        saldo = 0;
    }
    
    public Contocorrente(int numero_conto, int saldo , Date data_apertura){
        this.numero_conto = numero_conto;
        this.saldo = saldo;
        this.data_apertura = data_apertura;
    }
    
    //metodi get
    public int getNumero_conto(){
        return numero_conto;
    }
    
    public int getSaldo(){
        return saldo;
    }
    
    public Date getData_apertura(){
        return data_apertura;
    }
    
    //metodi set
    public void setNumero_conto(int numero_conto){
        this.numero_conto = numero_conto;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public void setData_apertura(Date data_apertura){
        this.data_apertura = data_apertura;
    }
    
    //metodi
    public int deposita(int x){
        saldo += x;
        return saldo;
    }
    
    public int preleva(int x){
        saldo -= x;
        return saldo;
    }
    
    public int differenza(Contocorrente x){
        return saldo - x.saldo;
    }
    
    public int somma(Contocorrente x){
        return saldo + x.saldo;
    }
    
    public boolean isZero(){
        if(saldo == 0)
            return true;
        else
            return false;
    }
    
    public boolean isNegative(){
        if(saldo < 0)
            return true;
        else
            return false;
    }
    
    public int confronto(Contocorrente x){
        if(saldo == x.saldo)
            return 0;
        else if(saldo > x.saldo)
            return 1;
        else
            return -1;
    }
    
    public String toString(){
        String contocorrente = "Numero conto: " + numero_conto + " Saldo: " + saldo + " Data apertura: " + data_apertura;
        return contocorrente;
    }
    
    public double interessi(double interesse){
        Date data_corrente = Date.from(Instant.now());
        long giorni_trascorsi = (data_corrente.getTime() - data_apertura.getTime()) / 1000 / 60 / 60 / 24;
        double interessi = (saldo * interesse / 100) / 365 * giorni_trascorsi;
        return interessi;
    }
}
