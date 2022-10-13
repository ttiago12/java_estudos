/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author emaiu
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        pegar idade e converter para um numero inteiro
//        int idade = 30;
////         convertendo a idade e mando para a string valor
//        String valor = Integer.toString(idade);
//        System.out.println(valor);
        
        String valor = "30.5";
        
//        parse siginifica converter
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
        
        
    }
    
}
