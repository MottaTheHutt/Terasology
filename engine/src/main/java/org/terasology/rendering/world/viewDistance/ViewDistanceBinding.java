/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.rendering.world.viewDistance;

import org.terasology.config.RenderingConfig;
import org.terasology.rendering.nui.databinding.Binding;

/**
 */
public class ViewDistanceBinding implements Binding<ViewDistance> {
    private RenderingConfig config;

    public ViewDistanceBinding(RenderingConfig config) {
        this.config = config;
    }

    @Override
    public ViewDistance get() {
        switch (config.getViewDistance().getIndex()) {
            case 0:
                return ViewDistance.forIndex(0);
            case 1:
                return ViewDistance.forIndex(1);
            case 2:
                return ViewDistance.forIndex(2);
            case 3:
                return ViewDistance.forIndex(3);
            case 4:
                return ViewDistance.forIndex(4);
            case 5:
                return ViewDistance.forIndex(5);
            default:
                return ViewDistance.CUSTOM;
        }
    }

    @Override
    public void set(ViewDistance value) {
        value.apply(config);
    }

}
