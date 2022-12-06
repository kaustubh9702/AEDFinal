/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaustubh.chipmanufacture.employee;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author kaustubh
 */
public interface TableSerializable {
        public String[] columns();
    public Object[] row();
   
    public ImageIcon getImageIcon();
    
}
