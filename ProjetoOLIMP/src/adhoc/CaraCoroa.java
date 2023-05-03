/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhoc;

import java.util.Scanner;

/**
 *
 * @author 49401027854
 */
public class CaraCoroa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant, num, maria=0, joao=0;
        quant = entrada.nextInt();
        entrada.nextLine(); 
        int op=quant;
        while(op!=0){
            for(int i=0;i<quant;i++){
                num = entrada.nextInt();
                entrada.nextLine();
                if(num==0)
                    maria++;
                else if(num==1)
                    joao++;
            }
            System.out.println("Mary won "+ maria +" times and John won "+ joao +" times");
            op = entrada.nextInt();
            entrada.nextLine(); 
            quant=op;
        }
    }
}
