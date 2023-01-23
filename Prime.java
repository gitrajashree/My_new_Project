package com.client.demo.controller;

public class Prime {

	 private int Pvno;

	    public int getName(Integer Pvno) {
	        return Pvno;
	    }

	    public void setName(Integer Pvno) {
	        this.Pvno = Pvno;
	    }

	    @Override
	    public String toString() {
	        return "PrimeValue{" +
	                "Pvno='" + Pvno + '\'' +
	                '}';
	    }
}
