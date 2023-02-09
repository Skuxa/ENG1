package com.devcharles.gdxtest;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import static org.mockito.Mockito.mock;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.headless.HeadlessApplication;
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration;

public class GdxTestRunner extends BlockJUnit4ClassRunner implements ApplicationListener {

	public GdxTestRunner(Class<?> klass) throws InitializationError {
		super(klass);
		HeadlessApplicationConfiguration conf = new HeadlessApplicationConfiguration();

		new HeadlessApplication(this, conf);
		Gdx.gl = mock(GL20.class);
	}

	@Override
	public void create() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void render() {
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void dispose() {
	}

}
