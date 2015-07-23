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
package com.aliyuncs.ots.model.v20130912;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceRequest extends RpcAcsRequest<GetInstanceResponse> {
	
	public GetInstanceRequest() {
		super("Ots", "2013-09-12", "GetInstance");
	}

	private String accept;

	private String versionName;

	public String getAccept() {
		return this.accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
		putHeaderParameter("Accept", accept);
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
		putHeaderParameter("VersionName", versionName);
	}

	@Override
	public Class<GetInstanceResponse> getResponseClass() {
		return GetInstanceResponse.class;
	}

}
