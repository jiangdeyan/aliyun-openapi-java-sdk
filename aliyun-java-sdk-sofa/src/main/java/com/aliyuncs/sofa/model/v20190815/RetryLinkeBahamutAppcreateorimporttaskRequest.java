/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RetryLinkeBahamutAppcreateorimporttaskRequest extends RpcAcsRequest<RetryLinkeBahamutAppcreateorimporttaskResponse> {
	   

	private String tenantExternalId;

	private String taskId;
	public RetryLinkeBahamutAppcreateorimporttaskRequest() {
		super("SOFA", "2019-08-15", "RetryLinkeBahamutAppcreateorimporttask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantExternalId() {
		return this.tenantExternalId;
	}

	public void setTenantExternalId(String tenantExternalId) {
		this.tenantExternalId = tenantExternalId;
		if(tenantExternalId != null){
			putBodyParameter("TenantExternalId", tenantExternalId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<RetryLinkeBahamutAppcreateorimporttaskResponse> getResponseClass() {
		return RetryLinkeBahamutAppcreateorimporttaskResponse.class;
	}

}
