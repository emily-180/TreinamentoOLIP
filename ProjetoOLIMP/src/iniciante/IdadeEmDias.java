/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciante;

import java.util.Scanner;

/**
 *
 * @author 49401027854
 */
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        valor = entrada.nextInt();
        int ano=0, mes=0, dia=0;
        while(valor!= 0){
            if(valor>=365){
                ano++;
                valor = valor - 365;
            } else if(valor>=30 && valor<365){
                mes++;
                valor= valor - 30;
            } else if(valor<30 ){
                dia=valor;
                valor=0;
            }
        }
        System.out.println(ano + " ano(s)\n" + mes +" mes(es)\n" + dia + " dia(s)");
    }
}
