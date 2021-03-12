package com.behaviorType.chainPattern;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest=new PurchaseRequest(1,3000,1);
        DepartmentApprover departmentApprover=new DepartmentApprover("黄老师");
        CollegeApprover collegeApprover=new CollegeApprover("李主任");
        ViceSchoolMasterApprover viceSchoolMasterApprover=new ViceSchoolMasterApprover("陈副校长");
        SchoolMasterApprover schoolMasterApprover=new SchoolMasterApprover("冯校长");

        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);//形成闭环

        departmentApprover.processRequest(purchaseRequest);
    }
}
