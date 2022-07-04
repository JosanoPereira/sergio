/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sergioprova;

import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author josanopereira
 */
public class SergioProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercício 1
        Scanner ler = new Scanner(System.in);
//        int qtd_produtos;
//        float valor_pagar;
//        float total_compras = 0;
//        
//        System.out.println("Quantos produtos o Cliente Comprou? ");
//        qtd_produtos = ler.nextInt();
//        for (int i = 1; i <= qtd_produtos; i++) {
//            valor_pagar = ler.nextFloat();
//            System.out.println("Valor do produto "+i+" é "+valor_pagar);
//            total_compras += valor_pagar;
//        }
//        System.out.println("O Cliente deve pagar "+total_compras);

        int ano_nascimento;
        System.out.println("Em que ano você nasceu? ");
        ano_nascimento = ler.nextInt(); 
        int idade;
        int ano_atual = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = ano_nascimento; i <= ano_atual; i++) {
            idade  = i - ano_nascimento;
            if (i == ano_atual)
                System.out.println("Em "+i+" eu tenho "+idade+" anos de idade");
            else
                System.out.println("Em "+i+" eu tinha "+idade+" anos de idade");
        }
    }
    
}
