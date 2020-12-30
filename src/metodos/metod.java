/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;
import static Telas.tela.jTNa;
import javax.swing.JOptionPane;
import static Telas.tela.jTNr;


/**
 *
 * @author Usuario
 */
public class metod {
 
    //número digitado
    public static int n1;
    //irão receber o valor correspondente a divisão
    public static int m1;
    public static int c1;
    public static int d1 ;
    public static int u1 ;
    //String para exibir os algarismos romanos
    public static String m2 = " ";
    public static String c2 = " ";
    public static String d2 = " ";   
    public static String u2 = " ";
    //Vetores com os algarismos romanos
    public static String m3[] = {"M", "MM", "MMM", "ĪṼ", "Ṽ", "ṼĪ", "VĪĪ", "VĪĪĪ", "ĪẌ", "Ẍ"};//não é possivél exibir os caracteres apartir de 4000
    public static String c3[] = {"C","CC", "CCC","CD","D","DC","DCC","DCCC","CM"};
    public static String d3[] = {"X", "XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    public static String u3[] = {"I", "II","III","IV","V","VI","VII","VIII","IX"};
   
    
    public void Pega(){
        n1=Integer.parseInt(jTNa.getText());
        jTNr.setText("");
       
        if(n1>3999||n1<0){
            JOptionPane.showMessageDialog(null, "SOMENTE NÚMEROS INTEIROS DE 1 ATE 4000");
            jTNa.setText("");
            jTNa.requestFocus();
        }
        else if(n1==0){
            JOptionPane.showMessageDialog(null, "O NÚMERO 0 NÃO EXISTIA NO NUMERAL ROMANO!");
            jTNa.setText("");
            jTNa.requestFocus();
        }
        else{
         Converte();
        }
    }
    
    public void Converte(){
     
        m1 = n1 / 1000;
        c1 = (n1 % 1000) / 100;
        d1 = ((n1 % 1000) % 100) / 10 ;
        u1 = ((n1 % 1000) % 100) % 10 ;
        
        
        if( m1> 0){
            m2 = m3[m1 - 1];
        }
     
        if( c1 > 0){       
            c2 = c3[c1 - 1];
        }
       
        if(u1 > 0){
            u2 = u3[u1 - 1];
        }
       
        if(d1 > 0 ){ 
            d2 = d3[d1 - 1];            
        }
        
        Exibe();
    }
    
    public void Exibe(){
     
        jTNr.setText(m2 + c2 + d2 + u2);
            
            n1 = 0;
           m1 = 0;
            c1 = 0;
            d1 = 0;
            u1 = 0;
           m2 = "";
            c2 = "";
            d2 = "";
            u2= "";
    }

}

