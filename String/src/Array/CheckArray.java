package Array;

import java.util.Scanner;

public class CheckArray {
	public static void main(String[] args) {
	        int arr[]=new int[15];
	        
	        System.out.println("Enter 15 numbers");
	        
	        Scanner sc=new Scanner(System.in);
	        
	        for(int i=0;i<15;++i)
	             arr[i]=sc.nextInt();
	        for(int i=0;i<arr.length;i++) {   
	            if(arr[i]>0){
	                System.out.println("Positive:"+arr[i]);               
	            }
	            else
	                 {
	                 System.out.println("Negative:"+arr[i]);  
	                 
	             }
	            if 
	            	(arr[i] % 2 ==0) {
	            	System.out.println("even"+arr[i]);
	            }
	            else {
	            	System.out.println("odd" + arr[i]);
	            }
	        }
	        }
	}
	        
