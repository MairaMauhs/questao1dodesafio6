/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1dodesafio6;

/**
 *
 * @author AliraMaria
 */
public class Questao1dodesafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
    Em um laboratório usam-se dois tipos de cobaias: ratos e coelhos. O código
    para ratos é 1 e para coelhos, 2. Foram feitas 15 experiências, nas quais 
    foram utilizados um dos tipos de cobaias. Faça um algoritmo que leia, para 
    cada uma das experiências, o código da cobaia utilizada e a quantidade de 
    cobaias. Deseja-se saber: o total de cobaias utilizadas, o total de ratos, 
    o total de coelhos e o percentual de cada cobaia.
    */
    public static void main(String[] args) {
        int cont, cod, quant, acRatos, acCoelhos; // acRatos= Ratos, acCoelhos= Coelhos
        acRatos = 0; acCoelhos=0;
        //cont=cont+1; cont++;
        for(cont=1; cont<=15;cont++){
         cod = Integer.parseInt(JOptionPane.showInputDialog("Qual a cobaia "
                 + "você quer?\n1 - Rato\n2 - Coelho\nEscolha:"));
         if(cod == 1){
             quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos ratos "
                 + "você quer?"));
             acRatos+=quant; //acRatos = acRatos + quant;
         }else if(cod == 2){
           quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos coelhos "
                 + "você quer?"));
             acCoelhos += quant; //acCoelhos = acCoelhos + quant;
         }else{
             JOptionPane.showMessageDialog(null, "Código inválido apenas 1 ou 2");
             cont--;
         }//fim do if 
        }//fim do loop 
         JOptionPane.showMessageDialog(null, "Foram utilizados "+(acCoelhos+acRatos)
                 +" cobaias no total\n"
                 + "Total de Ratos: "+acRatos //vai mostrar a quantidade de ratos que a pessoa colocar
                 +" - "+(acRatos/(double)(acRatos+acCoelhos)*100)+"%"//conta que vai permitir a resposta do percentual 
                 + "\nTotal de Coelhos: "+acCoelhos //vai mostrar a quantidade de Coelhos que a pessoa digitar
                 +" - "+(acCoelhos/(double)(acRatos+acCoelhos)*100)+"%"//conta que vai permitir a resposta do percentual 
                    );
    }
    
}
