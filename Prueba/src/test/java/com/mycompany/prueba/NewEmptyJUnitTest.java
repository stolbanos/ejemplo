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
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//     @Test(timeout = 3000)  //Indica que el test se tiene que ejecutar en 3 segundos, si no es así el Test falla
//     public void hello() {
//         System.out.println("Test metodo hello");
//         assertTrue(1 == 1);
//     }
//     
//     @Test(expected = IllegalArgumentException.class) //Si en la ejecución del método no lanza la excepción indicada el Test falla
//     public void hello1() {
//         System.out.println("TEst metodo hello1");
//         assertTrue(1 == 1);
//     }
    
    @Test
     public void hello() {
         System.out.println("Test metodo hello");
         assertTrue(1 == 1);
     }
     
     @Test
     public void hello1() {
         System.out.println("Test metodo hello1");
         assertTrue(1 == 2);
     }
}
