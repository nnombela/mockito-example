/**
 * Copyright 2013 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.jukito.samples.modules;

import org.jukito.samples.DieselEngine;
import org.jukito.samples.Engine;

import com.google.inject.AbstractModule;

public class DieselLineModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Engine.class).to(DieselEngine.class);
    }
}
