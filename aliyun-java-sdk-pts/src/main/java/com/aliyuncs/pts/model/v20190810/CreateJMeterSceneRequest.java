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
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateJMeterSceneRequest extends RpcAcsRequest<CreateJMeterSceneResponse> {
	   

	private Map<Object,Object> scene;
	public CreateJMeterSceneRequest() {
		super("PTS", "2019-08-10", "CreateJMeterScene", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<Object,Object> getScene() {
		return this.scene;
	}

	public void setScene(Map<Object,Object> scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", new Gson().toJson(scene));
		}
	}

	@Override
	public Class<CreateJMeterSceneResponse> getResponseClass() {
		return CreateJMeterSceneResponse.class;
	}

}
