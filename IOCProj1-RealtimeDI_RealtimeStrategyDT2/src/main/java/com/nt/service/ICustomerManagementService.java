package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerManagementService {
  public String CalculateIntrest(CustomerDTO dto) throws Exception;
}
