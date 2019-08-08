/*
 * 
 * 
 * 2. Add Two Numbers
Medium

5636

1450

Favorite

Share
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
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


package linkedLists;

public class listNode {
	
	//List node object 
	int data;
	listNode next;
	listNode (int data) {
		this.data = data;
	}
	
}