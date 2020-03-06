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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MoveNavigationScriptRequest extends RpcAcsRequest<MoveNavigationScriptResponse> {
	   

	private String instanceId;

	private String navigationScriptId;

	private String targetCategoryId;
	public MoveNavigationScriptRequest() {
		super("VoiceNavigator", "2018-06-12", "MoveNavigationScript", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNavigationScriptId() {
		return this.navigationScriptId;
	}

	public void setNavigationScriptId(String navigationScriptId) {
		this.navigationScriptId = navigationScriptId;
		if(navigationScriptId != null){
			putQueryParameter("NavigationScriptId", navigationScriptId);
		}
	}

	public String getTargetCategoryId() {
		return this.targetCategoryId;
	}

	public void setTargetCategoryId(String targetCategoryId) {
		this.targetCategoryId = targetCategoryId;
		if(targetCategoryId != null){
			putQueryParameter("TargetCategoryId", targetCategoryId);
		}
	}

	@Override
	public Class<MoveNavigationScriptResponse> getResponseClass() {
		return MoveNavigationScriptResponse.class;
	}

}