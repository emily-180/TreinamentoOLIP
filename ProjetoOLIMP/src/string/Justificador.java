package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 49401027854
 */
public class Justificador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant;
        String palavra;
        List<String> palavras = new ArrayList<String>();
        quant = entrada.nextInt();
        entrada.nextLine(); 
        int op=quant;
        while(op!=0){
            for(int i=0;i<quant;i++){
                palavra = entrada.nextLine();
                palavras.add(palavra);
            }
            palavras.add(" ");
            
            op = entrada.nextInt();
            entrada.nextLine(); 
            quant=op;
        }
        //mostrarPalavras(palavras);
        alinharPalavrasDireita(palavras);
    }
    public static void mostrarPalavras(List<String> palavras) {
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
    
    public static void alinharPalavrasDireita(List<String> palavras) {
        int tamanhoMaximo = 0;
        for (String palavra : palavras) {
            if (palavra.length() > tamanhoMaximo) {
                tamanhoMaximo = palavra.length();
            }
        }
        
        for (String palavra : palavras) {
            int espacosAdicionais = tamanhoMaximo - palavra.length();
             if (espacosAdicionais > 0) {
                System.out.printf("%" + espacosAdicionais + "s%s\n", "", palavra);
            } else {
                System.out.println(palavra);
             }
        }
    }
}
 