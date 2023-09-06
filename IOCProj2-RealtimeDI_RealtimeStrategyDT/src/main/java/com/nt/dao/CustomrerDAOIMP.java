package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nt.bo.CustomerBO;

public final class CustomrerDAOIMP implements ICustomerDAO {
	private static final String REALTIMEDI_CUS_INSERT_QUEEY = "INSERT INTO REALTIME_CUSTOMER VALUES(CUSID_SEQUNCE.NEXTVAL,?,?,?,?,?,?)";
      private static ConnectonConnect cone;
      CustomrerDAOIMP(ConnectonConnect cone){
    	  this.cone=cone;
      }
	@Override
	public int Insert(CustomerBO bo) throws Exception {
		int count = 0;
		try (Connection con = cone.getCon();) {
			// create preparedstetemen object
			PreparedStatement p = con.prepareStatement(REALTIMEDI_CUS_INSERT_QUEEY);
			// set qurey param values
			p.setString(1, bo.getCusname());
			p.setString(2, bo.getCusaddrs());
			p.setFloat(3, bo.getPamt());
			p.setFloat(4, bo.getTime());
			p.setFloat(5, bo.getRate());
			p.setFloat(6, bo.getIntrestamt());
			count = p.executeUpdate();
		} catch (SQLException es) {
			es.printStackTrace();
			throw es;
		} catch (Exception e) {
			e.printStackTrace();
			// exception rethrowing
			throw e;
		}

		return count;
	}

}
