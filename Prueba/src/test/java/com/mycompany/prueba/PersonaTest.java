/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formacion
 */
public class PersonaTest {
    
    private Persona persona;
    private static Persona personaNull;
    
    
    
    public PersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        personaNull = new Persona();
    } 
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        persona = new Persona("Pepita");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void comprobarLongNombre(){
        System.out.println("Comprobar Long nombre > 5");
        assertTrue(persona.getNombre().length() > 5);
        
    }
    
    @Test
    public void comprobarNombreNull(){
        System.out.println("Comprobar nombre es null");
        assertTrue(persona.getNombre().isEmpty());
    }
    
    @Test(expected = NullPointerException.class)
    public void excepcionNombre(){
        
        String r = personaNull.getNombre().toUpperCase();
    }
    
}
