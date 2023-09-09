package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class  CustomerMnagementServiceIMP implements ICustomerManagementService {
	private ICustomerDAO dao;

	public CustomerMnagementServiceIMP(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String CalculateIntrest(CustomerDTO dto) throws Exception {
		CustomerBO bo=new CustomerBO();
		float intAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		bo.setCusaddrs(dto.getCusaddrs());
		bo.setCusname(dto.getCusname());
		bo.setIntrestamt(intAmt);
		bo.setPamt(dto.getPamt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		int count=dao.Insert(bo);
		//ternary operation 
if(count==1) {
   return "custemer inserted succesfully "+" intrest = "+intAmt;
   
}
else
	return  "custemer not rinserted succesfully";
	}

}
