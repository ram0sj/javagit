/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrogit;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CadastroGit {

    
    public static void main(String[] args) {
       String nome, cpf, cep;
       int idade, id;
       char sexo = 0;
       
       
       Scanner leitura = new Scanner(System.in);
       
        System.out.println("Digite o nome do cliente: ");
        nome = leitura.nextLine();
        
        do{
        System.out.println("Digite o CPF do cliente: ");
        cpf = leitura.nextLine();
        }while(cpf.length() < 0 || cpf.length() > 14);
         
        do{
        System.out.println("Digite a idade do cliente: ");
        idade = leitura.nextInt();
        }while(idade <= 0 || idade > 100);
                
        do{        
        System.out.println("Digite o CEP do cliente: ");
        cep = leitura.nextLine();
        }while(cep.length() <= 0 || cep.length() > 8);
                
        System.out.println("Digite o ID do cliente: ");
        id = leitura.nextInt();
        
        do{
           try {
               System.out.println("Digite o sexo do cliente: M ou F");
               sexo = (char) System.in.read();
           } catch (IOException ex) {
               Logger.getLogger(CadastroGit.class.getName()).log(Level.SEVERE, null, ex);
           }
        }while(sexo != 'M' && sexo != 'F');
                
                
        System.out.println("O nome do cliente é: " + nome);       
        System.out.println("O CPF do cliente é: " + cpf);       
        System.out.println("A Idade do cliente é: " + idade);        
        System.out.println("O CEP do cliente é: " + cep);       
        System.out.println("O ID do cliente é: " + id);
        System.out.println("O sexo do cliente é: "+ sexo);
    }
}