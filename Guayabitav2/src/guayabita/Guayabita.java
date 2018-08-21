/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guayabita;

/**
 *
 * @author Usuario
 */
public class Guayabita {

    private static int dados(){
        return (int) (Math.random() * 6) + 1;
    }
    
    private static int apuesta(){
        return((int) (Math.random() * 10) + 1)*100;
    }
    
    private static int jugar(int jugador1, int jugador2, int mesa){
        if(mesa==0){
           return jugar(jugador2-100,jugador1-100,mesa+200);
        }
        
        if(jugador1<=0 || jugador2<=0){
            System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
            return 0;
        } else {
             int b;
             do{
            b=apuesta();}while(jugador1<b||mesa<b);
            
             switch(dados()){
                
                case 6: 
                 
                System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                System.out.println("Dados =6, gana la apuesta minima");  
                return jugar(jugador2,jugador1+100,mesa-100);
                
                case 1:
                   
                     System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                      System.out.println("Dados =1, pierde la apuesta minima");
                return jugar(jugador2,jugador1-100,mesa+100);
               
                case 5:
                   
                     System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                      System.out.println("Dados =5, pasa turno");
                return jugar(jugador2,jugador1,mesa);
                
                case 2:
                   
                     System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                  if(2<=dados()){
                       System.out.println("Dados =2, pierde la apuesta");
                    return jugar(jugador2,jugador1-b,mesa+b);
                  }
                  else{
                      System.out.println("Dados =2, gana la apuesta");
                  return jugar(jugador2,jugador1+b,mesa-b);
                  }
                  
                  case 3:
                      
                       System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                  if(3<=dados()){
                      System.out.println("Dados =3, pierde la apuesta ");
                    return jugar(jugador2,jugador1-b,mesa+b);
                  }
                  else{
                      System.out.println("Dados =3, gana la apuesta ");
                  return jugar(jugador2,jugador1+b,mesa-b);
                  }
                  
                  case 4:
                   
                       System.out.println("Dinero jugador 1 ="+jugador1+" Dinero jugador 2 ="+jugador2+" Dinero mesa= "+mesa);
                  if(4<=dados()){
                    System.out.println("Dados =4, pierde la apuesta ");
                      return jugar(jugador2,jugador1-b,mesa+b);  
                  }
                  else{
                      System.out.println("Dados =4, gana la apuesta ");
                  return jugar(jugador2,jugador1+b,mesa-b);
                  }
                  
                  default:
                      break;
               
            }
        }
        return 0;
    }
   
    public static void main(String[] args) {
        System.out.println(jugar(1000,1000,700));
    }
    
}
