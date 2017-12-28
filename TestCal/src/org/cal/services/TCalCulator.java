package org.cal.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="AddingTwoNumbers", targetNamespace="")

public class TCalCulator {
	@WebMethod(operationName="Addmethod")
	@WebResult(name="calAdd")
	public int addition(int param1, int param2) {

		// TODO Auto-generated method stub
		return param1 + param2;

	}
}
