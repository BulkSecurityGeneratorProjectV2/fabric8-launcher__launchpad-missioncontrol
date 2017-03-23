package org.kontinuity.catapult.service.keycloak.api;

import org.kontinuity.catapult.base.identity.Identity;

/**
 * API on top of Keycloak
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface KeycloakService {

    /**
     * Returns the Openshift v3 {@link Identity} used for authenticating with the Openshift console
     *
     * @param token the keycloak access token
     * @return the openshift v3 token assigned to the given keycloak access token
     */
    Identity getOpenShiftIdentity(String token);

    /**
     * Returns the Github {@link Identity} used for authentication with Github
     *
     * @param token the keycloak access token
     * @return the github Identity token assigned to the given keycloak access token
     */
    Identity getGithubIdentity(String token);
}