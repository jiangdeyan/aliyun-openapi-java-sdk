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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourcePoolRequest extends RpcAcsRequest<DescribeResourcePoolResponse> {
	   

	private String sceneType;
	public DescribeResourcePoolRequest() {
		super("PTS", "2019-08-10", "DescribeResourcePool", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
		if(sceneType != null){
			putQueryParameter("SceneType", sceneType);
		}
	}

	@Override
	public Class<DescribeResourcePoolResponse> getResponseClass() {
		return DescribeResourcePoolResponse.class;
	}

}
