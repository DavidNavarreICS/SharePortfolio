/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ut1c.m2ipm.portfolio;

import org.junit.jupiter.api.Test;

/**
 *
 * @author David
 */
public class ShareTest {

    public ShareTest() {
    }

    @Test
    public void testConstructor() {
        Share share = new Share("test") {
            @Override
            public float getPrice(Day day) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
