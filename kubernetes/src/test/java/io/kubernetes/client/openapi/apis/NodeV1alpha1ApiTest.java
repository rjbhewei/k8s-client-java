/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1alpha1RuntimeClass;
import io.kubernetes.client.openapi.models.V1alpha1RuntimeClassList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NodeV1alpha1Api
 */
@Ignore
public class NodeV1alpha1ApiTest {

    private final NodeV1alpha1Api api = new NodeV1alpha1Api();

    
    /**
     * 
     *
     * create a RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRuntimeClassTest() throws ApiException {
        V1alpha1RuntimeClass body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1alpha1RuntimeClass response = api.createRuntimeClass(body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionRuntimeClassTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String dryRun = null;
        String fieldSelector = null;
        Integer gracePeriodSeconds = null;
        String labelSelector = null;
        Integer limit = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteCollectionRuntimeClass(pretty, allowWatchBookmarks, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, timeoutSeconds, watch, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRuntimeClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        String dryRun = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1DeleteOptions body = null;
        V1Status response = api.deleteRuntimeClass(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listRuntimeClassTest() throws ApiException {
        String pretty = null;
        Boolean allowWatchBookmarks = null;
        String _continue = null;
        String fieldSelector = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1alpha1RuntimeClassList response = api.listRuntimeClass(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchRuntimeClassTest() throws ApiException {
        String name = null;
        Object body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        Boolean force = null;
        V1alpha1RuntimeClass response = api.patchRuntimeClass(name, body, pretty, dryRun, fieldManager, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRuntimeClassTest() throws ApiException {
        String name = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1alpha1RuntimeClass response = api.readRuntimeClass(name, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified RuntimeClass
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceRuntimeClassTest() throws ApiException {
        String name = null;
        V1alpha1RuntimeClass body = null;
        String pretty = null;
        String dryRun = null;
        String fieldManager = null;
        V1alpha1RuntimeClass response = api.replaceRuntimeClass(name, body, pretty, dryRun, fieldManager);

        // TODO: test validations
    }
    
}
