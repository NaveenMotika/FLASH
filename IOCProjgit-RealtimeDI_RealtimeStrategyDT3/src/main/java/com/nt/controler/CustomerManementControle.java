package com.nt.controler;

import java.io.Serializable;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerManagementService;
import com.nt.vo.CustomerVO;

public class CustomerManementControle {
	private ICustomerManagementService cs;
	
	CustomerManementControle(ICustomerManagementService cs){
		this.cs=cs;
	}
	
	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO c=new CustomerDTO();
		c.setCusaddrs(vo.getCusaddrs());
		c.setCusname(vo.getCusname());
		c.setPamt(Float.parseFloat(vo.getPamt()));
	    c.setRate(Float.parseFloat(vo.getRate()));
	    c.setTime(Float.parseFloat(vo.getTime()));
		String s=cs.CalculateIntrest(c);
		return s;
	}

}
