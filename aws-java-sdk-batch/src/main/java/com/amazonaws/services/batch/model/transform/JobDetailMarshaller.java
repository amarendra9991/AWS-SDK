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
package com.amazonaws.services.batch.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.batch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobDetailMarshaller {

    private static final MarshallingInfo<String> JOBNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobName").build();
    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobId").build();
    private static final MarshallingInfo<String> JOBQUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("jobQueue").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<Long> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("createdAt").build();
    private static final MarshallingInfo<Long> STARTEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("startedAt").build();
    private static final MarshallingInfo<Long> STOPPEDAT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stoppedAt").build();
    private static final MarshallingInfo<List> DEPENDSON_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("dependsOn").build();
    private static final MarshallingInfo<String> JOBDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("jobDefinition").build();
    private static final MarshallingInfo<Map> PARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("parameters").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("container").build();

    private static final JobDetailMarshaller instance = new JobDetailMarshaller();

    public static JobDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobDetail jobDetail, ProtocolMarshaller protocolMarshaller) {

        if (jobDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobDetail.getJobName(), JOBNAME_BINDING);
            protocolMarshaller.marshall(jobDetail.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(jobDetail.getJobQueue(), JOBQUEUE_BINDING);
            protocolMarshaller.marshall(jobDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(jobDetail.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(jobDetail.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(jobDetail.getStartedAt(), STARTEDAT_BINDING);
            protocolMarshaller.marshall(jobDetail.getStoppedAt(), STOPPEDAT_BINDING);
            protocolMarshaller.marshall(jobDetail.getDependsOn(), DEPENDSON_BINDING);
            protocolMarshaller.marshall(jobDetail.getJobDefinition(), JOBDEFINITION_BINDING);
            protocolMarshaller.marshall(jobDetail.getParameters(), PARAMETERS_BINDING);
            protocolMarshaller.marshall(jobDetail.getContainer(), CONTAINER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
