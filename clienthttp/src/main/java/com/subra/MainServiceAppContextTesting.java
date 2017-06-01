package com.subra;


import org.httpinvoker.client.Calculation;
import org.httpinvoker.client.StateCapitalServiceIF;
import org.httpinvoker.client.model.CapitalOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainServiceAppContextTesting {
	
	public static void printStateInfo(StateCapitalServiceIF statecapitals, String state){
		System.out.println("The state is: " + state + " capital is " + statecapitals.getCapital(state));
	}
	
	public static void main(String[] args){
		/*
		//works final ApplicationContext context = new ClassPathXmlApplicationContext("test-servlet-context.xml");
		//final ApplicationContext context  = new ClassPathXmlApplicationContext("C:\\Users\\sdass\\STSworkspace\\see-httpinvoker\\src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml");
		final ApplicationContext context  = new FileSystemXmlApplicationContext("C:\\Users\\sdass\\STSworkspace\\see-httpinvoker\\src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml");
		System.out.println("The st hererew");
		StateCapitalServiceIF capitals = (StateCapitalServiceIF) context.getBean("stateCapitalBean");
		printStateInfo(capitals, "Alabama");
		printStateInfo(capitals, "Connecticut");
		*/
		ClientTesting();
	}
	
	public static void ClientTesting(){
		final ApplicationContext clientContext = new ClassPathXmlApplicationContext("client-beans.xml");
		Calculation clientCalculation = (Calculation) clientContext.getBean("calculationBeanClient");
		System.out.println ("cubes=" + clientCalculation.cube(5)) ;
		System.out.println ("getCalcInOut=" + clientCalculation.getCalcInOut(4));
		
		StateCapitalServiceIF clientCapital = (StateCapitalServiceIF) clientContext.getBean("CapitalBeanClient");
		System.out.println ("getCapital=" + clientCapital.getCapital("Connecticut"));
		System.out.println ("getCapitalInOut=" + clientCapital.getCapitalInOut("Alabama"));
		
	}

}
