/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound_property;

/**
 *
 * @author Din_z
 */
import java.util.Scanner;
public class Bound_Property {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        String score=" " ;
        PropertyBean source=new PropertyBean();
         ListenerI listener1= new ListenerI();
         ListenerII listener2=new ListenerII();
         source.addPropertyChangeListener(listener1);
         source.addPropertyChangeListener(listener2);
        while(score!=null){
           score=getScore();
            if(score.equals("")){
                return;}
            source.setSorce(score);
        }
       
    }
     public static String getScore() {
        String score;
        Scanner scan = new Scanner(System.in); 
        System.out.print("enter score : ");
        score = scan.nextLine();
        return score;
    }
    
}
