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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociatePhysicalConnectionToVirtualBorderRouterRequest extends RpcAcsRequest<AssociatePhysicalConnectionToVirtualBorderRouterResponse> {
	   

	private Long resourceOwnerId;

	private String circuitCode;

	private String vlanId;

	private String clientToken;

	private String enableIpv6;

	private String vbrId;

	private String peerGatewayIp;

	private String peerIpv6GatewayIp;

	private String peeringSubnetMask;

	private String localGatewayIp;

	private String peeringIpv6SubnetMask;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String physicalConnectionId;

	private String localIpv6GatewayIp;
	public AssociatePhysicalConnectionToVirtualBorderRouterRequest() {
		super("Vpc", "2016-04-28", "AssociatePhysicalConnectionToVirtualBorderRouter", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCircuitCode() {
		return this.circuitCode;
	}

	public void setCircuitCode(String circuitCode) {
		this.circuitCode = circuitCode;
		if(circuitCode != null){
			putQueryParameter("CircuitCode", circuitCode);
		}
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
		if(vlanId != null){
			putQueryParameter("VlanId", vlanId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getEnableIpv6() {
		return this.enableIpv6;
	}

	public void setEnableIpv6(String enableIpv6) {
		this.enableIpv6 = enableIpv6;
		if(enableIpv6 != null){
			putQueryParameter("EnableIpv6", enableIpv6);
		}
	}

	public String getVbrId() {
		return this.vbrId;
	}

	public void setVbrId(String vbrId) {
		this.vbrId = vbrId;
		if(vbrId != null){
			putQueryParameter("VbrId", vbrId);
		}
	}

	public String getPeerGatewayIp() {
		return this.peerGatewayIp;
	}

	public void setPeerGatewayIp(String peerGatewayIp) {
		this.peerGatewayIp = peerGatewayIp;
		if(peerGatewayIp != null){
			putQueryParameter("PeerGatewayIp", peerGatewayIp);
		}
	}

	public String getPeerIpv6GatewayIp() {
		return this.peerIpv6GatewayIp;
	}

	public void setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
		this.peerIpv6GatewayIp = peerIpv6GatewayIp;
		if(peerIpv6GatewayIp != null){
			putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
		}
	}

	public String getPeeringSubnetMask() {
		return this.peeringSubnetMask;
	}

	public void setPeeringSubnetMask(String peeringSubnetMask) {
		this.peeringSubnetMask = peeringSubnetMask;
		if(peeringSubnetMask != null){
			putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
		}
	}

	public String getLocalGatewayIp() {
		return this.localGatewayIp;
	}

	public void setLocalGatewayIp(String localGatewayIp) {
		this.localGatewayIp = localGatewayIp;
		if(localGatewayIp != null){
			putQueryParameter("LocalGatewayIp", localGatewayIp);
		}
	}

	public String getPeeringIpv6SubnetMask() {
		return this.peeringIpv6SubnetMask;
	}

	public void setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
		this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
		if(peeringIpv6SubnetMask != null){
			putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getPhysicalConnectionId() {
		return this.physicalConnectionId;
	}

	public void setPhysicalConnectionId(String physicalConnectionId) {
		this.physicalConnectionId = physicalConnectionId;
		if(physicalConnectionId != null){
			putQueryParameter("PhysicalConnectionId", physicalConnectionId);
		}
	}

	public String getLocalIpv6GatewayIp() {
		return this.localIpv6GatewayIp;
	}

	public void setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
		this.localIpv6GatewayIp = localIpv6GatewayIp;
		if(localIpv6GatewayIp != null){
			putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
		}
	}

	@Override
	public Class<AssociatePhysicalConnectionToVirtualBorderRouterResponse> getResponseClass() {
		return AssociatePhysicalConnectionToVirtualBorderRouterResponse.class;
	}

}
