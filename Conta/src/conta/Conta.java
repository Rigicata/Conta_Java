/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;


public class Conta {
   String agencia;
   String numero;
   double saldo;
   String CPF;
   double limite;
   
  public boolean SacaConta(double quantidade){
      double tot = this.limite+this.saldo;
    if(tot>=quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        
            return true;
    }else {
            return false;
    }
      

}
    public void DepositaConta(double deposito){
      double novoSaldo = this.saldo + deposito;
      this.saldo = novoSaldo;
      
    }
    
   public boolean TransfereConta (double valor,Conta conta){
       if(this.saldo>=valor){
           this.saldo-= valor;
           conta.saldo += this.saldo;
           return true;
       }
       return false;
   }
}


