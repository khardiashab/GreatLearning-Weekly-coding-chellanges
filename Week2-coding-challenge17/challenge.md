## Description
Pre Knowledge for the question:

 

Binary numbers:

 As we know machines understand only 0’s and 1’s. Whatever we write will be converted to 0’s and 1’s. 

 

Example of Binary numbers: 0010, 10, 11, 0110, etc.,

Here the outcome of 1st and 2nd example are the same, but 3rd and 4th example above are not same, as the 0’s before 1 from left of any binary number can be ignored.

 

How to find integer value of a binary number:

 

Question: What is the integer value of binary number 10111 ?

Answer: 23

Explanation: 

We will start from the right of a binary number. The right most position is called 0th position and to it’s left is 1st position, left to 1st is 2nd position, and so on, however we will read binary no from left to right as usual

Therefore, in our case the position of 0 will be 3.

 

As we understand the position of the binary number, let's find the binary value in the integer.

 

To find the binary number value in integer, we need to find all the 1’s position in the binary number and find the 2 power of every position and add the result.

 

Binary number | 

position  | 

2 power of position with value 1 |

Final Value

1

0

1 x 20 = 1

1+2+4+16 

= 23

1

1

1 x 21 = 2

1

2

1 x 22 = 4

0

3

0 x 23 =0

1

4

1 x 24 = 16






LEFT SHIFT

 

The left shift by ‘n’ operation simply removes the ‘n’ leftmost digits in the binary number and places ‘n’ 0’s after the rightmost digit.

 

To do this operation in programming we use “<<” or “>>” followed by the number of digits to move left or right respectively. Example: 1001<<2 (Here 1001 is the number and making left shift by 2 positions)

 

The other feature compiler gives is that, we can give an integer number with the left or right shift operator and followed by the number of binary digits we want to shift. The compiler converts the integer value to binary, performs left or right shift as needed and gives the result of the binary number in integer format.

 

Example: x=10, and if we want to shift its binary form by 2 to the left, we need to do as below.

y = (x<<2)

The y value will be 40.

 

Write an algorithm to create a class Method and create two methods performleftShift and performRightShift. 
Make the method performleftShift with int as return type and make no.of shifts to be made as 1 by default. Do not take any input argument for the method performleftShift and perform left shift operation for predefined integer variable. 


Make the method performRightShift with no return type and two input arguments (val and digitstoshift) to perform right shift operation for integer.