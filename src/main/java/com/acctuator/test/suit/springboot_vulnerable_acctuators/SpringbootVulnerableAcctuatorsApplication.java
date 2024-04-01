package com.acctuator.test.suit.springboot_vulnerable_acctuators;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import java.lang.management.*; 
import javax.management.*; 

import org.hibernate.criterion.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootVulnerableAcctuatorsApplication {

	public static void main(String[] args) throws Exception{

    // String objectName = "com.acctuator.test.suit.springboot_vulnerable_acctuators.mbean:name=Ping";


	// 	MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
	// 	Ping mbean = new Ping();
	// 	ObjectName objname = new ObjectName(objectName);

	// 	mbs.registerMBean(mbean, objname);

		SpringApplication.run(SpringbootVulnerableAcctuatorsApplication.class, args);
	}

}
