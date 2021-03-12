package com.behaviorType.chainPattern;

public class ViceSchoolMasterApprover extends Approver {

	public ViceSchoolMasterApprover(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		// TODO Auto-generated method stub
		if(purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " �� " + this.name + " ����");
		}else {
			approver.processRequest(purchaseRequest);
		}
	}
}
