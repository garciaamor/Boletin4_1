package boletin4_1;

import javax.swing.JOptionPane;

public class Clase4_1 {
     public static int RecibirNumero(){        
        String res = JOptionPane.showInputDialog("Introduzca un numero entero: ");
        int num =Integer.parseInt(res);
        return num;
    }
    
    public static void CompararNumero(int num){
        
        if (num<500)
            JOptionPane.showMessageDialog(null,"La cantidad inicial es: "+num+"\nEL incremento es de: "+(num*0.5)+"\nLa cantidad final es de: "+(num+(num*0.5)));
        
        else if (num>=500 && num<1000)
            JOptionPane.showMessageDialog(null,"La cantidad inicial es: "+num+"\nEL incremento es de: "+(num*0.07)+"\nLa cantidad final es de: "+(num+(num*0.07)));
        else if (num>=1000 && num<=5000)
            JOptionPane.showMessageDialog(null,"La cantidad inicial es: "+num+"\nEL incremento es de: "+(num*0.15)+"\nLa cantidad final es de: "+(num+(num*0.15)));
        else 
            JOptionPane.showMessageDialog(null,"La cantidad inicial es: "+num+"\nLa disminucion es de: "+(num*0.03)+"\nLa cantidad final es de: "+(num-(num*0.03)));
    }  
    }

