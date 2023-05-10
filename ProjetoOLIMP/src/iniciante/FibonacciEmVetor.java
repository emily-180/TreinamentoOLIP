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
public class FibonacciEmVetor {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCasoTeste, numPosicao; //variaveis do usuario
        int[] vetorResult = geraFibonacci();
        numCasoTeste = entrada.nextInt(); 
        while(numCasoTeste != 0){
            numPosicao = entrada.nextInt();
            System.out.println("Fib ("+ numPosicao +") = "+vetorResult[numPosicao]);
            numCasoTeste--;
        }       
     }
     
     public static int[] geraFibonacci(){ //gerando o vetor de fibonacci
        int antecessor=0, sucessor=1, resultado, vetor[], resultado2;
        vetor = new int[60]; 
        vetor[0]=0;
        vetor[1]=1;
        for(int i =2; i<=60-1; i++){ 
            resultado = antecessor + sucessor;
            vetor[i]=resultado;
            antecessor = sucessor;
            sucessor = resultado;
        
        }
        return vetor;
     }
}
