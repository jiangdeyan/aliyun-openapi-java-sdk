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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyPostpaidDBInstanceSpecRequest extends RpcAcsRequest<ModifyPostpaidDBInstanceSpecResponse> {
	
	public ModifyPostpaidDBInstanceSpecRequest() {
		super("Rds", "2014-08-15", "ModifyPostpaidDBInstanceSpec");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String clientToken;

	private String dBInstanceId;

	private String dBInstanceClass;

	private Integer dBInstanceStorage;

	private String ownerAccount;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", String.valueOf(ownerId));
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", String.valueOf(resourceOwnerId));
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		putQueryParameter("DBInstanceId", dBInstanceId);
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		putQueryParameter("DBInstanceClass", dBInstanceClass);
	}

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		putQueryParameter("DBInstanceStorage", String.valueOf(dBInstanceStorage));
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	@Override
	public Class<ModifyPostpaidDBInstanceSpecResponse> getResponseClass() {
		return ModifyPostpaidDBInstanceSpecResponse.class;
	}

}
