package com.mycompany.app.model;

import com.mycompany.app.model.DefaultBehaviourTest;
import junit.framework.TestCase;


public class DefaultBehaviourTest extends TestCase{
    public DefaultBehaviourTest(String name){
        super(name);
    }

    public void testDefaultBehaviour3Param() throws Exception{
        AdventureBehaviour Temp = new DefaultBehaviour(10, 2, true);
        assertEquals(10, Temp.getBP());
        assertEquals(2, Temp.getBids());
        assertTrue(Temp.isFreeBid());

    }

    public void testDefaultBehaviour2Param() throws Exception{
        AdventureBehaviour Temp = new DefaultBehaviour(30, 0);
        assertEquals(30, Temp.getBP());
        assertEquals(0, Temp.getBids());
        assertFalse(Temp.isFreeBid());

    }


}

