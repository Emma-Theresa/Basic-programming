package com.batch4.utility;

public class SeriesSum {

	public static void main(String[] args) {
		int input=10;
		seriesSum(input);

	}

	private static void seriesSum(int input) {
      int value=0;
      int sum=0;
      for(int i=1;i<=input;i+=2) {
    	  if(value==0) {
    		  sum=sum+i;
              value=1;
    	  }
    	  else {
    		  sum=sum-i;
    		  value=0;
    	  }
      }
      System.out.println(sum);
		
	}

}
