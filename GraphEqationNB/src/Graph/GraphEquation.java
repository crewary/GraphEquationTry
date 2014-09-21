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
    public static void main(String[] args) throws InterruptedException
    {
        
        System.out.println("start");
        CalculatorJFrame newFrame = new CalculatorJFrame();
        newFrame.setVisible(true);
        Thread.sleep(10000);
        System.out.println("\n here: "+newFrame.getEquation());
    }
}//end class
