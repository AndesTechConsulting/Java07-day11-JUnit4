package org.andestech.learning.rfb18.at;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {


    @Test
    public void testLogin()
    {
      Customer c =
      new Customer(" Basil ", "  TheWolf");


      assertTrue(c.getLogin().equals("BTHEWOLF"));

      assertEquals(c.getLogin(),"BTHEWOLF" );

      assertTrue(c.getLogin().compareTo("BTHEWOLF")==0);

    }

}
