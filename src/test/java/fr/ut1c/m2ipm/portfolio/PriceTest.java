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
public class PriceTest {

    public PriceTest() {
    }

    @Test
    public void testConstructor() {
        Price price = new Price(new Day(1, 1), 0);
    }
}
