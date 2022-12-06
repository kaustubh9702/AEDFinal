/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaustubh.base;

/**
 *
 * @author kaustubh
 */
public abstract class Identifier {
     public Integer mID;

    public Identifier(int mID) {
        this.mID = mID;
    }

    
    
    

    @Override
    public boolean equals(Object obj) {
        return mID.equals(obj);
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }
    
    public abstract void delete();
    
    
    
    
    
}
