Amazing Number:

- Buzz Numbes:
Description

Integers can be even or odd. All numbers that end with 0, 2, 4, 6, or 8 are even; the rest are odd. However, numbers have many other properties,
you will learn about some of them in this project.

First, let's talk about Buzz numbers. They are numbers that are either divisible by 7 or end with 7. For example, the number 14 is a buzz number, 
since it is divisible by 7 without a remainder; the number 17 ends with 7, so it is also a buzz number. However, the number 75 is not a Buzz number, 
since it is neither divisible by 7 nor does it end with 7. The number 7 is a Buzz number too.

Your task at this stage is to write a program that prints the natural number parity and determines whether this number is a Buzz. The program should 
print why this number is a Buzz number.

Do you know how to determine whether a number is divisible by 7 or not? We have a great tip:

    Remove the last digit;
    Multiply the removed digit by 2 and subtract it from the remaining number.
    If the result of the subtraction can be divided by 7, then the initial number is divisible by 7. You can apply the whole sequence multiple times until 
you get a relatively small/easy-to-interpret subtraction result.

For example, take 196. We remove the last digit and get 19. We subtract 12 (the removed digit multiplied by 2) to get 7. Since the last left digit is 7, the 
number is multiple of 7. So 196 is a Buzz number!


-Duck Numbers:
Your next task is to determine whether a number is a Duck number. A Duck number is a positive number that contains zeroes. For example, 3210, 8050896, 70709 
are Duck numbers. Note that a number with a leading 0 is not a Duck number. So, numbers like 035 or 0212 are not Duck numbers. Although, 01203 is a Duck, since 
it has a trailing 0.

- Palindromic numbers:
In this stage, the program should check whether a number is a Palindromic one. A Palindromic number is symmetrical; in other words, it stays the same regardless 
of whether we read it from left or right. For example, 17371 is a palindromic number. 5 is also a palindromic number. 1234 is not. If read it from right, it becomes 
4321. Add this new property to our program.

In previous stages, the program could process only one number. From now on, the program should accept a request from a user, analyze and execute it. The program should 
print Enter a request instead of asking for a natural number. The program should also continue execution unless a user enters a terminate command. Let's make it 0 (zero).

Your program should welcome users and print the instructions. At this point, make your program execute two commands. If a user enters a natural number, the program should 
indicate the properties of that number. If a user enters zero, then the program should exit. If a user enters a negative number by mistake, print an error message.

-Gapful numbers:
In this stage, we are going to add one more property — Gapful numbers. It is a number that contains at least 3 digits and is divisible by the concatenation of its first and 
last digit without a remainder. 12 is not a Gapful number, as it has only two digits. 132 is a Gapful number, as 132 % 12 == 0. Another good example of a Gapful number is 7881,
 as 7881 % 71 == 0.

Until this stage, the program could process only one number at a time. Now, a user should be able to enter two numbers to obtain the properties of a list of numbers. Separate 
the numbers with one space. Space separates the first number in the list and the length of the list. For, example. 100 2 tells the program to process two numbers: 100 and 101.
 1 100 means that the program is about to process 100 numbers, starting from 1. If a user enters one number, the program should work the same as in the previous stages. The 
program should analyze a number and print its properties. As before, if a user enters a single 0 (zero), terminate the program. Information about each number should be printed 
in one line in the following format:

             140 is even, buzz, duck, gapful
             141 is odd, palindromic

So, the format is {number} is {property}, {property}, ... {property}

- Spy numbers:
In this stage, we will add another property that is called a Spy number. A number is said to be Spy if the sum of all digits is equal to the product of all digits.

Our program calculates the properties of numbers, and also knows how to process a list of numbers. But what if we want to find numbers that have a certain property? For example,
 in case we want to find ten Buzz numbers starting from 1000. We need to add a new request feature for this. In addition, add a new property — Spy numbers. These numbers hide well,
 so beware. Your task is to modify the program so that it can search for these numbers.

- Sunny and Square numbers:
N is a sunny number if N+1 is a perfect square number. In mathematics, a square number or a perfect square is an integer that is the square of an integer; in other words, it is the
 product of an integer with itself. For example, 9 is a square number, since it equals 32 and can be written as 3×3.

Our program can search for Spy and Palindromic numbers. What if we want to find all even Spy numbers? Or find all odd numbers among Palindromic numbers? Are there any Palindromics 
that are also Spies? In this stage, you will add the ability to search for several properties at once!

What if a user enters the same property twice by mistake? For example, they want to find all even numbers that are even? Just ignore this duplicate property. What about two mutually 
exclusive properties? For example, if a user wants to find even numbers that are odd. In this case, the program will initiate the search, but there are no such numbers. We need to 
make our program foolproof. If a request contains mutually exclusive properties, the program should abort this request and warn the user. There are three pairs of mutually exclusive 
properties. A request cannot include Even and Odd, Duck and Spy, Sunny and Square numbers.



-Jumping numbers:
A number is a Jumping number if the adjacent digits inside the number differ by 1. The difference between 9 and 0 is not considered as 1. Single-digit numbers are considered Jumping 
numbers. For example, 78987, and 4343456 are Jumping numbers, but 796 and 89098 are not.

In this stage, we will also remove the limitation on pending properties in a request. The program knows how to calculate ten properties of numbers, and it would be strange to limit 
the query to just two properties. Let's remove this limitation. Let the program indicate all properties for all numbers in the request.


Input Examples:
Welcome to Amazing Numbers!

Supported requests:
- enter a natural number to know its properties;
- enter two natural numbers to obtain the properties of the list:
  * the first parameter represents a starting number;
  * the second parameter shows how many consecutive numbers are to be processed;
- two natural numbers and properties to search for;
- separate the parameters with one space;
- enter 0 to exit.

Enter a request: > 1234567890

Properties of 1,234,567,890
        buzz: false
        duck: true
 palindromic: false
      gapful: true
         spy: false
      square: false
       sunny: false
     jumping: false
        even: true
         odd: false

Enter a request: > 1234567890 4

   1,234,567,890 is duck, gapful, even
   1,234,567,891 is odd
   1,234,567,892 is even
   1,234,567,893 is gapful, odd

Enter a request: > 1234567890 4 jumping

   1,234,567,898 is jumping, even
   2,101,010,101 is duck, jumping, odd
   2,101,010,121 is buzz, duck, gapful, jumping, odd
   2,101,010,123 is duck, jumping, odd

Enter a request: > 5000 5 duck spy

The request contains mutually exclusive properties: [DUCK, SPY]
There are no numbers with these properties.

Enter a request: > 5000 5 duck jumping

          10,101 is buzz, duck, palindromic, jumping, odd
          10,121 is duck, jumping, odd
          10,123 is duck, jumping, odd
          12,101 is duck, jumping, odd
          21,010 is duck, jumping, even

Enter a request: > 999 6 jumping odd palindromic

          10,101 is buzz, duck, palindromic, jumping, odd
          12,121 is palindromic, jumping, odd
          12,321 is palindromic, square, jumping, odd
          32,123 is buzz, palindromic, jumping, odd
          32,323 is palindromic, jumping, odd
          34,343 is palindromic, jumping, odd

Enter a request: 1 5 hot sunny

The property [HOT] is wrong.
Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING, EVEN, ODD]

Enter a request: exit

The first parameter should be a natural number or zero.

Enter a request: 0

Goodbye!

Process finished with exit code 0


- Happy and Sad numbers:
In number theory, a happy number is a number that reaches 1 after a sequence during which the number is replaced by the sum of each digit squares. For example, 13 is a happy number, 
as 12 + 32 = 10 which leads to 12 + 02 = 1. On the other hand, 4 is not a happy number because the sequence starts with 42 = 16, 12 + 62 = 37, and finally reaches 22 + 02 = 4. This 
is the number that started the sequence, so the process goes on in an infinite cycle. A number that is not happy is called Sad (or Unhappy).

Our program is finished. It can indicate many interesting properties of numbers, it knows how to calculate them. Now, when prompted, a user can have a list of number properties. To 
complete the program, let's add an ability to exclude a property from the search query. If a user puts a minus (-) before the property, exclude this property from the search query. 
For example, if a user specifies palindromic -duck, it means that they are looking for Palindromic numbers that are not Ducks.