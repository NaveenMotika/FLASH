package com.nt.dao;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO {
 public int Insert(CustomerBO bo) throws Exception;
}
