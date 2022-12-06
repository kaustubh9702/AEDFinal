/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaustubh.chipmanufacture.employee;

import com.kaustubh.base.Identifier;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author kaustubh
 */
public class Employee extends Identifier{
    private String name;
    private String mPhoneNumner;
    private String mProfileLocation;
    
    public Employee(int id,String name, String mPhoneNumner, String mProfileLocation) {
        super(id);
        this.name = name;
        this.mPhoneNumner = mPhoneNumner;
        this.mProfileLocation = mProfileLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmPhoneNumner() {
        return mPhoneNumner;
    }

    public void setmPhoneNumner(String mPhoneNumner) {
        this.mPhoneNumner = mPhoneNumner;
    }

    public String getmProfileLocation() {
        return mProfileLocation;
    }

    public void setmProfileLocation(String mProfileLocation) {
        this.mProfileLocation = mProfileLocation;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public void delete() {
        
    }

    public Icon getImage() {
        return new ImageIcon(mProfileLocation);
    }
    
}
