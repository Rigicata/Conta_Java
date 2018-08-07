/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.CPF = "07740427535";
        conta.agencia = "Banco do Brasil";
        conta.numero = "04584466";
        conta.saldo = 150.00;
        conta.limite = 200.00;
        Conta conta2 = new Conta();
        conta2.CPF = "07740427535";
        conta2.agencia = "Banco do Brasil";
        conta2.numero = "48815461";
        conta2.saldo = 300.00;
        conta2.limite = 500.00;
        double valortrans =Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que vc quer transferir"));
        boolean transferir= conta.TransfereConta(valortrans, conta2);
        if (transferir){
            System.out.println("Transferiu Cabeça!!!! E você tem agora: "+conta.saldo);
        }else{
            System.out.println("Não Transferiu Cabeça!!!! E você continua: "+conta.saldo);
        }
        
        
       // double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
     //   boolean saber = conta.SacaConta(saque);
        //if (saber){
          //  System.out.println("Sacou e seu saldo é: "+conta.saldo+"\n"+saber);
       // }else {
         //   System.out.println("Não sacou e seu saldo é: "+conta.saldo+"\n"+saber);
      //  }
        //double quant = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que vc quer sacar: "));
        //conta.SacaConta(quant);
       // System.out.println("O seu novo valor é: "+conta.saldo);
       // double depo = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade que vc quer depositar: "));
        //conta.SacaConta(depo);
        //System.out.println("O seu novo valor é: "+conta.saldo);
        
        
     }
    
}
