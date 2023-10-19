/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopotencia;


public class Sessao {
    private static Sessao instance = null;
   private Conta conta;

   private Sessao(){
   }

   public void setUsuario(Conta conta){
      this.conta = conta;
   }

   public Conta getUsuario(){
       return conta;
   }
   public static Sessao getInstance(){
         if(instance == null){
               instance = new Sessao();
         }
        return instance;
   }
}
