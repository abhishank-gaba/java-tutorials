package arrays;

/*
 * Question Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

//How to write GOOD CODE!!!!!!!!
/*Resolve ambiguity 
-what sort of list is it? An array? A linked list 
-what does the array hold? Numbers, characters, strings?
-are the numbers integers 
-where did the numbers come from, are they IDs, values of something?
-how many customers are there?
*/
/* Design an algorithm
-what are the space and time complexity 
-what happens if there's a lot of data 
-does design cause other issues, what is time for insert, delete & find
-if other issues or limitations, did I make the right trade off? When is the tradeoff less optimal?
-if given specific data, did I leverage that info?


First build  brute force approach & then optimize 
*************Go slow!!!!!!!!!!
*/

/* write pseudocode 
 * use data structures 
 * ex: problem: finding minimum age for group of people 
 * define data structure to represent PERSON ---- object oriented desg
 */

//write code at a medium pace 
//test my code and fix any mistakes 

////////////This is the brute force approach with Order (n^2) complexity because of two for loops inside each other


import java.util.*;
import java.util.HashMap;

public class Array_Sum_Hash {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sumArray [] = { 2,7,11,15};
		int target = 18;
		int ans [] = twoSum (sumArray, target, hm);
		System.out.println(Arrays.toString(ans));

		
		
	}
	
	
public static int[] twoSum (int[] nums, int target, HashMap hm) {
	
	for (int i = 0; i < nums.length; i++) {
		if (hm.containsKey(target-nums[i]))
			return new int [] {(int) hm.get(target-nums[i]), i};
		hm.put(nums[i],i);
	}
		
		return new int [] {-1,-1}; 
	}

}
