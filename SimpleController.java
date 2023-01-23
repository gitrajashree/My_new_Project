package com.client.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("api2")
public class SimpleController {

	
	
	 @Autowired
	    private RestTemplate restTemplate;
	 
	   @GetMapping("/passed/{num}")
	    public String receivedValueForPrimeNo(@PathVariable("num") Integer num){
	        ResponseEntity<Integer> name = restTemplate.exchange("http://localhost:8761/api/value/"+num,HttpMethod.GET,null,Integer.class);
	        Prime primeValue = new Prime();
	        primeValue.setName(name.getBody());
	        int data = primeValue.getName(name.getBody());
	        int num1 = data;
	        boolean flag = false;
	        for (int i = 2; i <= num1 / 2; ++i) {
	            if (num1 % i == 0) {
	                flag = true;
	                break;
	            }
	        }
	        if (!flag)
	            return num1 + " is a prime number.";
	        else
	            return num1 + " is not a prime number.";
	    }
	
}

