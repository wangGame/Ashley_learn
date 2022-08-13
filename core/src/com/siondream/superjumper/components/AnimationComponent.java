package com.siondream.superjumper.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.IntMap;

public class AnimationComponent implements Component {
    private IntMap<Animation> animations = new IntMap();

    public IntMap<Animation> getAnimations() {
        return animations;
    }

    public TextureRegion getAnimations(int status, float time) {
        return animations.get(status).getKeyFrame(time);
    }

}
