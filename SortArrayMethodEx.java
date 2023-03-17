package ArrayEx;
import java.util.Arrays;
import java.util.*;
/*
public class SortArrayMethodEx{
public 	static	void main(String args[]){
//define array of integer type
int arr[]={90,50,49,76,25};
//sort()
Arrays.sort(arr);
System.out.println("elements are sorted in ascending order:");
//print
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}}//sort array method
*/

//2passing array to the functions
	//call max and minimum
	public class SortArrayMethodEx{
	//user define method
	public int max(int arr[]){
	int max=0;
	//int arr[4]=10 50 92 87
	//traverse array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element in array:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		SortArrayMethodEx p1= new SortArrayMethodEx();
		System.out.println("Maximum element in inputted array is="+p1.max(arr));
	}
	}