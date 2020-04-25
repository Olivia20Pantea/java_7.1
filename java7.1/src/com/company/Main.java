package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={4,5,6,3,2,9};
        System.out.println(rec(arr,0));
    }
    static int rec(int[] arr,int i) {
        if(i == arr.length)
            return 0;
        else {
            if(i % 2 == 0)
                return  rec(arr, i + 1) - arr[i];
            else
                return rec(arr, i + 1)+ arr[i];
        }
    }
}
