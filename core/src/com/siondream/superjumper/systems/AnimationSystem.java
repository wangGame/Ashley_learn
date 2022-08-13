package com.siondream.superjumper.systems;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.siondream.superjumper.components.AnimationComponent;
import com.siondream.superjumper.components.StateComponent;
import com.siondream.superjumper.components.TextureComponent;

public class AnimationSystem extends IteratingSystem {
    private ComponentMapper<AnimationComponent> animationM = ComponentMapper.getFor(AnimationComponent.class);
    private ComponentMapper<StateComponent> stateM = ComponentMapper.getFor(StateComponent.class);
    private ComponentMapper<TextureComponent> textureM = ComponentMapper.getFor(TextureComponent.class);
    public AnimationSystem(){
        super(Family.all(AnimationComponent.class,
                StateComponent.class,
                TextureComponent.class).get());
    }

    @Override
    protected void processEntity(Entity entity, float v) {
        AnimationComponent animationComponent = animationM.get(entity);
        StateComponent stateComponent = stateM.get(entity);
        TextureComponent textureComponent = textureM.get(entity);
        TextureRegion animations = animationComponent.getAnimations(stateComponent.getStatus(), stateComponent.getTime());
        textureComponent.setRegion(animations);
    }
}
