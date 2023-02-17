package com.devcharles.gdxtest;

import com.badlogic.ashley.core.PooledEngine;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.devcharles.piazzapanic.PiazzaPanic;
import com.devcharles.piazzapanic.componentsystems.PhysicsSystem;
import com.devcharles.piazzapanic.componentsystems.PlayerControlSystem;
import com.devcharles.piazzapanic.input.KeyboardInput;
import com.devcharles.piazzapanic.utility.EntityFactory;
import com.devcharles.piazzapanic.utility.MapLoader;
import com.devcharles.piazzapanic.utility.box2d.WorldContactListener;

import box2dLight.RayHandler;

public class TestScreen implements Screen {

    public PooledEngine engine;

    private KeyboardInput kbInput;

    public World world;

    private PiazzaPanic game;

    private InputMultiplexer multiplexer;

    private MapLoader mapLoader;


    public TestScreen() {
        world = new World(new Vector2(0, 0), true);

        engine = new PooledEngine();

        EntityFactory factory = new EntityFactory(engine, world);
        EntityFactory.cutFood(null);

        kbInput = new KeyboardInput();

        engine.addSystem(new PhysicsSystem(world));
        // This can be commented in during debugging.
        // engine.addSystem(new DebugRendererSystem(world, camera));
        engine.addSystem(new PlayerControlSystem(kbInput));

        world.setContactListener(new WorldContactListener());

        // set the input processor
        multiplexer = new InputMultiplexer();
        multiplexer.addProcessor(kbInput);

    }


    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render(float delta) {
        // TODO Auto-generated method stub
        engine.update(delta);
        
    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        
    }
    
}
