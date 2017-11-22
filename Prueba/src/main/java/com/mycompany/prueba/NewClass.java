/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author formacion
 */
public class NewClass {
    
    private Integer x;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public NewClass(Integer x) {
        this.x = x;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.x);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NewClass other = (NewClass) obj;
        if (!Objects.equals(this.x, other.x)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "NewClass{" + "x=" + x + '}';
    }
    private static final Logger LOG = Logger.getLogger(NewClass.class.getName());
    
}
