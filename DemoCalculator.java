package com.firstcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.firstcalculator.logic.Logic;

@RestController
public class DemoCalculator {
	
	public int calculator(@RequestParam(value="a1",required=true)int a1,
			@RequestParam(value="a2",required=true)int a2,
			@RequestParam(value="operation",required=true)String operation)
	{
		if(operation.equalsIgnoreCase("add"))
			return a1+a2;
		
		else if(operation.equalsIgnoreCase("sub"))
			return a1-a2;
		
		else if(operation.equalsIgnoreCase("mul"))
			return a1*a2;
		
		else
			return 0;
			
		
		
    }

	
	 @GetMapping("/calculator/add")//it is used to get the request for the specific method
	 public String calculate(@RequestParam(value="a1",required=true,defaultValue="1")int a1,
			 @RequestParam(value="a2",required=true,defaultValue="2")int a2)
	 {
		 return "<h2> The sum is"+Logic.addNo(a1, a2)+"<h2>";// call the CalculatorLogic class addNo() method
	 }
	 @GetMapping("/calculator/sub")//it is used to get the request for the specific method
	 public String calculate1(@RequestParam(value="a1",required=true,defaultValue="1")int a1,
			 @RequestParam(value="a2",required=true,defaultValue="2")int a2)
	 {
		 return "<h2> The substraction is"+Logic.subNo(a1, a2)+"<h2>";// call the CalculatorLogic class subNo() method
	 }
	 @GetMapping("/calculator/mul")//it is used to get the request for the specific method
	 public String calculate2(@RequestParam(value="a1",required=true,defaultValue="1")int a1,
			 @RequestParam(value="a2",required=true,defaultValue="2")int a2)
	 {
		 
		return "<h2> The multiplication is"+Logic.mulNo(a1, a2)+"<h2>";// call the CalculatorLogic class mulNo() method
	 }
	 @GetMapping("/calculator/div")//it is used to get the request for the specific method
	 public String calculate3(@RequestParam(value="a1",required=true,defaultValue="1")int a1,
			 @RequestParam(value="a2",required=true,defaultValue="2")int a2)
	 {
		 return "<h2> The division is"+Logic.divNo(a1, a2)+"<h2>";// call the CalculatorLogic class divNo() method
	 }

}
