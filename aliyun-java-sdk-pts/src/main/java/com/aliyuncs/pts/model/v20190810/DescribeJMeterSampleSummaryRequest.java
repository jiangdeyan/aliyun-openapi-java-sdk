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
public class DescribeJMeterSampleSummaryRequest extends RpcAcsRequest<DescribeJMeterSampleSummaryResponse> {
	   

	private String reportId;

	private Integer samplerId;
	public DescribeJMeterSampleSummaryRequest() {
		super("PTS", "2019-08-10", "DescribeJMeterSampleSummary", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
		if(reportId != null){
			putQueryParameter("ReportId", reportId);
		}
	}

	public Integer getSamplerId() {
		return this.samplerId;
	}

	public void setSamplerId(Integer samplerId) {
		this.samplerId = samplerId;
		if(samplerId != null){
			putQueryParameter("SamplerId", samplerId.toString());
		}
	}

	@Override
	public Class<DescribeJMeterSampleSummaryResponse> getResponseClass() {
		return DescribeJMeterSampleSummaryResponse.class;
	}

}
