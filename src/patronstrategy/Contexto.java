/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author melan
 */
public class Contexto {
    private StrategyCifrado estrategia;

    public Contexto() {      
    }       

    public Contexto(StrategyCifrado estrategy) {
        this.estrategia = estrategy;
    }
  
    
    public void setStrategy(StrategyCifrado estrategy){
         this.estrategia = estrategy;
   }
    

   public String encrypt(String input) throws Exception{
      return  this.estrategia.encrypt(input);
   }
    
    
}
