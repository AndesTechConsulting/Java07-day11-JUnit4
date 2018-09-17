package org.andestech.learning.rfb18.at;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void test222()
    {
        System.out.println("++ test222");
        //...
       assertTrue(1==1-2+3-1 );
    }

    @Test
    public void test111()
    {
        System.out.println("++ test111");
        //...
        assertEquals(1.2345, 1.234567, 0.01);

    }
}
