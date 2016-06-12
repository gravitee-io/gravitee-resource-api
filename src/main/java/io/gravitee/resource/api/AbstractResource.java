/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.resource.api;

import io.gravitee.common.component.AbstractLifecycleComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author David BRASSELY (david at gravitee.io)
 * @author GraviteeSource Team
 */
public abstract class AbstractResource extends AbstractLifecycleComponent<Resource> implements Resource {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override protected void doStart() throws Exception {
        LOGGER.info("Initializing resource");
    }

    @Override protected void doStop() throws Exception {
        LOGGER.info("Destroying resource");
    }

    @Override
    public String name() {
        return null;
    }
}
