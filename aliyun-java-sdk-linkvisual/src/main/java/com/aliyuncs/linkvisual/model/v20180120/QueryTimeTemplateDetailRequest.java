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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTimeTemplateDetailRequest extends RpcAcsRequest<QueryTimeTemplateDetailResponse> {
	   

	private String templateId;
	public QueryTimeTemplateDetailRequest() {
		super("Linkvisual", "2018-01-20", "QueryTimeTemplateDetail", "linkvisual");
		setMethod(MethodType.POST);
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<QueryTimeTemplateDetailResponse> getResponseClass() {
		return QueryTimeTemplateDetailResponse.class;
	}

}