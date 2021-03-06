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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.json.*;

/**
 * SegmentDemographicsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDemographicsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(SegmentDemographics segmentDemographics, StructuredJsonGenerator jsonGenerator) {

        if (segmentDemographics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (segmentDemographics.getAppVersion() != null) {
                jsonGenerator.writeFieldName("AppVersion");
                SetDimensionJsonMarshaller.getInstance().marshall(segmentDemographics.getAppVersion(), jsonGenerator);
            }
            if (segmentDemographics.getDeviceType() != null) {
                jsonGenerator.writeFieldName("DeviceType");
                SetDimensionJsonMarshaller.getInstance().marshall(segmentDemographics.getDeviceType(), jsonGenerator);
            }
            if (segmentDemographics.getMake() != null) {
                jsonGenerator.writeFieldName("Make");
                SetDimensionJsonMarshaller.getInstance().marshall(segmentDemographics.getMake(), jsonGenerator);
            }
            if (segmentDemographics.getModel() != null) {
                jsonGenerator.writeFieldName("Model");
                SetDimensionJsonMarshaller.getInstance().marshall(segmentDemographics.getModel(), jsonGenerator);
            }
            if (segmentDemographics.getPlatform() != null) {
                jsonGenerator.writeFieldName("Platform");
                SetDimensionJsonMarshaller.getInstance().marshall(segmentDemographics.getPlatform(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static SegmentDemographicsJsonMarshaller instance;

    public static SegmentDemographicsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDemographicsJsonMarshaller();
        return instance;
    }

}
