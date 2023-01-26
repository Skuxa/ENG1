package com.devcharles.piazzapanic.utility;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CookAnimator extends WalkAnimator {

    public CookAnimator() {
        super("v2/chef_a.png");
    }

    /* (non-Javadoc)
     * @see com.devcharles.piazzapanic.utility.WalkAnimator#getFrame(float, boolean, float)
     */
    @Override
    public TextureRegion getFrame(float rotation, boolean isMoving, float frameTime) {
        Animation<TextureRegion> currentAnimation = walkDown;

        if (!isMoving) {
            frameTime = 0;
        }

        Direction dir = rotationToDirection(rotation);

        switch (dir) {
            case up:
                currentAnimation = walkUp;
                break;
            case down:
                currentAnimation = walkDown;
                break;
            case left:
                currentAnimation = walkLeft;
                break;
            case right:
                currentAnimation = walkRight;
                break;
        }

        return currentAnimation.getKeyFrame(frameTime, true);
    }
}
