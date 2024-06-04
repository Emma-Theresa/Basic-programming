package com.batch4.utility;

public class Sumpower {

	public static void main(String[] args) {
		int input=3;
		seriesSum(input);

	}

	private static void seriesSum(int input) {
      int value=0;
      double sum=0;
      int power=1;
      for(int i=1;i<=input;i+=2) {
    	  if(value==0) {
    		  sum=sum+(Math.pow(i, power));
              value=1;
    	  }
    	  else {
    		  sum=sum-(Math.pow(i, power));
    		  value=0;
    	  }
    	  power++;
      }
      System.out.println(sum);
		
	}

	}


