/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

/**
 *
 * @author Tom
 */

import java.util.Scanner;
import java.awt.*;


public class GraphEquation
{
    public static boolean isVisible = true;
    
    public static void main(String[] args) throws InterruptedException
    {
        
        System.out.println("start");
        CalculatorJFrame newFrame = new CalculatorJFrame();
        newFrame.setVisible(isVisible);
        
        while(isVisible){
            Thread.sleep(100);      //waits till graphButton is clicked.. cause the other way i know how is hard
        }
        
        
        System.out.println("\n here: " + newFrame.getEquation());
        
        
    }
    
    public static void setVisibleJFrame(boolean b){
        isVisible=b;
    }
}//end class
