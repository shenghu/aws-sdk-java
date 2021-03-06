/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * DeleteMethodRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMethodRequestMarshaller implements Marshaller<Request<DeleteMethodRequest>, DeleteMethodRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteMethodRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteMethodRequest> marshall(DeleteMethodRequest deleteMethodRequest) {

        if (deleteMethodRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMethodRequest> request = new DefaultRequest<DeleteMethodRequest>(deleteMethodRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id", deleteMethodRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "resource_id", deleteMethodRequest.getResourceId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "http_method", deleteMethodRequest.getHttpMethod());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
