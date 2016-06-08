package io.gravitee.resource.api;

import javax.inject.Inject;

/**
 * @author David BRASSELY (david at gravitee.io)
 * @author GraviteeSource Team
 */
public abstract class AbstractConfigurableResource<C extends ResourceConfiguration> extends AbstractResource {

    @Inject
    private C configuration;

    public C configuration() {
        return configuration;
    }
}
