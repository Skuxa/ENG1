package com.devcharles.gdxtest;

import static org.junit.Assert.assertTrue;

import java.beans.BeanProperty;

import com.devcharles.piazzapanic.utility.Mappers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Game;
import com.devcharles.piazzapanic.PiazzaPanic;
import com.devcharles.piazzapanic.components.PlayerComponent;
import com.devcharles.piazzapanic.utility.EntityFactory;

@RunWith(GdxTestRunner.class)
public class MovementTests {
    
    @Before
    public void setup() {
        System.out.println("this setup happened \n");
    }
    
    @Test
    public void placeCook() {
        TestScreen ts = new TestScreen();

        System.out.println("test1");

        EntityFactory factory = new EntityFactory(ts.engine, ts.world);

        Entity cook = factory.createCook(0, 0).add(new PlayerComponent());
        
        assertTrue(Mappers.transform.has(cook) && Mappers.transform.get(cook).position.epsilonEquals(0,0,0));
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
}
