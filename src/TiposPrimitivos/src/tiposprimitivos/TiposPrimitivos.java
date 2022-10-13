/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

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
        float nota = 8.5f;
        String nome = "Gustavo";
        float nota1 = (float) 8.5;
        System.out.println("A nota e "+ nota);
        
        System.out.println("A nota e "+ nota1);
        
//        Print formatado , configurando a quantidade de cadas decimais
        System.out.printf ("A nota de %s %.2f \n",nome, nota);
    }
    
}
