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
package com.amazonaws.services.ecs.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * StartTaskRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTaskRequestMarshaller implements Marshaller<Request<StartTaskRequest>, StartTaskRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public StartTaskRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<StartTaskRequest> marshall(StartTaskRequest startTaskRequest) {

        if (startTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartTaskRequest> request = new DefaultRequest<StartTaskRequest>(startTaskRequest, "AmazonECS");
        request.addHeader("X-Amz-Target", "AmazonEC2ContainerServiceV20141113.StartTask");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (startTaskRequest.getCluster() != null) {
                jsonGenerator.writeFieldName("cluster").writeValue(startTaskRequest.getCluster());
            }
            if (startTaskRequest.getTaskDefinition() != null) {
                jsonGenerator.writeFieldName("taskDefinition").writeValue(startTaskRequest.getTaskDefinition());
            }
            if (startTaskRequest.getOverrides() != null) {
                jsonGenerator.writeFieldName("overrides");
                TaskOverrideJsonMarshaller.getInstance().marshall(startTaskRequest.getOverrides(), jsonGenerator);
            }

            com.amazonaws.internal.SdkInternalList<String> containerInstancesList = (com.amazonaws.internal.SdkInternalList<String>) startTaskRequest
                    .getContainerInstances();
            if (!containerInstancesList.isEmpty() || !containerInstancesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("containerInstances");
                jsonGenerator.writeStartArray();
                for (String containerInstancesListValue : containerInstancesList) {
                    if (containerInstancesListValue != null) {
                        jsonGenerator.writeValue(containerInstancesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (startTaskRequest.getStartedBy() != null) {
                jsonGenerator.writeFieldName("startedBy").writeValue(startTaskRequest.getStartedBy());
            }
            if (startTaskRequest.getGroup() != null) {
                jsonGenerator.writeFieldName("group").writeValue(startTaskRequest.getGroup());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
