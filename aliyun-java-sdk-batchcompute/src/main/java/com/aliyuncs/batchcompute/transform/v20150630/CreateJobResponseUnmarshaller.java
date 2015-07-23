/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.transform.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.CreateJobResponse;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;


public class CreateJobResponseUnmarshaller {

    public static CreateJobResponse unmarshall(CreateJobResponse createJobsResponse, UnmarshallerContext context) throws ServerException {
        HttpResponse httpResponse = context.getHttpResponse();
        createJobsResponse.setHttpResponse(httpResponse);

        try {
            String body = new String(httpResponse.getContent(), httpResponse.getEncoding());
            ObjectMapper mapper = new ObjectMapper();
            Map<String, String> map = mapper.readValue(body, Map.class);
            createJobsResponse.setJobId(map.get("ResourceId"));
        } catch (UnsupportedEncodingException e) {
            throw new ServerException("API.EncodeError", "encode response body error", createJobsResponse.getRequestId());
        } catch (IOException e) {
            throw new ServerException("API.EncodeError", "encode response body error", createJobsResponse.getRequestId());
        }
        return createJobsResponse;
    }
}