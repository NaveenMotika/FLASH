package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controler.CustomerManementControle;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter cusname");
	String name=sc.next();
	System.out.println("enter addrs");
	String addr=sc.next();
	System.out.println("enter pamt");
	String pamt=sc.next();
	System.out.println("enter rate");
	String rate=sc.next();
	System.out.println("enter time");
	String time=sc.next();
	//create customervo object
	CustomerVO vo=new CustomerVO();
	vo.setCusaddrs(addr);
	vo.setCusname(name);
	vo.setPamt(pamt);
	vo.setRate(rate);
	vo.setTime(time);
	//create ioc container
	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/nt/cfgs/Applicationconf.xml");
	CustomerManementControle controller=factory.getBean("cuscont",CustomerManementControle.class);
	try{
		String resul=controller.processCustomer(vo);
		System.out.println(resul);
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("internal problem-- try agin");
	}
}
}
