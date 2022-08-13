package com.siondream.superjumper.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.utils.IntMap;

public class StateComponent implements Component {
    private float time = 0.0F;
    private int status = 0;

    public void reset(){
        time = 0;
        status = 0;
    }

    public void setStatus(int status) {
        this.status = status;
        time  = 0;
    }

    public int getStatus() {
        return status;
    }

    public float getTime() {
        return time;
    }
}
