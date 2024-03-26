/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

/*
 * Copyright (c) 2013, Daniel Murphy
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * 	* Redistributions of source code must retain the above copyright notice,
 * 	  this list of conditions and the following disclaimer.
 * 	* Redistributions in binary form must reproduce the above copyright notice,
 * 	  this list of conditions and the following disclaimer in the documentation
 * 	  and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.almasb.fxgl.physics.box2d.callbacks;

import com.almasb.fxgl.core.math.Vec2;
import com.almasb.fxgl.physics.box2d.dynamics.Fixture;
import com.almasb.fxgl.physics.box2d.dynamics.World;

/**
 * Callback class for ray casts.
 * See {@link World#raycast(RayCastCallback, Vec2, Vec2)}
 *
 * @author Daniel Murphy
 */
public interface RayCastCallback {

    /**
     * Called for each fixture found in the query. You control how the ray cast
     * proceeds by returning a float:
     * <ul>
     *     <li>return -1: ignore this fixture and continue</li>
     *     <li>return 0: terminate the ray cast</li>
     *     <li>return fraction: clip the ray to this point</li>
     *     <li>return 1: don't clip the ray and continue</li>
     * </ul>
     *
     * @param fixture the fixture hit by the ray
     * @param point the point of initial intersection
     * @param normal the normal vector at the point of intersection
     * @param fraction fraction
     * @return -1 to filter, 0 to terminate, fraction to clip the ray for
     * closest hit, 1 to continue
     */
    float reportFixture(Fixture fixture, Vec2 point, Vec2 normal, float fraction);
}
