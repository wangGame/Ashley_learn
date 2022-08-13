package com.siondream.superjumper.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class TransformComponent implements Component {
    private Vector3 position = new Vector3();
    private Vector2 scale = new Vector2();
    private float rotation = 0.0f;

    public float getRotation() {
        return rotation;
    }

    public Vector2 getScale() {
        return scale;
    }

    public Vector3 getPosition() {
        return position;
    }
}
