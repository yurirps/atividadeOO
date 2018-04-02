/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author Yuri
 */
public class Programa1_principal {

    
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        
        pessoa1.nome = "Yuri";
        pessoa1.idade = 26;
        
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        
        System.out.println("Nome: "+pessoa1.nome+" Idade: "+pessoa1.idade);
        
        
    }
    
}
