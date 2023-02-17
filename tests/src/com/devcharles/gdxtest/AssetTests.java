package com.devcharles.gdxtest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import com.badlogic.gdx.Gdx;

@RunWith(GdxTestRunner.class)
public class AssetTests {

    @Test
    public void alwaysTrueTest() {
        assertTrue("This test should pass every time", true);
    }

    @Test
    public void bucketAssetTest() {
        //System.out.println(Gdx.files.internal("bucket.png"));
        assertTrue("Passes if chef exists", Gdx.files.internal("../assets/bucket.png").exists());
    }

}
