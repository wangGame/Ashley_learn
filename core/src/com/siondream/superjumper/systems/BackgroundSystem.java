package com.siondream.superjumper.systems;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;
import com.siondream.superjumper.components.BackgroundComponent;
import com.siondream.superjumper.components.TransformComponent;

public class BackgroundSystem extends IteratingSystem {
    private OrthographicCamera camera;
    private ComponentMapper<TransformComponent> transformM;

    public BackgroundSystem(){
        super(Family.all(BackgroundComponent.class,
                TransformComponent.class).get());
        transformM = ComponentMapper.getFor(TransformComponent.class);
    }

    public void setCamera(OrthographicCamera camera) {
        this.camera = camera;
    }

    @Override
    protected void processEntity(Entity entity, float v) {
        TransformComponent transformComponent = transformM.get(entity);
        Vector3 position = transformComponent.getPosition();
        position.set(camera.position.x,camera.position.y,0);
    }
}
