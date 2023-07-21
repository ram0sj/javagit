/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoragit;

import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class CalculadoraGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double n1, n2, n3;
        int opcao;
        
        System.out.println("------BEM VINDO A CALCULADORA-------");
        System.out.println("Digite o primeiro valor: ");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = scan.nextDouble();
        
        
        System.out.println("Informe a operação desejada: ");
        System.out.println("1 = SOMA");
        System.out.println("2 = SUBTRAÇÃO");
        System.out.println("3 = DIVISÃO");
        System.out.println("4 = MULTIPLICAÇÃO");
        opcao = scan.nextInt();
        switch(opcao){
            
            case 1 :
                n3 = n1 + n2;
                System.out.println(n3);
                
                break;
                
            case 2 :
                n3 = n1 - n2;
                System.out.println(n3);
                
                break;
                
            case 3 : 
                n3 = n1 / n2;
                System.out.println(n3);
                
                break;
                
            case 4 : 
                n3 = n1 * n2;
                System.out.println(n3);
                
                break;
                
            default:
                System.out.println("OPÇÃO INVÁLIDA");
          
        }
    }
    
}
