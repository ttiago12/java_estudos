/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author emaiu
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        float nota = 8.5f;
//        String nome = "Gustavo";
//        float nota1 = (float) 8.5;
//        System.out.println("A nota e "+ nota);
//        
//        System.out.println("A nota e "+ nota1);
//        
////        Print formatado , configurando a quantidade de cadas decimais
//        System.out.printf ("A nota de e %s %.2f \n",nome, nota);
////       mesma formatação
//        System.out.format("A nota de e %s %.2f \n",nome, nota);
//        
//        leitura de dados
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nomeT = teclado.nextLine(); 
        System.out.println("Digite a nota");
        float nota2 = teclado.nextFloat();
        
         System.out.format("A nota de e %s %.6f \n",nomeT, nota2);
        
//         para receber numero inteiro
        int idade = teclado.nextInt();
        float salario = teclado.nextFloat();
        
    }
    
    
}
