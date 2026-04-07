/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjtestelistas;
 import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ComparacaoList_Util_Awt {
    
    public void exemploListAWT (){
    
    Frame frame = new Frame("Exemplo java.util.List");
    java.awt.List awtList = new java.awt.List(4,true);
    
    awtList.add("Item 1");
    awtList.add("Item 2");
    awtList.add("Item 3");
    awtList.add("Item 4");
    awtList.add("Item 5");
    awtList.add("Item 6");
    
    frame.add(awtList);
    frame.setLayout(new FlowLayout());
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.addWindowListener(new WindowAdapter(){
       public void windowClosing(WindowEvent e){
           System.exit(0);
       } 
        
        
       });
    
    
}
    
    
}
